import sys
from typing import Dict, Union

# Inicializar mappings globales
distances_true: Dict[int, int] = {}
distances_false: Dict[int, int] = {}
K = 1


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


def evaluate_condition(condition_num: int, op: str, lhs: Union[str, int], rhs: Union[str, int, Dict]) -> bool:
    # TODO: COMPLETAR
    distance_true = 0
    distance_false = 0
    comparison_result = False
    if isinstance(lhs, int):
        if isinstance(rhs, int):
            if op == "Eq":
                comparison_result = lhs == rhs
                if comparison_result:
                    distance_true = 0
                    distance_false = K
                else:
                    distance_true = abs(lhs - rhs)
                    distance_false = 0
            elif op == "Ne":
                comparison_result = lhs != rhs
                if comparison_result:
                    distance_true = 0
                    distance_false = abs(lhs - rhs)
                else:
                    distance_true = K
                    distance_false = 0
            elif op == "Lt":
                comparison_result = lhs < rhs
                if comparison_result:
                    distance_true = 0
                    distance_false = (rhs - lhs)
                else:
                    distance_true = (lhs - rhs) + K
                    distance_false = 0
            elif op == "Gt":
                comparison_result = lhs > rhs
                if comparison_result:
                    distance_true = 0
                    distance_false = (lhs - rhs)
                else:
                    distance_true = (rhs - lhs) + K
                    distance_false = 0
            elif op == "Le":
                comparison_result = lhs <= rhs
                if comparison_result:
                    distance_true = 0
                    distance_false = (rhs - lhs) + K
                else:
                    distance_true = (lhs - rhs)
                    distance_false = 0
            elif op == "Ge":
                comparison_result = lhs >= rhs
                if comparison_result:
                    distance_true = 0
                    distance_false = (lhs - rhs) + K
                else:
                    distance_true = (rhs - lhs)
                    distance_false = 0
            else:
                raise ValueError(f"Invalid operator: {op}")
        else:
            raise ValueError(f"Invalid expression: {rhs}")
    elif isinstance(lhs, str) and len(lhs) == 1:
        if isinstance(rhs, str) and len(rhs) == 1:
            if op == "Eq":
                comparison_result = ord(lhs) == ord(rhs)
                if comparison_result:
                    distance_true = 0
                    distance_false = K
                else:
                    distance_true = abs(ord(lhs) - ord(rhs))
                    distance_false = 0
            elif op == "Ne":
                comparison_result = ord(lhs) != ord(rhs)
                if comparison_result:
                    distance_true = 0
                    distance_false = abs(ord(lhs) - ord(rhs))
                else:
                    distance_true = K
                    distance_false = 0
            elif op == "Lt":
                comparison_result = ord(lhs) < ord(rhs)
                if comparison_result:
                    distance_true = 0
                    distance_false = (ord(rhs) - ord(lhs))
                else:
                    distance_true = (ord(lhs) - ord(rhs)) + K
                    distance_false = 0
            elif op == "Gt":
                comparison_result = ord(lhs) > ord(rhs)
                if comparison_result:
                    distance_true = 0
                    distance_false = (ord(lhs) - ord(rhs))
                else:
                    distance_true = (ord(rhs) - ord(lhs)) + K
                    distance_false = 0
            elif op == "Le":
                comparison_result = ord(lhs) <= ord(rhs)
                if comparison_result:
                    distance_true = 0
                    distance_false = (ord(rhs) - ord(lhs)) + K
                else:
                    distance_true = (ord(lhs) - ord(rhs))
                    distance_false = 0
            elif op == "Ge":
                comparison_result = ord(lhs) >= ord(rhs)
                if comparison_result:
                    distance_true = 0
                    distance_false = (ord(lhs) - ord(rhs)) + K
                else:
                    distance_true = (ord(rhs) - ord(lhs))
                    distance_false = 0
            else:
                raise ValueError(f"Invalid operator: {op}")
        elif isinstance(rhs, Dict): # dict or Dict or Dict[str, int]
            distances_true = []
            distances_false = []
            comparison_result = False
            if op == "Eq":
                for key in rhs.keys():
                    comparison_result = comparison_result or ord(lhs) == ord(key)
                    distances_true.append(abs(ord(lhs) - ord(key)))
                    distances_false.append(K)
            elif op == "Ne":
                for key in rhs.keys():
                    distances_true.append(K)
                    distances_false.append(abs(ord(lhs) - ord(key)))
                    if ord(lhs) != ord(key):
                        comparison_result = True
                        break
            elif op == "Lt":
                for key in rhs.keys():
                    comparison_result = comparison_result or ord(lhs) < ord(key)
                    distances_true.append(abs(ord(lhs) - ord(key)) + K)
                    distances_false.append(ord(key) - ord(lhs))
            elif op == "Gt":
                for key in rhs.keys():
                    comparison_result = comparison_result or ord(lhs) > ord(key)
                    distances_true.append(abs(ord(key) - ord(lhs)) + K)
                    distances_false.append(ord(lhs) - ord(key))
            elif op == "Le":
                for key in rhs.keys():
                    comparison_result = comparison_result or ord(lhs) <= ord(key)
                    distances_true.append(abs(ord(lhs) - ord(key)))
                    distances_false.append(ord(key) - ord(lhs) + K)
            elif op == "Ge":
                for key in rhs.keys():
                    comparison_result = comparison_result or ord(lhs) >= ord(key)
                    distances_true.append(abs(ord(key) - ord(lhs)))
                    distances_false.append(ord(lhs) - ord(key) + K)
            elif op == "In":
                comparison_result = lhs in rhs
                distances_false.append(K)
                for key in rhs.keys():
                    distances_true.append(abs(ord(lhs) - ord(key)))
            else:
                raise ValueError(f"Invalid operator: {op}")
            
            if comparison_result:
                distance_true = 0
                distance_false = min(distances_false)
            else:
                distance_true = min(distances_true)
                distance_false = 0
        else:
            raise ValueError(f"Invalid expression: {rhs}")
    else:
        raise ValueError(f"Invalid expression: {lhs}")
    
    update_maps(condition_num, distance_true, distance_false)
    return comparison_result
