package Softskills;

import java.io.*;

class Euler {
    static int phi(int n) {
        int result = n;
        for (int p = 2; p * p <= n; ++p) {
            if (n % p == 0) {
                while (n % p == 0)
                    n /= p;
                result -= result / p;
            }
        }
        if (n > 1)
            result -= result / n;
        return result;
    }

    public static void main(String[] args) {
        int n = 1000;
        System.out.println(phi(n));
    }
}
