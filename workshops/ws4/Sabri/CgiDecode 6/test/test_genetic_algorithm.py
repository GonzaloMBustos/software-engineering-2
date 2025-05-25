#!./venv/bin/python
import unittest
from random import seed
from src.genetic_algorithm import GeneticAlgorithm


class TestGeneticAlgorithm(unittest.TestCase):

    def test_run_with_seed_1(self):
        seed(1)
        genetic_algorithm = GeneticAlgorithm()
        best_individual = genetic_algorithm.run()

        total_generations = genetic_algorithm.get_generation()
        best_fitness = best_individual.get_fitness()
        coverage = best_fitness

        print(f"[Seed 1] Generations: {total_generations}, Fitness: {best_fitness}, Coverage: {coverage}")

        self.assertTrue(total_generations <= 1000, "La cantidad de generaciones no debe exceder 1000.")
        self.assertEqual(best_fitness, genetic_algorithm.get_fitness_best_individual(),
                         "El fitness del mejor individuo debe coincidir con el fitness reportado por el algoritmo.")
        self.assertGreaterEqual(coverage, 0.0, "La cobertura no puede ser negativa.")
        self.assertLessEqual(coverage, 1.0, "La cobertura no puede ser mayor que 1.0.")

    def test_run_with_seed_123(self):
        seed(123)
        genetic_algorithm = GeneticAlgorithm()
        best_individual = genetic_algorithm.run()

        total_generations = genetic_algorithm.get_generation()
        best_fitness = best_individual.get_fitness()
        coverage = best_fitness

        print(f"[Seed 123] Generations: {total_generations}, Fitness: {best_fitness}, Coverage: {coverage}")

        self.assertTrue(total_generations <= 1000, "La cantidad de generaciones no debe exceder 1000.")
        self.assertEqual(best_fitness, genetic_algorithm.get_fitness_best_individual(),
                         "El fitness del mejor individuo debe coincidir con el fitness reportado por el algoritmo.")
        self.assertGreaterEqual(coverage, 0.0, "La cobertura no puede ser negativa.")
        self.assertLessEqual(coverage, 1.0, "La cobertura no puede ser mayor que 1.0.")

    def test_run_with_seed_2025(self):
        seed(2025)
        genetic_algorithm = GeneticAlgorithm()
        best_individual = genetic_algorithm.run()

        total_generations = genetic_algorithm.get_generation()
        best_fitness = best_individual.get_fitness()
        coverage = best_fitness

        print(f"[Seed 2025] Generations: {total_generations}, Fitness: {best_fitness}, Coverage: {coverage}")

        self.assertTrue(total_generations <= 1000, "La cantidad de generaciones no debe exceder 1000.")
        self.assertEqual(best_fitness, genetic_algorithm.get_fitness_best_individual(),
                         "El fitness del mejor individuo debe coincidir con el fitness reportado por el algoritmo.")
        self.assertGreaterEqual(coverage, 0.0, "La cobertura no puede ser negativa.")
        self.assertLessEqual(coverage, 1.0, "La cobertura no puede ser mayor que 1.0.")


if __name__ == '__main__':
    unittest.main()
