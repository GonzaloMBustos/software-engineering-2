#!./venv/bin/python
import unittest
from src.cgi_decode import cgi_decode


class TestCgiDecode(unittest.TestCase):
    # def testExample(self):
    #     # TODO COMPLETAR
    #     cgi_decode("Hello World")
    #     self.assertTrue(True)
    #     self.assertFalse(False)
    #     self.assertEqual(True, False)
    
    def test_empty_string(self):
        self.assertEqual(cgi_decode(""), "")
    
    def test_one_character_string(self):
        self.assertEqual(cgi_decode("a"), "a")
    
    def test_string_with_plus(self):
        self.assertEqual(cgi_decode("Hello+World"), "Hello World")

    def test_string_by_hex(self):
        self.assertEqual(cgi_decode("%49%4E%47%45%32"), "INGE2")

    def test_string_by_hex_invalid_digit_high(self):
        # Don't know how to check the error message with assertRaises
        self.assertRaises(ValueError, cgi_decode, "%Z5")

    def test_string_by_hex_invalid_digit_low(self):
        self.assertRaises(ValueError, cgi_decode, "%5Z")
