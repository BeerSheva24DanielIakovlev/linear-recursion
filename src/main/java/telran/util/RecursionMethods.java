package telran.util;

public class RecursionMethods {
    public static void f(int a) {
        if (a > 3) {
            f(a - 1);
        }
    }

    public static long factorial(int n) {
        //3! = 1 * 2 * 3*...*n
        if (n < 0) {
            n = -n;
        }

        return n == 0 ? 1 : n * factorial(n - 1);
    }

    public static long pow(int num, int degree) {
        long res = 1;

        if (degree < 0) {
            throw new IllegalArgumentException();
        }

        return res;
    }
}
