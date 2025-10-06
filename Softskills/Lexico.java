package Softskills;

import java.util.*;

class Lexico {

    // Simplified and CORRECTED function to find lexicographically smallest
    // palindrome
    static String findPalindromicString(String str) {
        int[] freq = new int[26];

        // Count frequency of each character
        for (char c : str.toCharArray()) {
            freq[c - 'a']++;
        }

        // Check if palindrome is possible and count odd frequencies
        int oddCount = 0;
        char oddChar = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 != 0) {
                oddCount++;
                oddChar = (char) (i + 'a');
            }
        }

        // Palindrome not possible
        if (oddCount > 1) {
            return "No Palindromic String";
        }

        // Build the left half
        StringBuilder leftHalf = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                char ch = (char) (i + 'a');
                for (int j = 0; j < freq[i] / 2; j++) {
                    leftHalf.append(ch);
                }
            }
        }

        // Build right half (reverse of left half) - FIXED: no extra space
        StringBuilder rightHalf = new StringBuilder(leftHalf).reverse();

        // Build final result: left + middle + right
        String result = leftHalf.toString() + (oddCount == 1 ? oddChar : "") + rightHalf.toString();

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scanner.nextLine().toLowerCase();
        System.out.println(findPalindromicString(str));
        scanner.close();
    }
}