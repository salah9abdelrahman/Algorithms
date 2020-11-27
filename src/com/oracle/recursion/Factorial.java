package com.oracle.recursion;

public class Factorial {
    public static void main(String[] args) {
        int f = 10;
        int res = iterativeFactorial(f);
        System.out.println(res);

    }

    // n! = n (n-1)!
    public static int recursiveFactorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * recursiveFactorial(num - 1);
    }

    /*
    usually run faster because the overhead involved with pushing method calls onto the call stack
     */
    public static int iterativeFactorial(int num) {
        if (num == 0) {
            return 1;
        }
        int result = 1;
        for (int i = num; i > 1; i--) {
            result *= i;
        }
        return result;
    }


}
