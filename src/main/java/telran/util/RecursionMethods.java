package telran.util;

public class RecursionMethods {
    public static void f(int a) {
        if (a > 3) {
            f(a - 1);
        }
    }

    public static long factorial(int n) {
        //n! = 1 * 2 * 3*...*n
        if (n < 0) {
            n = -n;
        }

        return n == 0 ? 1 : n * factorial(n - 1);
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
        long res;
    
        if (degree < 0) {
            throw new IllegalArgumentException();
        }
        if (degree == 0) {
            res = 1;
        } else {
            res = multiply(num, pow(num, degree - 1));
        }
    
        return res;
    }
    
    private static long multiply(long a, long b) {
        long res;

        if (a == 0 || b == 0) {
            res = 0;
        } else if (b == 1) {
            res = a;
        } else if (b > 0) {
            res = a + multiply(a, b - 1);
        } else {
            res = -multiply(a, -b);
        }
    
        return res;
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
     * 5. no additional fields of the class RecursionMethods are allowed
     */
    public static int square(int x) {
        int res;

        if (x == 0) {
            res = 0;
        } else if (x < 0) {
            res = square(-x);
        } else {
            res = x + square(x - 1) + (x - 1);
        }

        return res;
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
        boolean res = false;
    
        if (subString.length() > str.length()) {
            res = false;
        } else if (startsWith(str, subString, 0)) {
            res = true;
        } else {
            res = isSubstring(str.substring(1), subString);
        }
    
        return res;
    }
    
    private static boolean startsWith(String str, String prefix, int index) {
        boolean res = true;
    
        if (index == prefix.length()) {
            res = true;
        } else if (index >= str.length() || str.charAt(index) != prefix.charAt(index)) {
            res = false;
        } else {
            res = startsWith(str, prefix, index + 1);
        }
    
        return res;
    }
    

}
