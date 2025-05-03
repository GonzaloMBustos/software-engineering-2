#!./venv/bin/python
import unittest
from src.evaluate_condition import evaluate_condition, get_true_distance, get_false_distance, clear_maps


class TestEvaluateCondition(unittest.TestCase):

    K = 1

    def setUp(self):
        clear_maps()
    
    def test_evaluate_condition_eq_ints_equal(self):
        self.assertTrue(evaluate_condition(1, "Eq", 10, 10))
        self.assertEqual(get_true_distance(1), 0)
        self.assertEqual(get_false_distance(1), self.K)
    
    def test_evaluate_condition_eq_ints_not_equal(self):
        self.assertFalse(evaluate_condition(1, "Eq", 10, 20))
        self.assertEqual(get_true_distance(1), 10)
        self.assertEqual(get_false_distance(1), 0)

    def test_evaluate_condition_neq_ints_not_equal(self):
        self.assertTrue(evaluate_condition(1, "Ne", 10, 20))
        self.assertEqual(get_true_distance(1), 0)
        self.assertEqual(get_false_distance(1), 10)

    def test_evaluate_condition_neq_ints_equal(self):
        self.assertFalse(evaluate_condition(1, "Ne", 10, 10))
        self.assertEqual(get_true_distance(1), self.K)
        self.assertEqual(get_false_distance(1), 0)

    def test_evaluate_condition_le_ints_true(self):
        self.assertTrue(evaluate_condition(1, "Le", 10, 20))
        self.assertEqual(get_true_distance(1), 0)
        self.assertEqual(get_false_distance(1), 10 + self.K)
        
    def test_evaluate_condition_le_ints_false(self):
        self.assertFalse(evaluate_condition(1, "Le", 20, 10))
        self.assertEqual(get_true_distance(1), 10)
        self.assertEqual(get_false_distance(1), 0)

    def test_evaluate_condition_le_ints_equals(self):
        self.assertTrue(evaluate_condition(1, "Le", 20, 20))
        self.assertEqual(get_true_distance(1), 0)
        self.assertEqual(get_false_distance(1), self.K)
        
    def test_evaluate_condition_lt_ints_true(self):
        self.assertTrue(evaluate_condition(1, "Lt", 10, 20))
        self.assertEqual(get_true_distance(1), 0)
        self.assertEqual(get_false_distance(1), 10)

    def test_evaluate_condition_lt_ints_false(self):
        self.assertFalse(evaluate_condition(1, "Lt", 20, 10))
        self.assertEqual(get_true_distance(1), 10 + self.K)
        self.assertEqual(get_false_distance(1), 0)
    
    def test_evaluate_condition_lt_ints_equals(self):
        self.assertFalse(evaluate_condition(1, "Lt", 20, 20))
        self.assertEqual(get_true_distance(1), self.K)
        self.assertEqual(get_false_distance(1), 0)
    
    def test_evaluate_condition_ge_ints_true(self):
        self.assertTrue(evaluate_condition(1, "Ge", 20, 10))
        self.assertEqual(get_true_distance(1), 0)
        self.assertEqual(get_false_distance(1), 10 + self.K)
        
    def test_evaluate_condition_ge_ints_false(self):
        self.assertFalse(evaluate_condition(1, "Ge", 10, 20))
        self.assertEqual(get_true_distance(1), 10)
        self.assertEqual(get_false_distance(1), 0)

    def test_evaluate_condition_ge_ints_equals(self):
        self.assertTrue(evaluate_condition(1, "Ge", 20, 20))
        self.assertEqual(get_true_distance(1), 0)
        self.assertEqual(get_false_distance(1), self.K)
        
    def test_evaluate_condition_gt_ints_true(self):
        self.assertTrue(evaluate_condition(1, "Gt", 20, 10))
        self.assertEqual(get_true_distance(1), 0)
        self.assertEqual(get_false_distance(1), 10)

    def test_evaluate_condition_gt_ints_false(self):
        self.assertFalse(evaluate_condition(1, "Gt", 10, 20))
        self.assertEqual(get_true_distance(1), 10 + self.K)
        self.assertEqual(get_false_distance(1), 0)
    
    def test_evaluate_condition_gt_ints_equals(self):
        self.assertFalse(evaluate_condition(1, "Gt", 20, 20))
        self.assertEqual(get_true_distance(1), self.K)
        self.assertEqual(get_false_distance(1), 0)
        
    # Character comparisons
    # ===================

    # Test equality of same characters returns true
    def test_evaluate_condition_eq_chars_true(self):
        self.assertTrue(evaluate_condition(1, "Eq", "a", "a"))
        self.assertEqual(get_true_distance(1), 0)
        self.assertEqual(get_false_distance(1), self.K)

    # Test equality of different characters returns false
    def test_evaluate_condition_eq_chars_false(self):
        self.assertFalse(evaluate_condition(1, "Eq", "a", "b"))
        self.assertEqual(get_true_distance(1), 1)
        self.assertEqual(get_false_distance(1), 0)

    # Test inequality of different characters returns true
    def test_evaluate_condition_ne_chars_true(self):
        self.assertTrue(evaluate_condition(1, "Ne", "a", "b"))
        self.assertEqual(get_true_distance(1), 0)
        self.assertEqual(get_false_distance(1), 1)

    # Test inequality of same characters returns false
    def test_evaluate_condition_ne_chars_false(self):
        self.assertFalse(evaluate_condition(1, "Ne", "a", "a"))
        self.assertEqual(get_true_distance(1), self.K)
        self.assertEqual(get_false_distance(1), 0)

    # Test less than with character that comes before returns true
    def test_evaluate_condition_lt_chars_true(self):
        self.assertTrue(evaluate_condition(1, "Lt", "a", "b"))
        self.assertEqual(get_true_distance(1), 0)
        self.assertEqual(get_false_distance(1), 1)

    # Test less than with character that comes after returns false
    def test_evaluate_condition_lt_chars_false(self):
        self.assertFalse(evaluate_condition(1, "Lt", "b", "a"))
        self.assertEqual(get_true_distance(1), 2)
        self.assertEqual(get_false_distance(1), 0)

    # Test greater than with character that comes after returns true
    def test_evaluate_condition_gt_chars_true(self):
        self.assertTrue(evaluate_condition(1, "Gt", "b", "a"))
        self.assertEqual(get_true_distance(1), 0)
        self.assertEqual(get_false_distance(1), 1)

    # Test greater than with character that comes before returns false
    def test_evaluate_condition_gt_chars_false(self):
        self.assertFalse(evaluate_condition(1, "Gt", "a", "b"))
        self.assertEqual(get_true_distance(1), 2)
        self.assertEqual(get_false_distance(1), 0)

    # Test less than or equal with character that comes before returns true
    def test_evaluate_condition_le_chars_true(self):
        self.assertTrue(evaluate_condition(1, "Le", "a", "b"))
        self.assertEqual(get_true_distance(1), 0)
        self.assertEqual(get_false_distance(1), 2)

    # Test less than or equal with character that comes after returns false
    def test_evaluate_condition_le_chars_false(self):
        self.assertFalse(evaluate_condition(1, "Le", "b", "a"))
        self.assertEqual(get_true_distance(1), 1)
        self.assertEqual(get_false_distance(1), 0)

    # Test greater than or equal with character that comes after returns true
    def test_evaluate_condition_ge_chars_true(self):
        self.assertTrue(evaluate_condition(1, "Ge", "b", "a"))
        self.assertEqual(get_true_distance(1), 0)
        self.assertEqual(get_false_distance(1), 2)

    # Test greater than or equal with character that comes before returns false
    def test_evaluate_condition_ge_chars_false(self):
        self.assertFalse(evaluate_condition(1, "Ge", "a", "b"))
        self.assertEqual(get_true_distance(1), 1)
        self.assertEqual(get_false_distance(1), 0)

    # Character-Dictionary comparisons
    # ==============================

    # Test equality when character exists in dictionary returns true
    def test_evaluate_condition_eq_char_dict_true(self):
        self.assertTrue(evaluate_condition(1, "Eq", "a", {"a": 1, "b": 2}))
        self.assertEqual(get_true_distance(1), 0)
        self.assertEqual(get_false_distance(1), self.K)

    # Test equality when character doesn't exist in dictionary returns false
    def test_evaluate_condition_eq_char_dict_false(self):
        self.assertFalse(evaluate_condition(1, "Eq", "c", {"a": 1, "b": 2}))
        self.assertEqual(get_true_distance(1), 1)
        self.assertEqual(get_false_distance(1), 0)

    # Test inequality when character doesn't exist in dictionary returns true
    def test_evaluate_condition_ne_char_dict_true(self):
        self.assertTrue(evaluate_condition(1, "Ne", "c", {"a": 1, "b": 2}))
        self.assertEqual(get_true_distance(1), 0)
        self.assertEqual(get_false_distance(1), 2)

    # Test inequality when character exists in dictionary returns false
    def test_evaluate_condition_ne_char_dict_false(self):
        self.assertFalse(evaluate_condition(1, "Ne", "a", {"a": 1}))
        self.assertEqual(get_true_distance(1), self.K)
        self.assertEqual(get_false_distance(1), 0)

    # Test less than when character comes before dictionary values returns true
    def test_evaluate_condition_lt_char_dict_true(self):
        self.assertTrue(evaluate_condition(1, "Lt", "a", {"b": 1, "c": 2}))
        self.assertEqual(get_true_distance(1), 0)
        self.assertEqual(get_false_distance(1), 1)

    # Test less than when character comes after dictionary values returns false
    def test_evaluate_condition_lt_char_dict_false(self):
        self.assertFalse(evaluate_condition(1, "Lt", "c", {"a": 1, "b": 2}))
        self.assertEqual(get_true_distance(1), 1 + self.K)
        self.assertEqual(get_false_distance(1), 0)

    # Test greater than when character comes after dictionary values returns true
    def test_evaluate_condition_gt_char_dict_true(self):
        self.assertTrue(evaluate_condition(1, "Gt", "c", {"a": 1, "b": 2}))
        self.assertEqual(get_true_distance(1), 0)
        self.assertEqual(get_false_distance(1), 1)

    # Test greater than when character comes before dictionary values returns false
    def test_evaluate_condition_gt_char_dict_false(self):
        self.assertFalse(evaluate_condition(1, "Gt", "a", {"b": 1, "c": 2}))
        self.assertEqual(get_true_distance(1), 1 + self.K)
        self.assertEqual(get_false_distance(1), 0)

    # Test less than or equal when character comes before dictionary values returns true
    def test_evaluate_condition_le_char_dict_true(self):
        self.assertTrue(evaluate_condition(1, "Le", "a", {"b": 1, "c": 2}))
        self.assertEqual(get_true_distance(1), 0)
        self.assertEqual(get_false_distance(1), 2)

    # Test less than or equal when character comes after dictionary values returns false
    def test_evaluate_condition_le_char_dict_false(self):
        self.assertFalse(evaluate_condition(1, "Le", "c", {"a": 1, "b": 2}))
        self.assertEqual(get_true_distance(1), 1)
        self.assertEqual(get_false_distance(1), 0)

    # Test greater than or equal when character comes after dictionary values returns true
    def test_evaluate_condition_ge_char_dict_true(self):
        self.assertTrue(evaluate_condition(1, "Ge", "c", {"a": 1, "b": 2}))
        self.assertEqual(get_true_distance(1), 0)
        self.assertEqual(get_false_distance(1), 1 + self.K)

    # Test greater than or equal when character comes before dictionary values returns false
    def test_evaluate_condition_ge_char_dict_false(self):
        self.assertFalse(evaluate_condition(1, "Ge", "a", {"b": 1, "c": 2}))
        self.assertEqual(get_true_distance(1), 1)
        self.assertEqual(get_false_distance(1), 0)

    # Test in operator when character exists in dictionary returns true
    def test_evaluate_condition_in_char_dict_true(self):
        self.assertTrue(evaluate_condition(1, "In", "a", {"a": 1, "b": 2}))
        self.assertEqual(get_true_distance(1), 0)
        self.assertEqual(get_false_distance(1), self.K)

    # Test in operator when character doesn't exist in dictionary returns false
    def test_evaluate_condition_in_char_dict_false(self):
        self.assertFalse(evaluate_condition(1, "In", "c", {"a": 1, "b": 2}))
        self.assertEqual(get_true_distance(1), 1)
        self.assertEqual(get_false_distance(1), 0)

    # Error cases
    # ==========

    # Test invalid operator raises ValueError
    def test_evaluate_condition_invalid_operator(self):
        with self.assertRaises(ValueError):
            evaluate_condition(1, "Invalid", 1, 2)
    
    # Test invalid operator raises ValueError
    def test_evaluate_condition_invalid_operator(self):
        with self.assertRaises(ValueError):
            evaluate_condition(1, "Invalid", "b", "a")

    # Test invalid left hand side (string longer than 1 char) raises ValueError
    def test_evaluate_condition_invalid_lhs(self):
        with self.assertRaises(ValueError):
            evaluate_condition(1, "Eq", "ab", "a")

    # Test invalid right hand side for integer comparison raises ValueError
    def test_evaluate_condition_invalid_rhs_int(self):
        with self.assertRaises(ValueError):
            evaluate_condition(1, "Eq", 1, "a")

    # Test invalid right hand side for character comparison raises ValueError
    def test_evaluate_condition_invalid_rhs_char(self):
        with self.assertRaises(ValueError):
            evaluate_condition(1, "Eq", "a", "ab")
        
# FALTA MANEJAR EL CASE DE QUE EL RHS ES UN DICCIONARIO VACIO