from random import sample
from typing import Tuple, List
from src.individual import Individual

def tournament_selection(population: List[Individual], tournament_size: int) -> Individual:
    """
    Selecciona un individuo de la poblacion usando seleccion por torneo.
    El tamaño del torneo es el número de individuos que competirán en el mismo.
    """
    tournament = sample(population, tournament_size)
    winner = min(tournament, key=lambda ind: ind.get_fitness())
    return winner

def selection(selection_function, tournament_size: int, population: List[Individual]) -> Tuple[Individual, Individual]:
    """
    Selecciona dos individuos de la población usando la función de selección proporcionada.
    """
    parent1 = selection_function(population, tournament_size)
    parent2 = selection_function(population, tournament_size)
    return parent1, parent2
