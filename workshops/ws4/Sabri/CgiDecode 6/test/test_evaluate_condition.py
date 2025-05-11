#!./venv/bin/python
import unittest
import sys


from src.evaluate_condition import evaluate_condition, get_true_distance, get_false_distance, clear_maps

class TestEvaluateCondition(unittest.TestCase):

    def setUp(self):
        clear_maps()

    def test_eq_false(self):
        evaluate_condition(1, "Eq", 20, 10)
        self.assertEqual(get_true_distance(1), 10)
        self.assertEqual(get_false_distance(1), 0)

    def test_eq_true(self):
        evaluate_condition(2, "Eq", 20, 20)
        self.assertEqual(get_true_distance(2), 0)
        self.assertEqual(get_false_distance(2), 1)

    def test_ne_true(self):
        evaluate_condition(3, "Ne", 20, 10)
        self.assertEqual(get_true_distance(3), 0)
        self.assertEqual(get_false_distance(3), 10)

    def test_ne_false(self):
        evaluate_condition(4, "Ne", 20, 20)
        self.assertEqual(get_true_distance(4), 1)
        self.assertEqual(get_false_distance(4), 0)

    def test_le_true(self):
        evaluate_condition(5, "Le", 10, 20)
        self.assertEqual(get_true_distance(5), 0)
        self.assertEqual(get_false_distance(5), 11)

    def test_le_false(self):
        evaluate_condition(6, "Le", 20, 10)
        self.assertEqual(get_true_distance(6), 10)
        self.assertEqual(get_false_distance(6), 0)

    def test_le_equal(self):
        evaluate_condition(7, "Le", 20, 20)
        self.assertEqual(get_true_distance(7), 0)
        self.assertEqual(get_false_distance(7), 1)

    def test_lt_true(self):
        evaluate_condition(8, "Lt", 10, 20)
        self.assertEqual(get_true_distance(8), 0)
        self.assertEqual(get_false_distance(8), 10)

    def test_lt_false(self):
        evaluate_condition(9, "Lt", 20, 10)
        self.assertEqual(get_true_distance(9), 11)
        self.assertEqual(get_false_distance(9), 0)

    def test_lt_equal(self):
        evaluate_condition(10, "Lt", 20, 20)
        self.assertEqual(get_true_distance(10), 1)
        self.assertEqual(get_false_distance(10), 0)

    def test_in_empty_list(self):
        evaluate_condition(11, "In", 10, [])
        self.assertEqual(get_true_distance(11), sys.maxsize)
        self.assertEqual(get_false_distance(11), 0)

    def test_in_list_not_present(self):
        evaluate_condition(12, "In", 10, [1, 2, 3])
        self.assertEqual(get_true_distance(12), 7)
        self.assertEqual(get_false_distance(12), 0)

    def test_in_single(self):
        evaluate_condition(13, "In", 10, [10])
        self.assertEqual(get_true_distance(13), 0)
        self.assertEqual(get_false_distance(13), 1)

    def test_in_duplicates(self):
        evaluate_condition(14, "In", 10, [10, 10])
        self.assertEqual(get_true_distance(14), 0)
        self.assertEqual(get_false_distance(14), 1)

    def test_in_nearest(self):
        evaluate_condition(15, "In", 13, [11, 12, 18])
        self.assertEqual(get_true_distance(15), 1)
        self.assertEqual(get_false_distance(15), 0)
