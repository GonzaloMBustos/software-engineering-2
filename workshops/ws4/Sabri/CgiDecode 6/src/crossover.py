from random import randint, random
from typing import List, Tuple
from src.individual import Individual


def single_point_crossover(parent1: Individual, parent2: Individual) -> Tuple[Individual, Individual]:
    """
    Realiza un cruce de un punto entre dos padres.
    """

    if len(parent1.test_suite) <= 1 or len(parent2.test_suite) <= 1:
        # Si no se puede hacer crossover, clonar los padres
        return Individual(list(parent1.test_suite)), Individual(list(parent2.test_suite))

    crossover_point = randint(1, len(parent1.test_suite) - 1)

    child1_suite = parent1.test_suite[:crossover_point] + parent2.test_suite[crossover_point:]
    child2_suite = parent2.test_suite[:crossover_point] + parent1.test_suite[crossover_point:]

    return Individual(child1_suite), Individual(child2_suite)


def crossover(crossover_function, crossover_prob, parent1: Individual, parent2: Individual) -> Tuple[
    Individual, Individual]:
    """
    Realiza el cruce entre dos padres, dada una probabilidad.
    """
    if random() < crossover_prob:
        return crossover_function(parent1, parent2)
    else:
        return Individual(list(parent1.test_suite)), Individual(list(parent2.test_suite))
