package Softskills;

import java.util.*;

class Lexico {
    static char MAX_CHAR = 26;

    // Function to count frequency of each char in the
    // string. freq[0] for 'a',...., freq[25] for 'z'
    static void countFreq(String str, int freq[], int len) {
        for (int i = 0; i < len; i++) {
            freq[str.charAt(i) - 'a']++;
        }
    }

    // Cases to check whether a palindr0mic
    // string can be formed or not
    static boolean canMakePalindrome(int freq[], int len) {
        // count_odd to count no of
        // chars with odd frequency
        int count_odd = 0;
        for (int i = 0; i < MAX_CHAR; i++) {
            if (freq[i] % 2 != 0) {
                count_odd++;
            }
        }
        // For even length string
        // no odd freq character
        if (len % 2 == 0) {
            if (count_odd > 0) {
                return false;
            } else {
                return true;
            }
        }
        // For odd length string
        // one odd freq character
        if (count_odd != 1) {
            return false;
        }
        return true;
    }

    // Function to find odd freq char and
    // reducing its freq by 1 returns "" if odd freq char is not present

    static String findOddAndRemoveItsFreq(int freq[]) {
        String odd_str = "";
        for (int i = 0; i < MAX_CHAR; i++) {
            if (freq[i] % 2 != 0) {
                freq[i]--;
                odd_str = odd_str + (char) (i + 'a');
                return odd_str;
            }
        }
        return odd_str;
    }

    // To find lexicographically first palindromic
    // string.
    static String findPalindromicString(String str) {
        int len = str.length();
        int freq[] = new int[MAX_CHAR];
        countFreq(str, freq, len);
        if (!canMakePalindrome(freq, len)) {
            return "No Palindromic String";
        }
        // Assigning odd freq character if present
        // else empty string.
        String odd_str = findOddAndRemoveItsFreq(freq);
        String front_str = "", rear_str = " ";
        // Traverse characters in increasing order
        for (int i = 0; i < MAX_CHAR; i++) {
            String temp = "";
            if (freq[i] != 0) {
                char ch = (char) (i + 'a');
                for (int j = 1; j <= freq[i] / 2; j++) {
                    temp = temp + ch;
                }
                front_str = front_str + temp;
                rear_str = temp + rear_str;
            }
        }
        return (front_str + odd_str + rear_str);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scanner.nextLine().toLowerCase(); // converting to lowercase to handle uppercase input
        System.out.println(findPalindromicString(str));
        scanner.close();
    }
}