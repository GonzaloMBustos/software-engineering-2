from random import choice, randint
from string import printable
from typing import List

from src.individual import Individual


def get_random_character() -> str:
    return choice(printable)


def create_test_case() -> str:
    length = randint(0, 10)
    return ''.join(get_random_character() for _ in range(length))


def create_individual() -> Individual:
    num_cases = randint(1, 15)
    test_suite = [create_test_case() for _ in range(num_cases)]
    return Individual(test_suite)


def create_population(population_size: int) -> List[Individual]:
    population = [create_individual() for _ in range(population_size)]
    return population
