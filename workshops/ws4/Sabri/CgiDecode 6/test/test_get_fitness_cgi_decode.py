import unittest
from src.get_fitness_cgi_decode import get_fitness_cgi_decode
from src.individual import Individual


class TestFitnessFunction(unittest.TestCase):

    def test_get_fitness_cgi_decode(self):
        individual1 = Individual(test_suite=["%AA"])
        self.assertAlmostEqual(get_fitness_cgi_decode(individual1), 2.357142857142857)

        individual2 = Individual(test_suite=["\%AU"])
        self.assertAlmostEqual(get_fitness_cgi_decode(individual2), 3.03021978021978)

        individual3 = Individual(test_suite=["\%UU"])
        self.assertAlmostEqual(get_fitness_cgi_decode(individual3), 4.53021978021978)

        individual4 = Individual(test_suite=["+"])
        self.assertAlmostEqual(get_fitness_cgi_decode(individual4), 6.5)

        individual5 = Individual(test_suite=["Hello+Reader"])
        self.assertAlmostEqual(get_fitness_cgi_decode(individual5), 4.972222222222222)

        individual6 = Individual(test_suite=[""])
        self.assertAlmostEqual(get_fitness_cgi_decode(individual6), 8.5)

        individual7 = Individual(test_suite=["%A"])
        self.assertAlmostEqual(get_fitness_cgi_decode(individual7), 6.023809523809524)

        individual8 = Individual(test_suite=["%A", "%", "\%1+", "%+1", "a+%AA"])
        self.assertEqual(get_fitness_cgi_decode(individual8), 0)

        individual9 = Individual(test_suite=["%"])
        self.assertAlmostEqual(get_fitness_cgi_decode(individual9), 5.857142857142858)

if __name__ == "__main__":
    unittest.main()
