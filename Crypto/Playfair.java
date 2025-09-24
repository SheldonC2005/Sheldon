package Crypto;

import java.util.Scanner;

public class Playfair {
    private char[][] matrix = new char[5][5];

    public Playfair(String key) {
        buildMatrix(key);
    }

    private void buildMatrix(String key) {
        String adjustedKey = key.toUpperCase().replaceAll("[^A-Z]", "").replace('J', 'I');
        boolean[] used = new boolean[26];
        used['J' - 'A'] = true; // J is treated as I
        StringBuilder keyString = new StringBuilder();

        // Add unique characters from key
        for (char ch : adjustedKey.toCharArray()) {
            int idx = ch - 'A';
            if (!used[idx]) {
                used[idx] = true;
                keyString.append(ch);
            }
        }

        // Add remaining alphabet
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            if (!used[ch - 'A']) {
                used[ch - 'A'] = true;
                keyString.append(ch);
            }
        }

        // Fill matrix
        int pos = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = keyString.charAt(pos++);
            }
        }
    }

    public void printMatrix() {
        System.out.println("5x5 Playfair Matrix:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public String encrypt(String plaintext) {
        String preparedText = prepareText(plaintext);
        StringBuilder ciphertext = new StringBuilder();

        for (int i = 0; i < preparedText.length(); i += 2) {
            char a = preparedText.charAt(i);
            char b = preparedText.charAt(i + 1);
            int[] posA = findPosition(a);
            int[] posB = findPosition(b);

            char encA, encB;

            if (posA[0] == posB[0]) { // Same row
                encA = matrix[posA[0]][(posA[1] + 1) % 5];
                encB = matrix[posB[0]][(posB[1] + 1) % 5];
            } else if (posA[1] == posB[1]) { // Same column
                encA = matrix[(posA[0] + 1) % 5][posA[1]];
                encB = matrix[(posB[0] + 1) % 5][posB[1]];
            } else { // Rectangle
                encA = matrix[posA[0]][posB[1]];
                encB = matrix[posB[0]][posA[1]];
            }

            ciphertext.append(encA).append(encB);
        }

        return ciphertext.toString();
    }

    public String decrypt(String ciphertext) {
        StringBuilder plaintext = new StringBuilder();

        for (int i = 0; i < ciphertext.length(); i += 2) {
            char a = ciphertext.charAt(i);
            char b = ciphertext.charAt(i + 1);
            int[] posA = findPosition(a);
            int[] posB = findPosition(b);

            char decA, decB;

            if (posA[0] == posB[0]) { // Same row
                decA = matrix[posA[0]][(posA[1] - 1 + 5) % 5];
                decB = matrix[posB[0]][(posB[1] - 1 + 5) % 5];
            } else if (posA[1] == posB[1]) { // Same column
                decA = matrix[(posA[0] - 1 + 5) % 5][posA[1]];
                decB = matrix[(posB[0] - 1 + 5) % 5][posB[1]];
            } else { // Rectangle
                decA = matrix[posA[0]][posB[1]];
                decB = matrix[posB[0]][posA[1]];
            }

            plaintext.append(decA).append(decB);
        }

        return plaintext.toString();
    }

    private String prepareText(String text) {
        String up = text.toUpperCase().replaceAll("[^A-Z]", "").replace('J', 'I');
        StringBuilder sb = new StringBuilder();

        int i = 0;
        while (i < up.length()) {
            char first = up.charAt(i);
            sb.append(first);

            if (i + 1 < up.length()) {
                char second = up.charAt(i + 1);
                if (first == second) {
                    // Same letters in pair, insert X and continue with second letter
                    sb.append('X');
                    i++; // Move to the duplicate letter (don't skip it)
                } else {
                    // Different letters, normal pair
                    sb.append(second);
                    i += 2; // Move to next pair
                }
            } else {
                // Odd length, add X at the end
                sb.append('X');
                i++;
            }
        }

        return sb.toString();
    }

    private int[] findPosition(char c) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matrix[i][j] == c) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter operation (E for encrypt, D for decrypt): ");
        String operation = sc.nextLine().trim().toUpperCase();

        System.out.print("Enter key: ");
        String key = sc.nextLine().trim();

        System.out.print("Enter text: ");
        String text = sc.nextLine().trim();

        Playfair cipher = new Playfair(key);
        cipher.printMatrix();

        if (operation.equals("E")) {
            String result = cipher.encrypt(text);
            System.out.println(result);
        } else if (operation.equals("D")) {
            String result = cipher.decrypt(text);
            System.out.println(result);
        }

        sc.close();
    }
}