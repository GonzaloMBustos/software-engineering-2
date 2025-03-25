package org.autotest;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class StackTests3 extends MutationAnalysisRunner {
    @Override
    protected boolean useVerboseMode() {
        return false;
    }

    public void testSizeIncreasesByOne() throws Exception {
        Stack stack = createStack();
        assertEquals(0, stack.size());
        stack.push(42);
        assertEquals(1, stack.size());
    }

    public void testDefaultConstructor() throws Exception {
        Stack stack = createStack();
        assertTrue(stack.isEmpty());
    }

    public void testConstructorWithSpecifiedCapacity() throws Exception {
        Stack stack = createStack(5);
        // Este test no aporta ninguna aserción por lo tanto no mata mutantes, ni tampoco aporta al coverage
        // ya que hay otros tests que pasan por esa misma linea.
    }

    public void testConstructorWithNegativeCapacity() {
        assertThrows(IllegalArgumentException.class, () -> {
            Stack stack = createStack(-1);
        });
    }

    public void testIsEmptyMethod() throws Exception {
        Stack stack = createStack();
        assertTrue(stack.isEmpty());
        stack.push(42);
        assertFalse(stack.isEmpty());
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    public void testIsFullMethod() throws Exception {
        Stack stack = createStack(1);
        assertFalse(stack.isFull());
        stack.push(42);
        assertTrue(stack.isFull());
        stack.pop();
        assertFalse(stack.isFull());
    }

    public void testToStringMethod() throws Exception {
        Stack stack = createStack(2);
        assertEquals("[]", stack.toString());
        stack.push(42);
        assertEquals("[42]", stack.toString());
        stack.push(43);
        assertEquals("[42,43]", stack.toString());
    }

    // Test agregados
    
    public void testPushThrowsExceptionWhenOverLimit() throws Exception {
        Stack stack = createStack(1);
        stack.push(42);
        assertThrows(IllegalStateException.class, () -> {
            stack.push(43);
        });
    }

    public void testPopThrowsExceptionWhenStackIsEmpty() throws Exception {
        Stack stack = createStack();
        Exception e = assertThrows(IllegalStateException.class, stack::pop);
        StackTraceElement[] stackTrace = e.getStackTrace();
        StackTraceElement triggeringMethod = stackTrace[0];
        assertEquals(triggeringMethod.getMethodName(), "pop");
    }

    public void testTopThrowsExceptionWhenStackIsEmpty() throws Exception {
        Stack stack = createStack();
        assertThrows(IllegalStateException.class, stack::top);
    }

    public void testTopReturnsCorrectElementWhenStackIsNonEmpty() throws Exception {
        Stack stack = createStack();
        stack.push(42);
        assertEquals(42, stack.top());
    }

    public void testHashCodeReturnsCorrectValueForNonEmptyStack() throws Exception {
        Stack stack = createStack(2);
        Object[] elems = new Object[2];
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(elems);
        result = prime * result - 1;
        assertEquals(result, stack.hashCode());
    }

    public void testEqualsReturnsTrueForTwoEmptyStacks() throws Exception {
        Stack stack = createStack();
        Stack otherStack = createStack();
        assertTrue(stack.equals(otherStack));
    }

    public void testEqualsReturnsTrueWhenComparingStackWithItself() throws Exception {
        Stack stack = createStack();
        assertTrue(stack.equals(stack));
    }

    public void testEqualsReturnsFalseWhenComparingWithNull() throws Exception {
        Stack stack = createStack();
        assertFalse(stack.equals(null));
    }

    public void testEqualsReturnsFalseWhenComparingStackWithArray() throws Exception {
        Stack stack = createStack();
        Object[] array = new Object[0];
        assertFalse(stack.equals(array));
    }

    public void testEqualsReturnsFalseForDifferentStacks() throws Exception {
        Stack stack = createStack();
        stack.push(1);
        Stack otherStack = createStack();
        otherStack.push(2);

        assertFalse(stack.equals(otherStack));
    }

    public void testConstructorDoesNotThrowExceptionWhenCapacityIsZero() throws Exception {
        Stack stack = createStack(0);
        assertTrue(stack.isEmpty());
        // Este test verifica que el constructor no lance una excepción cuando se inicializa una
        // pila con capacidad cero y que la pila esté vacía tras la inicialización.
    }

    public void testPopReturnsCorrectElement() throws Exception {
        Stack stack = createStack(1);
        stack.push(42);
        Object top = stack.pop();
        assertEquals(top, 42);
    }

    public void testStackCreationDefaultsToCapacity10AndIsFull() throws Exception {
        Stack stack = createStack();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        assertTrue(stack.isFull());
    }

}
