from src.evaluate_condition import clear_maps, distances_true, distances_false
from src.cgi_decode_instrumented import cgi_decode_instrumented

def get_branch_coverage_cgi_decode(individual):
    """
    Ejecuta los test cases del individuo y calcula qué porcentaje de ramas se cubren.
    """
    clear_maps()

    for test_case in individual.test_suite:
        try:
            cgi_decode_instrumented(test_case)
        except Exception:
            continue

    covered = 0
    total = 5 * 2

    for c in range(1, 6):
        if distances_true[c] is not None:
            covered += 1
        if distances_false[c] is not None:
            covered += 1

    return covered / total
