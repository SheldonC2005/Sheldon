package Softskills;

import java.util.*;

public class Combinations {

    // Recursively generate combinations
    static void generateCombinations(int[] arr, int[] combination, int start, int index, int r) {
        // Base case: combination is complete
        if (index == r) {
            printArray(combination);
            return;
        }

        // Try all elements from start position
        for (int i = start; i <= arr.length - (r - index); i++) {
            combination[index] = arr[i];
            generateCombinations(arr, combination, i + 1, index + 1, r);
        }
    }

    // Print array elements
    static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    // Main method to generate all combinations
    static void printCombinations(int[] arr, int r) {
        if (r > arr.length) {
            System.out.println("r cannot be greater than array length!");
            return;
        }

        int[] combination = new int[r];
        System.out.println("All combinations of size " + r + ":");
        generateCombinations(arr, combination, 0, 0, r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter combination size (r): ");
        int r = sc.nextInt();

        printCombinations(arr, r);

        sc.close();
    }
}
