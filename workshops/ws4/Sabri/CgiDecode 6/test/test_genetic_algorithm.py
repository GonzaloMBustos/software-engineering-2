# test/test_genetic_algorithm.py

#!./venv/bin/python
import unittest
from random import seed
from src.genetic_algorithm import GeneticAlgorithm
from src.coverage_utils import get_branch_coverage_cgi_decode


class TestGeneticAlgorithm(unittest.TestCase):
    def run_test_for_seed(self, seed_value):
        seed(seed_value)
        ga = GeneticAlgorithm()
        best_individual = ga.run()

        generations = ga.get_generation()
        fitness = best_individual.get_fitness()
        coverage = get_branch_coverage_cgi_decode(best_individual)

        print(f"[Seed {seed_value}] Generations: {generations}, Fitness: {fitness}, Branch Coverage: {coverage:.2f}")

        self.assertLessEqual(generations, 1000, "La cantidad de generaciones supera el máximo permitido.")
        self.assertEqual(fitness, ga.get_fitness_best_individual(), "El fitness reportado no coincide con el del mejor individuo.")
        self.assertGreaterEqual(coverage, 0.0, "La cobertura no puede ser menor que 0.")
        self.assertLessEqual(coverage, 1.0, "La cobertura no puede ser mayor que 1.")

    def test_seed_1(self):
        self.run_test_for_seed(1)

    def test_seed_123(self):
        self.run_test_for_seed(123)

    def test_seed_2025(self):
        self.run_test_for_seed(2025)


if __name__ == '__main__':
    unittest.main()
