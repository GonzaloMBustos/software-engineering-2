from src.create_population import create_population
from src.crossover import crossover, single_point_crossover
from src.evaluate_population import evaluate_population
from src.mutate import mutate
from src.selection import selection, tournament_selection


class GeneticAlgorithm:
    def __init__(self):
        self.population_size = 100
        self.tournament_size = 5
        self.p_crossover = 0.70
        self.p_mutation = 0.20

        self.generation = 0
        self.best_individual = None
        self.fitness_best_individual = None

    def get_best_individual(self):
        return self.best_individual

    def get_fitness_best_individual(self):
        return self.fitness_best_individual

    def get_generation(self):
        return self.generation

    def covered_all_branches(self, fitness_individual):
        """
        Dado el fitness de un individuo, retorna True si cubre todos los objetivos.
        """
        # TODO: COMPLETAR
        return fitness_individual == 1.0

    def calculate_best_individual(self, population):
        """
        Guarda el mejor individuo y su fitness en las variables de instancia, self.best_individual y
        self.fitness_best_individual
        """
        best = max(population, key=lambda ind: ind.get_fitness())
        self.best_individual = best
        self.fitness_best_individual = best.get_fitness()

    def run(self):
        """
        Ejecuta el algoritmo genetico.
        """
        # Generar y evaluar la poblacion inicial
        population = create_population(self.population_size)
        evaluate_population(population)

        # Imprimir el mejor valor de fitness encontrado
        self.calculate_best_individual(population)
        print("Best fitness value:" + str(self.fitness_best_individual))

        # Continuar mientras la cantidad de generaciones es menor que 1000
        # y no haya ningun individuo que cubra todos los objetivos

        while self.generation < 1000 and not self.covered_all_branches(self.fitness_best_individual):
            # Producir una nueva poblacion basándose en la anterior, mediante crossover y mutation.
            new_population = []

            while len(new_population) < self.population_size:
                # selection
                parent1, parent2 = selection(
                    selection_function=tournament_selection,
                    tournament_size=self.tournament_size,
                    population=population
                )

                # crossover
                offspring1, offspring2 = crossover(
                    crossover_function=single_point_crossover,
                    crossover_prob=self.p_crossover,
                    parent1=parent1,
                    parent2=parent2
                )
                # mutation
                mutate(offspring1)
                mutate(offspring2)

                # Añadir los hijos a la nueva poblacion
                new_population.append(offspring1)
                new_population.append(offspring2)

            # Evaluar y reemplazar población
            evaluate_population(new_population)
            population = new_population

            self.generation += 1

            # Imprimir el mejor valor de fitness
            self.calculate_best_individual(population)
            print("New best fitness value: " + str(self.fitness_best_individual))

        # retornar el mejor individuo de la última generacion
        return self.best_individual
