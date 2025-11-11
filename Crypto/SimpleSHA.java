import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SimpleSHA {

    public static String sha256(String input) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(input.getBytes());

            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }

            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static String sha1(String input) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-1");
            byte[] hash = digest.digest(input.getBytes());

            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }

            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static String md5(String input) {
        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            byte[] hash = digest.digest(input.getBytes());

            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }

            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    // Manual implementation of simple hash (for educational purposes)
    public static String simpleHash(String input) {
        int hash = 0;
        for (char c : input.toCharArray()) {
            hash = hash * 31 + c; // Simple polynomial rolling hash
        }
        return Integer.toHexString(Math.abs(hash));
    }

    public static void main(String[] args) {
        String input = "HELLO WORLD";

        System.out.println("SHA and Hash Algorithms");
        System.out.println("Input: " + input);
        System.out.println();

        System.out.println("MD5:     " + md5(input));
        System.out.println("SHA-1:   " + sha1(input));
        System.out.println("SHA-256: " + sha256(input));
        System.out.println("Simple:  " + simpleHash(input));

        // Demonstrate hash properties
        System.out.println();
        System.out.println("Hash Properties Demonstration:");
        System.out.println("Input: 'HELLO'     SHA-256: " + sha256("HELLO"));
        System.out.println("Input: 'hello'     SHA-256: " + sha256("hello"));
        System.out.println("Input: 'HELLO '    SHA-256: " + sha256("HELLO "));
    }
}