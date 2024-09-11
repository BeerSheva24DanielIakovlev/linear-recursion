package telran.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static telran.util.RecursionMethods.*;
import org.junit.jupiter.api.Test;

public class RecursionMethodsTest {
    @Test
    void fTest() {
        f(400);
    }

    @Test
    void factorialTest() {
        assertEquals(6, factorial(3));
        assertEquals(24, factorial(4));
        assertEquals(6, factorial(-3));
    }

    @Test
    void powTest() {
        assertEquals(100, pow(10, 2));
        assertEquals(100, pow(-10, 2));
        assertEquals(1000, pow(10, 3));
        assertEquals(-1000, pow(-10, 3));
        assertThrowsExactly(IllegalArgumentException.class, () -> pow(10, -3));
    }

    @Test
    void sumTest() {
        int[] ar = {1, 2, 3, 4, 5};
        assertEquals(15, sum(ar));
    }

    @Test
    void squareTest() {
        assertEquals(0, RecursionMethods.square(0));
        assertEquals(1, RecursionMethods.square(1));
        assertEquals(4, RecursionMethods.square(2));
        assertEquals(9, RecursionMethods.square(3));
        assertEquals(100, RecursionMethods.square(10));
        assertEquals(144, RecursionMethods.square(12));
        assertEquals(25, RecursionMethods.square(5));
    }

    @Test
    void isSubstringTest() {
        assertTrue(RecursionMethods.isSubstring("hello world", "hello"));
        assertTrue(RecursionMethods.isSubstring("hello world", "world"));
        assertFalse(RecursionMethods.isSubstring("hello world", "planet"));
        assertTrue(RecursionMethods.isSubstring("hello", "lo"));
        assertFalse(RecursionMethods.isSubstring("hello", "ol"));
        assertTrue(RecursionMethods.isSubstring("recursion", "curs"));
        assertFalse(RecursionMethods.isSubstring("recursion", "rescue"));
    }
}
