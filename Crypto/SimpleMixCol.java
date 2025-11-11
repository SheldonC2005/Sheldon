package Crypto;

/**
 * A simplified implementation of the MixColumns operation in the AES algorithm.
 * This class demonstrates the transformation on a 4x4 state matrix.
 */
public class SimpleMixCol {

    /**
     * Performs Galois Field (GF) multiplication of a number by 2.
     * This is a fundamental operation for MixColumns.
     * In GF(2^8), multiplication by 2 is a left shift. If the high bit (msb) is 1,
     * it's followed by a conditional XOR with the irreducible polynomial 0x1B.
     *
     * @param n The byte to multiply.
     * @return The result of the multiplication.
     */
    private static int gmul2(int n) {
        // If high bit is 0, it's just a left shift.
        // If high bit is 1, it's a left shift XORed with 0x1B.
        return (n << 1) ^ (((n >> 7) & 1) * 0x1B);
    }

    /**
     * Performs Galois Field (GF) multiplication of a number by 3.
     * Multiplication by 3 in GF(2^8) can be expressed as (a * 2) ^ a.
     *
     * @param n The byte to multiply.
     * @return The result of the multiplication.
     */
    private static int gmul3(int n) {
        return gmul2(n) ^ n;
    }

    /**
     * Applies the MixColumns transformation to a 4x4 state matrix.
     * Each column of the state is transformed by multiplying it with a fixed matrix
     * in GF(2^8).
     * The fixed matrix is:
     * | 2 3 1 1 |
     * | 1 2 3 1 |
     * | 1 1 2 3 |
     * | 3 1 1 2 |
     *
     * @param state The 4x4 input state matrix.
     * @return The new 4x4 state matrix after the transformation.
     */
    public static int[][] mixColumns(int[][] state) {
        int[][] nextState = new int[4][4];

        for (int c = 0; c < 4; c++) {
            // Extract the current column for processing
            int s0 = state[0][c];
            int s1 = state[1][c];
            int s2 = state[2][c];
            int s3 = state[3][c];

            // Apply the MixColumns matrix multiplication for the column (unrolled loop)
            // Each line corresponds to a row in the fixed matrix.
            nextState[0][c] = gmul2(s0) ^ gmul3(s1) ^ s1 ^ s3;
            nextState[1][c] = s0 ^ gmul2(s1) ^ gmul3(s2) ^ s3;
            nextState[2][c] = s0 ^ s1 ^ gmul2(s2) ^ gmul3(s3);
            nextState[3][c] = gmul3(s0) ^ s1 ^ s2 ^ gmul2(s3);
        }

        return nextState;
    }

    /**
     * Main method to demonstrate the MixColumns operation.
     */
    public static void main(String[] args) {
        // Example 4x4 state matrix (from a sample AES calculation)
        int[][] inputMatrix = {
                { 0x00, 0x12, 0x0C, 0x08 },
                { 0x04, 0x04, 0x00, 0x23 },
                { 0x12, 0x12, 0x13, 0x19 },
                { 0x14, 0x00, 0x11, 0x19 }
        };

        System.out.println("Input Matrix:");
        printMatrix(inputMatrix);

        int[][] resultMatrix = mixColumns(inputMatrix);

        System.out.println("Output Matrix (after MixColumns):");
        printMatrix(resultMatrix);
    }

    /**
     * Helper method to print a 4x4 matrix in hexadecimal format.
     * 
     * @param matrix The matrix to print.
     */
    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%02X ", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
