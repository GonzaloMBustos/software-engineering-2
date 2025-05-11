from random import choice, random, randint
from typing import List

from src.create_population import create_test_case, get_random_character
from src.individual import Individual


def add_character(test_case: str) -> str:
    """
    Añade un caracter al azar a un test case.
    """
    if len(test_case) >= 10:
        return test_case
    index = randint(0, len(test_case))
    char = get_random_character()
    return test_case[:index] + char + test_case[index:]


def remove_character(test_case: str) -> str:
    """
    Elimina un caracter al azar de un test case.
    """
    if len(test_case) <= 1:
        return test_case
    index = randint(0, len(test_case) - 1)
    return test_case[:index] + test_case[index + 1:]


def modify_character(test_case: str) -> str:
    """
    Modifica un caracter al azar de un test case.
    """
    if len(test_case) == 0:
        return test_case
    index = randint(0, len(test_case) - 1)
    char = get_random_character()
    return test_case[:index] + char + test_case[index + 1:]


def add_test_case(individual: Individual) -> Individual:
    """
    Añade un test case al azar a un individuo.
    """
    if len(individual.test_suite) >= 15:
        return individual
    new_suite = list(individual.test_suite)
    new_suite.append(create_test_case())
    return Individual(new_suite)


def remove_test_case(individual: Individual) -> Individual:
    """
    Elimina un test case al azar de un individuo.
    """
    if len(individual.test_suite) <= 1:
        return individual
    index = randint(0, len(individual.test_suite) - 1)
    new_suite = list(individual.test_suite)
    del new_suite[index]
    return Individual(new_suite)


def modify_test_case(individual: Individual) -> Individual:
    """
    Modifica un test case al azar de un individuo.
    """
    if len(individual.test_suite) == 0:
        return individual
    index = randint(0, len(individual.test_suite) - 1)
    test_case = individual.test_suite[index]

    operations = []
    if len(test_case) < 10:
        operations.append(add_character)
    if len(test_case) > 1:
        operations.append(remove_character)
    if len(test_case) > 0:
        operations.append(modify_character)

    if not operations:
        return individual

    operation = choice(operations)
    modified_case = operation(test_case)
    new_suite = list(individual.test_suite)
    new_suite[index] = modified_case
    return Individual(new_suite)


def mutate(individual: Individual) -> Individual:
    """
    Aplica una mutación al azar a un individuo.
    """
    operations = [add_test_case, remove_test_case, modify_test_case]
    operation = choice(operations)
    return operation(individual)


def mutation(mutation_function, mutation_prob, individual: Individual) -> Individual:
    """
    Muta a un individuo con una probabilidad dada.
    """
    if random() < mutation_prob:
        return mutation_function(individual)
    else:
        return Individual(list(individual.test_suite))
