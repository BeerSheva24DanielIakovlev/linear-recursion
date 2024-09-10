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

    public static long pow1(int num, int degree) {
        if (degree < 0) {
            throw new IllegalArgumentException();
        }

        return degree == 0 ? 1 : num * pow(num, degree - 1);
    }

    /**
     * 
     * @param num - any integer number
     * @param degree - any positive number
     * @return - num ^ degree
     * limitations:
     * 1. no cycles allowed
     * 2. arithmetic operators + ; - are allowed only
     * bitwise operators like >>, <<, &&, etc disallowed
     */
    public static long pow(int num, int degree) {
        //TODO
        throw new UnsupportedOperationException();
    }
 
    public static int sum(int[] array) {
        return sum(array, array.length);
    }

    private static int sum(int[] array, int length) {
        return length == 0 ? 0 : array[length - 1] + sum(array, length - 1);
    }


    /**
     * 
     * @param x
     * @return x ^ 2
     * limitations:
     * 1. no cycles allowed
     * 2. arithmetic operators + ; - are allowed only
     * 3. no bitwise operators
     * 4. no standart and additional methods are allowed
     * 5. no additional fields of the class RecursionMethods are aloowed
     */
    public static int square(int x) {
        //TODO
        throw new UnsupportedOperationException();
    }


    /**
     * 
     * @param str
     * @param subString
     * @return true if subString is actually substring of the given string
     * limitations
     * 1. no cycles allowed
     * 2. the allowed methods of class String are:
     *  2.1 charAt(int index)
     *  2.2 length()
     *  2.3 substring(int beginIndex)
     */
    public static boolean isSubstring(String str, String subString) {
        //TODO
        throw new UnsupportedOperationException();
    }
}
