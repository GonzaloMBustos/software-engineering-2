package org.autotest;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class StackTests3 extends MutationAnalysisRunner {
    @Override
    protected boolean useVerboseMode() {
        return false;
    }

    // Tests de StackTests2.java
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
        // Este test no aporta ninguna asercion por lo tanto no mata mutantes, ni tampoco aporta al coverage
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

    // COMPLETAR
    public void testPushOverLimit() throws Exception {
        Stack stack = createStack(1);
        stack.push(42);
        assertThrows(IllegalStateException.class, () -> {
            stack.push(43);
        });
    }

    public void testPopFromEmptyStack() throws Exception {
        Stack stack = createStack();
        Exception e = assertThrows(IllegalStateException.class, stack::pop);
        StackTraceElement[] stackTrace = e.getStackTrace();
        StackTraceElement triggeringMethod = stackTrace[0];
        assertEquals(triggeringMethod.getMethodName(), "pop");
    }

    public void testTopFromEmptyStack() throws Exception {
        Stack stack = createStack();
        assertThrows(IllegalStateException.class, stack::top);
    }

    public void testTopNonEmptyStack() throws Exception {
        Stack stack = createStack();
        stack.push(42);
        assertEquals(42, stack.top());
    }

//    public void testHashCodeEmptyStack() throws Exception {
//        Stack stack = createStack();
//        stack.hashCode();
//    }

    public void testHashCodeNonEmptyStack() throws Exception {
        Stack stack = createStack(2);
        Object[] elems = new Object[2];
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(elems);
        result = prime * result - 1;
        assertEquals(result, stack.hashCode());
    }

    public void testEqualsEmptyStack() throws Exception {
        Stack stack = createStack();
        Stack other = createStack();
        assertTrue(stack.equals(other));
    }

    public void testEqualsSameStack() throws Exception {
        Stack stack = createStack();
        assertTrue(stack.equals(stack));
    }

    public void testEqualsNullObject() throws Exception {
        Stack stack = createStack();
        assertFalse(stack.equals(null));
    }

    public void testEqualsStackAgainsArray() throws Exception {
        Stack stack = createStack();
        Object[] array = new Object[0];
        assertFalse(stack.equals(array));
    }

    public void testEqualsDifferentStacks() throws Exception {
        Stack stackA = createStack();
        stackA.push(1);
        Stack stackB = createStack();
        stackB.push(2);

        assertFalse(stackA.equals(stackB));
    }

    public void testConstructorWithSpecifiedCapacityOverZero() throws Exception {
        Stack stack = createStack(0);
        assertTrue(stack.isEmpty());
        // Este test chequea que NO SE TRIGGEREE UNA EXCEPCION cuando la capacidad es cero.
    }

    public void testIsPopReturnsDeletedElement() throws Exception {
        Stack stack = createStack(1);
        stack.push(42);
        Object top = stack.pop();
        assertEquals(top, 42);
    }

    public void testStackCreationDefaultsToCapacity10() throws Exception {
        Stack stack = createStack();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        assertTrue(stack.isFull());
    }

    // Equivalentes:
    // - StackArMutated3396 (TrueReturnsMutator: Se reemplazó false por true en la línea 82.) => readIndex inaccessible
    // - StackArMutated9417 (FalseConditionalsMutator: Se reemplazó this == obj por False en la línea 72.) => same object cannot have different attributes
    // - StackArMutated8246 (FalseConditionalsMutator: Se reemplazó readIndex != other.readIndex por False en la línea 81.) => readIndex inaccessible
    // - StackArMutated7722 (MathMutator: Se reemplazó * por / en la línea 65.) => 31 * 1 == 31 / 1. Son valores hardcodeados, por lo tanto es indetectable

}
