#!./venv/bin/python
import unittest
from src.cgi_decode import cgi_decode


class TestCgiDecode(unittest.TestCase):
    def test_decode_valid_string(self):
        cgi_decode("Hello World +  10%ED")
        self.assertTrue("Hello World 10í")

    def test_invalid_percent_encoding_with_non_hex_high_digit(self):
        with self.assertRaises(ValueError):
            cgi_decode('%G0')

    def test_invalid_percent_encoding_with_non_hex_low_digit(self):
        with self.assertRaises(ValueError):
            cgi_decode('%0G')