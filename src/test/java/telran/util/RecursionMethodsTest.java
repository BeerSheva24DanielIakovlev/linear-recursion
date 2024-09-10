package telran.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
}
