import unittest
from src.cgi_decode_instrumented import cgi_decode_instrumented
from src.evaluate_condition import clear_maps, distances_true, distances_false


class TestCgiDecodeInstrumented(unittest.TestCase):

    def setUp(self):
        clear_maps()

    def test_basic_plus(self):
        result = cgi_decode_instrumented("Hello+World")
        self.assertEqual(result, "Hello World")
        self.assertEqual(distances_true, {1: 0, 2: 0, 3: 35})
        self.assertEqual(distances_false, {1: 0, 2: 0, 3: 0})

    def test_percent_encoding_valid(self):
        result = cgi_decode_instrumented("10%ED")
        self.assertEqual(result, "10í")
        self.assertIn(4, distances_true)
        self.assertIn(5, distances_true)

    def test_percent_invalid_high_digit(self):
        with self.assertRaises(ValueError):
            cgi_decode_instrumented('%G0')
        self.assertIn(4, distances_false)
        self.assertEqual(distances_false[4], 0)

    def test_percent_invalid_low_digit(self):
        with self.assertRaises(ValueError):
            cgi_decode_instrumented('%0G')
        self.assertIn(5, distances_false)
        self.assertEqual(distances_false[5], 0)

    def test_multiple_encodings(self):
        result = cgi_decode_instrumented("Hola%20Mundo%21")
        self.assertEqual(result, "Hola Mundo!")
        self.assertIn(4, distances_true)
        self.assertIn(5, distances_true)

    def test_incomplete_percent_encoding(self):
        with self.assertRaises(IndexError):
            cgi_decode_instrumented('%E')

