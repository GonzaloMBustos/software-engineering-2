from src.evaluate_condition import evaluate_condition


def cgi_decode_instrumented(s: str):
    """Decode the CGI-encoded string `s`, usando evaluate_condition para instrumentación."""

    hex_values = {
        '0': 0, '1': 1, '2': 2, '3': 3, '4': 4,
        '5': 5, '6': 6, '7': 7, '8': 8, '9': 9,
        'a': 10, 'b': 11, 'c': 12, 'd': 13, 'e': 14, 'f': 15,
        'A': 10, 'B': 11, 'C': 12, 'D': 13, 'E': 14, 'F': 15,
    }

    t = ""
    i = 0
    while evaluate_condition(1, "Lt", i, len(s)):  # i < len(s)
        c = s[i]
        if evaluate_condition(2, "Eq", c, '+'):  # c == '+'
            t += ' '
        elif evaluate_condition(3, "Eq", c, '%'):  # c == '%'
            digit_high, digit_low = s[i + 1], s[i + 2]
            i += 2
            if evaluate_condition(4, "In", digit_high, hex_values):  # digit_high in hex_values
                if evaluate_condition(5, "In", digit_low, hex_values):  # digit_low in hex_values
                    v = hex_values[digit_high] * 16 + hex_values[digit_low]
                    t += chr(v)
                else:
                    raise ValueError("Invalid encoding: digit low is not a hex digit")
            else:
                raise ValueError("Invalid encoding: digit high is not a hex digit")
        else:
            t += c
        i += 1
    return t
