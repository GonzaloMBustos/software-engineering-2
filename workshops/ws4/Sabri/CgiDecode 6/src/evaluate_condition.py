import sys
from typing import Dict, Union

# Se inicializan mappings globales
distances_true: Dict[int, int] = {}
distances_false: Dict[int, int] = {}


def update_maps(condition_num: int, d_true: int, d_false: int):
    global distances_true, distances_false

    if condition_num in distances_true.keys():
        distances_true[condition_num] = min(
            distances_true[condition_num], d_true)
    else:
        distances_true[condition_num] = d_true

    if condition_num in distances_false.keys():
        distances_false[condition_num] = min(
            distances_false[condition_num], d_false)
    else:
        distances_false[condition_num] = d_false


def clear_maps():
    global distances_true, distances_false
    distances_true.clear()
    distances_false.clear()


def get_true_distance(condition_num: int) -> Union[int, None]:
    global distances_true
    if condition_num in distances_true.keys():
        return distances_true[condition_num]
    else:
        return None


def get_false_distance(condition_num: int) -> Union[int, None]:
    global distances_false
    if condition_num in distances_false.keys():
        return distances_false[condition_num]
    else:
        return None


def has_reached_condition(condition_num: int) -> bool:
    global distances_true, distances_false
    return condition_num in distances_true.keys() or condition_num in distances_false.keys()


from typing import Union, Dict


def evaluate_condition(condition_num: int, op: str, lhs: Union[str, int], rhs: Union[str, int, Dict, list]) -> bool:
    # Se convierte str a int
    if isinstance(lhs, str):
        if len(lhs) != 1:
            raise ValueError("lhs debe ser un carácter")
        lhs = ord(lhs)

    if isinstance(rhs, str):
        if len(rhs) != 1:
            raise ValueError("rhs debe ser un carácter")
        rhs = ord(rhs)

    if op == "Eq":
        result = lhs == rhs
        distance_true = 0 if result else abs(lhs - rhs)
        distance_false = 1 if result else 0

    elif op == "Ne":
        result = lhs != rhs
        distance_true = 0 if result else 1
        distance_false = abs(lhs - rhs) if result else 0

    elif op == "Lt":
        result = lhs < rhs
        distance_true = 0 if result else (lhs - rhs + 1)
        distance_false = (rhs - lhs) if result else 0

    elif op == "Gt":
        result = lhs > rhs
        distance_true = 0 if result else (rhs - lhs + 1)
        distance_false = 1 if result else 0

    elif op == "Le":
        result = lhs <= rhs
        distance_true = 0 if result else (lhs - rhs)
        distance_false = (rhs - lhs + 1) if result else 0

    elif op == "Ge":
        result = lhs >= rhs
        distance_true = 0 if result else (rhs - lhs + 1)
        distance_false = 1 if result else 0

    elif op == "In":
        if isinstance(rhs, dict):
            rhs_keys = [ord(k) for k in rhs.keys()]
            result = lhs in rhs_keys
            if result:
                distance_true = 0
                distance_false = 1
            else:
                distance_true = min(abs(lhs - k) for k in rhs_keys) if rhs_keys else sys.maxsize
                distance_false = 0
        elif isinstance(rhs, list):
            result = lhs in rhs
            if result:
                distance_true = 0
                distance_false = 1
            else:
                distance_true = min(abs(lhs - x) for x in rhs) if rhs else sys.maxsize
                distance_false = 0
        else:
            raise ValueError("rhs debe ser o bien una lista o un diccionario para aplicar la operación 'In'")

    else:
        raise ValueError("Operador no válido: {op}")

    update_maps(condition_num, distance_true, distance_false)
    return result
