public class SimpleHillCipher {
    private static final int MOD = 26;

    public static String encrypt(String plaintext, int[][] key) {
        plaintext = plaintext.toUpperCase().replaceAll("[^A-Z]", "");

        // Pad if necessary
        while (plaintext.length() % key.length != 0) {
            plaintext += "X";
        }

        StringBuilder ciphertext = new StringBuilder();

        for (int i = 0; i < plaintext.length(); i += key.length) {
            int[] block = new int[key.length];
            for (int j = 0; j < key.length; j++) {
                block[j] = plaintext.charAt(i + j) - 'A';
            }

            int[] encrypted = multiplyMatrix(key, block);

            for (int val : encrypted) {
                ciphertext.append((char) ('A' + (val % MOD)));
            }
        }

        return ciphertext.toString();
    }

    private static int[] multiplyMatrix(int[][] matrix, int[] vector) {
        int[] result = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result[i] += matrix[i][j] * vector[j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String plaintext = "HELLO";
        int[][] key = { { 3, 2 }, { 5, 7 } }; // 2x2 key matrix

        System.out.println("Hill Cipher");
        System.out.println("Plaintext: " + plaintext);
        System.out.println("Key Matrix: [[3,2], [5,7]]");
        System.out.println("Ciphertext: " + encrypt(plaintext, key));
    }
}