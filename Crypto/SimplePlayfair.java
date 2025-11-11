public class SimplePlayfair {
    private static char[][] keyMatrix = new char[5][5];

    public static void generateKeyMatrix(String key) {
        boolean[] used = new boolean[26];
        used['j' - 'a'] = true; // J is combined with I

        int row = 0, col = 0;

        // Add key characters first
        for (char c : key.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z' && !used[c - 'a']) {
                keyMatrix[row][col] = c;
                used[c - 'a'] = true;
                col++;
                if (col == 5) {
                    col = 0;
                    row++;
                }
            }
        }

        // Add remaining alphabet
        for (char c = 'a'; c <= 'z'; c++) {
            if (!used[c - 'a']) {
                keyMatrix[row][col] = c;
                col++;
                if (col == 5) {
                    col = 0;
                    row++;
                }
            }
        }
    }

    public static String encrypt(String plaintext, String key) {
        generateKeyMatrix(key);
        plaintext = plaintext.toLowerCase().replaceAll("[^a-z]", "").replace('j', 'i');

        // Add X between duplicate letters and make even length
        StringBuilder processed = new StringBuilder();
        for (int i = 0; i < plaintext.length(); i += 2) {
            processed.append(plaintext.charAt(i));
            if (i + 1 < plaintext.length()) {
                if (plaintext.charAt(i) == plaintext.charAt(i + 1)) {
                    processed.append('x');
                    i--; // Process the duplicate letter in next iteration
                } else {
                    processed.append(plaintext.charAt(i + 1));
                }
            } else {
                processed.append('x'); // Add padding
            }
        }

        StringBuilder ciphertext = new StringBuilder();
        for (int i = 0; i < processed.length(); i += 2) {
            char a = processed.charAt(i);
            char b = processed.charAt(i + 1);

            int[] posA = findPosition(a);
            int[] posB = findPosition(b);

            if (posA[0] == posB[0]) { // Same row
                ciphertext.append(keyMatrix[posA[0]][(posA[1] + 1) % 5]);
                ciphertext.append(keyMatrix[posB[0]][(posB[1] + 1) % 5]);
            } else if (posA[1] == posB[1]) { // Same column
                ciphertext.append(keyMatrix[(posA[0] + 1) % 5][posA[1]]);
                ciphertext.append(keyMatrix[(posB[0] + 1) % 5][posB[1]]);
            } else { // Rectangle
                ciphertext.append(keyMatrix[posA[0]][posB[1]]);
                ciphertext.append(keyMatrix[posB[0]][posA[1]]);
            }
        }

        return ciphertext.toString().toUpperCase();
    }

    private static int[] findPosition(char c) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (keyMatrix[i][j] == c) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { 0, 0 };
    }

    public static void main(String[] args) {
        String plaintext = "HELLO WORLD";
        String key = "MONARCHY";

        System.out.println("Playfair Cipher");
        System.out.println("Plaintext: " + plaintext);
        System.out.println("Key: " + key);
        System.out.println("Ciphertext: " + encrypt(plaintext, key));
    }
}