package Softskills;

import java.util.Scanner;

class Josephus {
    static int josephus(int n, int k) {
        if (n == 1)
            return 1;
        else
            return (josephus(n - 1, k) + k - 1) % n + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of people (n): ");
        int n = sc.nextInt();
        System.out.print("Enter step count (k): ");
        int k = sc.nextInt();
        System.out.println("The chosen place is " + josephus(n, k));
        sc.close();
    }
}