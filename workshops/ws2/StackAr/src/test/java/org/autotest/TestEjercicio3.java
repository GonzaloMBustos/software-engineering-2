package org.autotest;

import org.junit.jupiter.api.Test; // Use this for JUnit 5 (or JUnit 4 equivalent: import org.junit.Test)

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*; // Assertions for cleaner tests

public class TestEjercicio3 {

    @Test
    public void testSizeIncreasesByOne() throws Exception {
        StackAr StackAr = new StackAr();
        assertEquals(0, StackAr.size());
        StackAr.push(42);
        assertEquals(1, StackAr.size());
    }

    @Test
    public void testDefaultConstructor() throws Exception {
        StackAr StackAr = new StackAr();
        assertTrue(StackAr.isEmpty());
    }

    @Test
    public void testConstructorWithSpecifiedCapacity() throws Exception {
        StackAr StackAr = new StackAr(5);
        // Este test no aporta ninguna aserción por lo tanto no mata mutantes, ni tampoco aporta al coverage
        // ya que hay otros tests que pasan por esa misma linea.
    }

    @Test
    public void testConstructorWithNegativeCapacity() {
        assertThrows(IllegalArgumentException.class, () -> {
            StackAr StackAr = new StackAr(-1);
        });
    }

    @Test
    public void testIsEmptyMethod() throws Exception {
        StackAr StackAr = new StackAr();
        assertTrue(StackAr.isEmpty());
        StackAr.push(42);
        assertFalse(StackAr.isEmpty());
        StackAr.pop();
        assertTrue(StackAr.isEmpty());
    }

    @Test
    public void testIsFullMethod() throws Exception {
        StackAr StackAr = new StackAr(1);
        assertFalse(StackAr.isFull());
        StackAr.push(42);
        assertTrue(StackAr.isFull());
        StackAr.pop();
        assertFalse(StackAr.isFull());
    }

    @Test
    public void testToStringMethod() throws Exception {
        StackAr StackAr = new StackAr(2);
        assertEquals("[]", StackAr.toString());
        StackAr.push(42);
        assertEquals("[42]", StackAr.toString());
        StackAr.push(43);
        assertEquals("[42,43]", StackAr.toString());
    }

    // Test agregados

    @Test
    public void testPushThrowsExceptionWhenOverLimit() throws Exception {
        StackAr StackAr = new StackAr(1);
        StackAr.push(42);
        assertThrows(IllegalStateException.class, () -> {
            StackAr.push(43);
        });
    }

    @Test
    public void testTopThrowsExceptionWhenStackArIsEmpty() throws Exception {
        StackAr StackAr = new StackAr();
        assertThrows(IllegalStateException.class, StackAr::top);
    }

    @Test
    public void testTopReturnsCorrectElementWhenStackArIsNonEmpty() throws Exception {
        StackAr StackAr = new StackAr();
        StackAr.push(42);
        assertEquals(42, StackAr.top());
    }

    @Test
    public void testHashCodeReturnsCorrectValueForNonEmptyStackAr() throws Exception {
        StackAr StackAr = new StackAr(2);
        Object[] elems = new Object[2];
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(elems);
        result = prime * result - 1;
        assertEquals(result, StackAr.hashCode());
    }

    @Test
    public void testEqualsReturnsTrueForTwoEmptyStackArs() throws Exception {
        StackAr StackAr = new StackAr();
        StackAr otherStackAr = new StackAr();
        assertTrue(StackAr.equals(otherStackAr));
    }

    @Test
    public void testEqualsReturnsTrueWhenComparingStackArWithItself() throws Exception {
        StackAr StackAr = new StackAr();
        assertTrue(StackAr.equals(StackAr));
    }

    @Test
    public void testEqualsReturnsFalseWhenComparingWithNull() throws Exception {
        StackAr StackAr = new StackAr();
        assertFalse(StackAr.equals(null));
    }

    @Test
    public void testEqualsReturnsFalseWhenComparingStackArWithArray() throws Exception {
        StackAr StackAr = new StackAr();
        Object[] array = new Object[0];
        assertFalse(StackAr.equals(array));
    }

    @Test
    public void testEqualsReturnsFalseForDifferentStackArs() throws Exception {
        StackAr StackAr = new StackAr();
        StackAr.push(1);
        StackAr otherStackAr = new StackAr();
        otherStackAr.push(2);

        assertFalse(StackAr.equals(otherStackAr));
    }

    @Test
    public void testConstructorDoesNotThrowExceptionWhenCapacityIsZero() throws Exception {
        StackAr StackAr = new StackAr(0);
        assertTrue(StackAr.isEmpty());
        // Este test verifica que el constructor no lance una excepción cuando se inicializa una
        // pila con capacidad cero y que la pila esté vacía tras la inicialización.
    }

    @Test
    public void testPopReturnsCorrectElement() throws Exception {
        StackAr StackAr = new StackAr(1);
        StackAr.push(42);
        Object top = StackAr.pop();
        assertEquals(top, 42);
    }

    @Test
    public void testStackArCreationDefaultsToCapacity10AndIsFull() throws Exception {
        StackAr StackAr = new StackAr();
        for (int i = 0; i < 10; i++) {
            StackAr.push(i);
        }
        assertTrue(StackAr.isFull());
    }
}