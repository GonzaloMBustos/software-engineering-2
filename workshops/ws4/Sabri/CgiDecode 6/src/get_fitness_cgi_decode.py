from src.cgi_decode_instrumented import cgi_decode_instrumented
from src.evaluate_condition import clear_maps, distances_true, distances_false, get_true_distance, get_false_distance
from src.individual import Individual

def get_fitness_cgi_decode(individual: Individual) -> float:
    # Borro la información de branch coverage de ejecuciones anteriores
    clear_maps()
    fitness = 0
    for test_case in individual.test_suite:
        try:
            cgi_decode_instrumented(test_case)
        except Exception:
            continue

    
    for c in range(1, 6):
        true_distance = get_true_distance(c)
        false_distance = get_false_distance(c)
        if true_distance is None or false_distance is None:
            fitness += 2
        else:
            fitness += normalize(true_distance) + normalize(false_distance)

    return fitness

def normalize(distance):
    return distance / (distance+1)
