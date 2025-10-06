public class SHA512 {

    // Given buffer values from the context
    private static final String[] BUFFER_VALUES = {
            "00111100 00111100", // A
            "10001000 00010001", // B
            "11001111 00110011", // C
            "10011001 01100110", // D
            "11100111 00011000", // E
            "11110000 00001111" // F
    };

    public static void main(String[] args) {
        String input = "SATURDAY"; // Example input

        System.out.println("SHA-512 Implementation");
        System.out.println("======================");
        System.out.println("Input: " + input);

        // Convert input to binary
        String binaryInput = stringToBinary(input);
        System.out.println("Input in binary: " + binaryInput);
        System.out.println("Input length in bits: " + binaryInput.length());

        // Calculate padding
        int originalLength = binaryInput.length();
        int paddingLength = calculatePaddingLength(originalLength);

        System.out.println("\nPadding Information:");
        System.out.println("Original message length: " + originalLength + " bits");
        System.out.println("Padding bits to be added: " + paddingLength + " bits (1 followed by " + (paddingLength - 1)
                + " zeros)");

        // Apply padding
        String paddedMessage = applyPadding(binaryInput, originalLength);
        System.out.println("Total length after padding: " + paddedMessage.length() + " bits");
        System.out.println("Number of 1024-bit blocks: " + (paddedMessage.length() / 1024));

        // Process the message and calculate first 20 words
        long[] words = calculateFirst20Words(paddedMessage);

        System.out.println("\nFirst 20 words (W0 to W19):");
        for (int i = 0; i < 20; i++) {
            System.out.printf("W%02d: %016x\n", i, words[i]);
        }

        // Calculate majority and choice functions using given buffer values
        calculateFunctions();
    }

    // Convert string to binary
    public static String stringToBinary(String input) {
        StringBuilder binary = new StringBuilder();
        for (char c : input.toCharArray()) {
            String binaryChar = Integer.toBinaryString(c);
            // Pad to 8 bits
            while (binaryChar.length() < 8) {
                binaryChar = "0" + binaryChar;
            }
            binary.append(binaryChar);
        }
        return binary.toString();
    }

    // Calculate padding length
    public static int calculatePaddingLength(int messageLength) {
        // SHA-512 uses 1024-bit blocks
        // Need space for 1 bit + zeros + 128 bits for length
        int k = 0;
        while ((messageLength + 1 + k + 128) % 1024 != 0) {
            k++;
        }
        return 1 + k; // 1 for the mandatory '1' bit plus k zeros
    }

    // Apply padding to the message
    public static String applyPadding(String message, int originalLength) {
        StringBuilder padded = new StringBuilder(message);

        // Add mandatory '1' bit
        padded.append("1");

        // Add zeros until we have space for the 128-bit length
        while ((padded.length() + 128) % 1024 != 0) {
            padded.append("0");
        }

        // Add the original message length as 128-bit big-endian integer
        String lengthBinary = Long.toBinaryString(originalLength);
        // Pad to 128 bits (we'll use 64 bits for simplicity since Java long is 64-bit)
        StringBuilder length128 = new StringBuilder();
        // First 64 bits are zeros (high-order bits)
        for (int i = 0; i < 64; i++) {
            length128.append("0");
        }
        // Last 64 bits contain the actual length
        while (lengthBinary.length() < 64) {
            lengthBinary = "0" + lengthBinary;
        }
        length128.append(lengthBinary);

        padded.append(length128);

        return padded.toString();
    }

    // Calculate first 20 words from the padded message
    public static long[] calculateFirst20Words(String paddedMessage) {
        long[] words = new long[80]; // SHA-512 uses 80 words total

        // First 16 words come directly from the message block (64 bits each)
        for (int i = 0; i < 16; i++) {
            String word64 = paddedMessage.substring(i * 64, (i + 1) * 64);
            words[i] = Long.parseUnsignedLong(word64, 2);
        }

        // Calculate words 16-79 using MODIFIED word expansion (XOR instead of addition)
        for (int i = 16; i < 20; i++) { // Only calculating first 20 as requested
            long s0 = rightRotate(words[i - 15], 1) ^ rightRotate(words[i - 15], 8) ^ (words[i - 15] >>> 7);
            long s1 = rightRotate(words[i - 2], 19) ^ rightRotate(words[i - 2], 61) ^ (words[i - 2] >>> 6);
            words[i] = words[i - 16] ^ s0 ^ words[i - 7] ^ s1; // CHANGED: Using XOR instead of addition
        }

        return words;
    }

    // Right rotate function for 64-bit values
    public static long rightRotate(long value, int positions) {
        return (value >>> positions) | (value << (64 - positions));
    }

    // Calculate majority and choice functions using given buffer values
    public static void calculateFunctions() {
        System.out.println("\nFunction Results:");
        System.out.println("=================");

        // Parse buffer values from binary strings
        long[] buffers = new long[6];

        for (int i = 0; i < 6; i++) {
            String binaryValue = BUFFER_VALUES[i].replace(" ", "");
            buffers[i] = Long.parseLong(binaryValue, 2);
        }

        // Calculate Majority function: Maj(A,B,C) = (A & B) ^ (A & C) ^ (B & C)
        long A = buffers[0], B = buffers[1], C = buffers[2];
        long majority = (A & B) ^ (A & C) ^ (B & C);

        System.out.println("Majority Function Result:");
        System.out.printf("Maj(A,B,C) = %04x\n", majority);

        // Calculate Choice function: Ch(D,E,F) = (D & E) ^ (~D & F)
        long D = buffers[3], E = buffers[4], F = buffers[5];
        long choice = (D & E) ^ (~D & F);

        System.out.println("\nChoice Function Result:");
        System.out.printf("Ch(D,E,F) = %04x\n", choice);
    }
}