import java.util.Arrays;

public class SimpleDES {

    public static String encrypt(String plaintext, String key) {
        // Convert to binary (simplified for 8-bit blocks)
        StringBuilder binary = new StringBuilder();
        for (char c : plaintext.toCharArray()) {
            binary.append(String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0'));
        }

        StringBuilder ciphertext = new StringBuilder();
        String keyBinary = String.format("%64s", Long.toBinaryString(key.hashCode())).replace(' ', '0');

        // Process in 8-bit blocks (simplified)
        for (int i = 0; i < binary.length(); i += 8) {
            String block = binary.substring(i, Math.min(i + 8, binary.length()));
            while (block.length() < 8)
                block += "0";

            // Simple XOR with key (simplified DES round)
            StringBuilder encrypted = new StringBuilder();
            for (int j = 0; j < block.length(); j++) {
                int bit = (block.charAt(j) - '0') ^ (keyBinary.charAt(j % keyBinary.length()) - '0');
                encrypted.append(bit);
            }

            // Convert back to character
            int value = Integer.parseInt(encrypted.toString(), 2);
            ciphertext.append((char) value);
        }

        return ciphertext.toString();
    }

    public static void main(String[] args) {
        String plaintext = "HELLO";
        String key = "SECRETKEY";

        System.out.println("Simple DES");
        System.out.println("Plaintext: " + plaintext);
        System.out.println("Key: " + key);
        String encrypted = encrypt(plaintext, key);
        System.out.println("Encrypted: " + Arrays.toString(encrypted.getBytes()));

        // Show as hex
        StringBuilder hex = new StringBuilder();
        for (byte b : encrypted.getBytes()) {
            hex.append(String.format("%02X ", b));
        }
        System.out.println("Hex: " + hex.toString());
    }
}