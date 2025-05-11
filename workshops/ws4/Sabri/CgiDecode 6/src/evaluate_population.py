from typing import List
from src.get_fitness_cgi_decode import get_fitness_cgi_decode
from src.individual import Individual


def get_branch_coverage(individual):
    fitness = individual.get_fitness()
    return fitness


def evaluate_population(population: List[Individual]):
    """
    Evalúa la población y asigna el valor de fitness a cada individuo.
    """
    for individual in population:
        fitness = get_fitness_cgi_decode(individual)
        individual.set_fitness(fitness)
