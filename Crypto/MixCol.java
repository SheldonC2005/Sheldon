public class MixCol
{
    private static final int[][] MIX_COLUMN_MATRIX = {
        {0x02, 0x03, 0x01, 0x01},
        {0x01, 0x02, 0x03, 0x01},
        {0x01, 0x01, 0x02, 0x03},
        {0x03, 0x01, 0x01, 0x02}
    };
    private static int gfMultiply(int a, int b) {
        int result = 0;
        int temp = a;
        for (int i = 0; i < 8; i++) {
            if ((b & 1) != 0) {
                result ^= temp;
            }
            boolean highBit = (temp & 0x80) != 0;
            temp <<= 1;
            
            if (highBit) {
                temp ^= 0x1B; 
            }
            b >>= 1;
        }
        return result & 0xFF;
    }
    private static int gfMultiplyFast(int a, int multiplier) {
        switch (multiplier) {
            case 0x01:
                return a; 
            case 0x02:
                return ((a << 1) ^ (((a >> 7) & 1) * 0x1B)) & 0xFF;
            case 0x03:
                return gfMultiplyFast(a, 0x02) ^ a; 
            default:
                return gfMultiply(a, multiplier);
        }
    }
    public static int[][] mixColumns(int[][] inputMatrix) {
        int[][] result = new int[4][4];

        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                result[row][col] = 0;
                for (int k = 0; k < 4; k++) {
                    int product = gfMultiplyFast(inputMatrix[k][col], MIX_COLUMN_MATRIX[row][k]);
                    result[row][col] ^= product;
                }
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        int[][] inputMatrix = {
            {0x00, 0x12, 0x0C, 0x08},
            {0x04, 0x04, 0x00, 0x23},
            {0x12, 0x12, 0x13, 0x19},
            {0x14, 0x00, 0x11, 0x19}
        };
        System.out.println("Input Matrix:");
        printMatrix(inputMatrix);
        
        int[][] result = mixColumns(inputMatrix);
        
        System.out.println("Output Matrix (after MixColumns):");
        printMatrix(result);
    }

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