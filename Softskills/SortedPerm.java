package Softskills;

import java.util.*;

public class SortedPerm {

    // Calculate factorial of a number
    static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++)
            result *= i;
        return result;
    }

    // Print the character array
    static void print(char[] arr) {
        for (char c : arr)
            System.out.print(c);
        System.out.println();
    }

    // Calculate total number of unique permutations
    static int calculateTotal(char[] arr) {
        int total = factorial(arr.length);

        // Count frequency of each character
        HashMap<Character, Integer> freq = new HashMap<>();
        for (char c : arr) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        // Divide by factorial of duplicate counts
        for (int count : freq.values()) {
            if (count > 1) {
                total /= factorial(count);
            }
        }
        return total;
    }

    // Generate next permutation in lexicographic order
    static void nextPermutation(char[] arr) {
        // Find the rightmost character smaller than its next character
        int i = arr.length - 2;
        while (i >= 0 && arr[i] >= arr[i + 1])
            i--;

        if (i >= 0) {
            // Find smallest character greater than arr[i] to the right
            int j = arr.length - 1;
            while (arr[j] <= arr[i])
                j--;

            // Swap arr[i] and arr[j]
            swap(arr, i, j);
        }

        // Reverse the suffix starting at i+1
        reverse(arr, i + 1, arr.length - 1);
        print(arr);
    }

    // Swap two characters in array
    static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Reverse array from start to end index
    static void reverse(char[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start++, end--);
        }
    }

    // Print all unique permutations in sorted order
    static void printAllPermutations(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        // Print first permutation
        print(arr);

        // Calculate and generate remaining permutations
        int total = calculateTotal(arr);
        for (int i = 1; i < total; i++) {
            nextPermutation(arr);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string for permutations: ");
        String input = sc.nextLine().toUpperCase();

        System.out.println("\nAll unique permutations in sorted order:");
        printAllPermutations(input);

        sc.close();
    }
}