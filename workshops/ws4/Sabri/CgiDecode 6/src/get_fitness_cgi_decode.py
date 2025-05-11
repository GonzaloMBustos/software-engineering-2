from src.cgi_decode_instrumented import cgi_decode_instrumented
from src.evaluate_condition import clear_maps, distances_true, distances_false
from src.individual import Individual

def get_fitness_cgi_decode(individual: Individual) -> float:
    # Borro la información de branch coverage de ejecuciones anteriores
    clear_maps()

    fitness = 0
    test_suite = individual.test_suite

    # Se ejecutan los casos de prueba en el test_suite
    for test_case in test_suite:
        try:
            # Se corre la función cgi_decode_instrumented con el test_case
            cgi_decode_instrumented(test_case)
        except Exception:
            # Si se lanza una excepción, la ignoramos y seguimos con el siguiente test_case
            pass

    # Calcular el fitness
    total_distance = 0.0
    num_branches = 0

    # Iteramos sobre las distancias de las ramas verdaderas
    for branch, distance in distances_true.items():
        total_distance += distance
        num_branches += 1

    # Iteramos sobre las distancias de las ramas falsas
    for branch, distance in distances_false.items():
        total_distance += distance
        num_branches += 1

    # Si no hay ramas, el fitness es 0 (para evitar división por cero)
    if num_branches == 0:
        return fitness

    # Calcular la distancia total acumulada y normalizar
    max_distance = len(distances_true) + len(distances_false)
    normalized_distance = total_distance / max_distance

    # El fitness es la distancia normalizada
    fitness = normalized_distance
    return fitness
