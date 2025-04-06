# Calculates the dot product of two integer lists A and B
def exercise1(A: list[int], B: list[int]) -> int:
    r: int = 0
    i: int = 0
    while i < len(A):
        r += A[i] * B[i]
        i += 1
    return r
# Weakest precondition such that no TypeError and IndexError are raised is:
# Forall i, j, 0 <= i < len(A) and 0 <= j < len(B) => A[i] != null and B[i] != null
# And len(A) >= len(B)

# Returns the minimum of two integers x and y
def exercise2(x: int, y: int) -> int:
    z: int = 0
    if x < y:
        z = x
    else:
        z = y
    return z

# Mutant version of exercise2 that uses != instead of < for comparison
def exercise3_mutant(x: int, y: int) -> int:
    z: int = 0
    if x != y: # Mutant 1
        z = x
    else:
        z = y
    return z

# Determines the type of triangle based on side lengths:
# Returns 1 for equilateral, 2 for isosceles, 3 for scalene, 4 for invalid
def triangle(a: int, b: int, c: int) -> int:
    # Check if triangle is valid
    if a <= 0 or b <= 0 or c <= 0 or (a + b <= c) or (b + c <= a) or (a + c <= b):
        return 4
    
    # Check if equilateral (all sides equal)
    if a == b and b == c:
        return 1
    
    # Check if isosceles (exactly two sides equal)
    if a == b or b == c or a == c:
        return 2
        
    # Must be scalene (no sides equal)
    return 3

# Mutant version of triangle function with a bug in isosceles check
def triangle_mutant(a: int, b: int, c: int) -> int:
    # Check if triangle is valid
    if a <= 0 or b <= 0 or c <= 0 or (a + b <= c) or (b + c <= a) or (a + c <= b):
        return 4
    
    # Check if equilateral (all sides equal)
    if a == b and b == c:
        return 1
    
    # Check if isosceles (exactly two sides equal)
    if a == b or b == c or a != c: # Mutant 1
        return 2
        
    # Must be scalene (no sides equal)
    return 3

# Calculates the sum of odd numbers from 0 to n-1
def exercise5(n: int) -> int:
    r: int = 0
    if n >= 0:
        i: int = 0
        while i < n:
            if i % 2 == 1:
                r += i
            i += 1
    return r

# Detectable mutant version of exercise5 (identical to original)
def exercise5_mutant_detectable(n: int) -> int:
    r: int = 0
    if n >= 0:
        i: int = 0
        while i <= n: # Mutant detectable because returns sum over n.
            if i % 2 == 1:
                r += i
            i += 1
    return r

def exercise5_mutant_not_detectable(n: int) -> int:
    r: int = 0
    if n > 0: # Mutant not detectable because n=0 always returns 0.
        i: int = 0
        while i < n:
            if i % 2 == 1:
                r += i
            i += 1
    return r

# Checks if x equals 2y and x is greater than y+10
def exercise6(x: int, y: int) -> bool:
    result: bool = False
    z: int = 2*y
    if z == x:
        if x > y+10:
            result = True
    return result

def exercise6_mutant_detectable(x: int, y: int) -> bool:
    result: bool = False
    z: int = y # Mutant detectable because returns False for all inputs.
    if z == x:
        if x > y+10:
            result = True
    return result

def exercise6_mutant_not_detectable(x: int, y: int) -> bool:
    result: bool = False
    z: int = y+y # Mutant not detectable because 2*y = y+y for all integers.
    if z == x:
        if x > y+10:
            result = True
    return result

# Counts how many times k equals j in two iterations
def exercise7(k: int, j: int) -> int:
    i: int = 0
    r: int = 0
    while i < 2: # C1
        if k == j: # C2
            r = r+1
        i = i +1
    return r

def exercise7_mutant_detectable(k: int, j: int) -> int:
    i: int = 0
    r: int = 0
    while i < 2: # C1
        if k == j: # C2
            r = -abs(r+1) # Mutant
        i = i +1
    return r

def exercise7_mutant_not_detectable(k: int, j: int) -> int:
    i: int = 0
    r: int = 0
    while i < abs(2): # C1 # Mutant
        if k == j: # C2
            r = r+1
        i = i +1
    return r

# Multiplies j by itself (k mod 3) times if k is positive
def exercise8(k: int, j: int) -> int:
    r: int = 1
    if k != 0 and k > 0: #C1
        c: int = k % 3 # k modulo 3
        i: int = 0
        while i < c: #C2
            r = r * j
            i = i +1
    return r

def exercise8_mutant_detectable(k: int, j: int) -> int:
    r: int = 1
    if k != 0 and k == 0: #C1 # Mutant
        c: int = k % 3 # k modulo 3
        i: int = 0
        while i < c: #C2
            r = r * j
            i = i +1
    return r

def exercise8_mutant_not_detectable(k: int, j: int) -> int:
    r: int = 1
    if k > 0 and k > 0: #C1 # Mutant
        c: int = k % 3 # k modulo 3
        i: int = 0
        while i < c: #C2
            r = r * j
            i = i +1
    return r

# Multiplies j by itself k times if k is between 1 and 2
def exercise9(k: int, j: int) -> int:
    r: int = 1
    if k > 0 and k < 3: #C1
        i: int = 0
        while i < k: #C2
            r = r * j
            i = i +1
    return r
    # Too easy to find mutants.

def main():
    A: list[int] = [1, 2, 3]
    B: list[int] = [4, 5, 6]
    print(exercise1(A, B))

if __name__ == "__main__":
    main()