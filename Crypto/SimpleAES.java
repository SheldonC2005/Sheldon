import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class SimpleAES {

    public static SecretKey generateKey() throws Exception {
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(128); // 128-bit key
        return keyGen.generateKey();
    }

    public static String encrypt(String plaintext, SecretKey key) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encrypted = cipher.doFinal(plaintext.getBytes());
        return Base64.getEncoder().encodeToString(encrypted);
    }

    public static String decrypt(String ciphertext, SecretKey key) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] decoded = Base64.getDecoder().decode(ciphertext);
        byte[] decrypted = cipher.doFinal(decoded);
        return new String(decrypted);
    }

    // Alternative with string key
    public static String encryptWithStringKey(String plaintext, String keyString) throws Exception {
        // Ensure key is 16 bytes (128 bits)
        byte[] keyBytes = new byte[16];
        byte[] keyStringBytes = keyString.getBytes();
        System.arraycopy(keyStringBytes, 0, keyBytes, 0, Math.min(keyStringBytes.length, 16));

        SecretKeySpec key = new SecretKeySpec(keyBytes, "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encrypted = cipher.doFinal(plaintext.getBytes());
        return Base64.getEncoder().encodeToString(encrypted);
    }

    public static void main(String[] args) {
        try {
            String plaintext = "HELLO WORLD";

            System.out.println("AES Encryption");
            System.out.println("Plaintext: " + plaintext);

            // Method 1: Generated key
            SecretKey key = generateKey();
            String encrypted = encrypt(plaintext, key);
            String decrypted = decrypt(encrypted, key);

            System.out.println("Generated Key: " + Base64.getEncoder().encodeToString(key.getEncoded()));
            System.out.println("Encrypted: " + encrypted);
            System.out.println("Decrypted: " + decrypted);

            System.out.println();

            // Method 2: String key
            String keyString = "MySecretKey12345";
            String encrypted2 = encryptWithStringKey(plaintext, keyString);
            System.out.println("String Key: " + keyString);
            System.out.println("Encrypted with String Key: " + encrypted2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}