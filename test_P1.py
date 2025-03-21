import unittest
from P1 import exercise1, exercise2, exercise3_mutant, triangle, triangle_mutant, exercise5, exercise6, exercise7, exercise8, exercise9

class TestP1Functions(unittest.TestCase):

    def test_exercise2(self):
        rv = exercise2(1, 0)
        self.assertEqual(rv, 0)
    
    def test_exercise2_coverage(self):
        rv = exercise2(0, 1)
        self.assertEqual(rv, 0)

    def test_exercise3_mutant(self):
        rv = exercise3_mutant(0, 0)
        self.assertEqual(rv, 0)

    def test_exercise3_detect_mutant(self):
        rv = exercise3_mutant(1, 0)
        self.assertNotEqual(rv, 0)

    def test_triangle_detect_mutant(self):
        rv = triangle_mutant(1, 2, 1)
        self.assertNotEqual(rv, 2)
        
if __name__ == '__main__':
    unittest.main() 