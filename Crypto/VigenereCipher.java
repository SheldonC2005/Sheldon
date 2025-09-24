import java.util.Scanner;

public class VigenereCipher {

    public static String encrypt(String plaintext, String key) {
        StringBuilder ciphertext = new StringBuilder();
        String lowerKey = key.toLowerCase();
        String lowerText = plaintext.toLowerCase();
        int keyIndex = 0;

        for (int i = 0; i < lowerText.length(); i++) {
            char ch = lowerText.charAt(i);

            if (Character.isLetter(ch)) {
                char keyChar = lowerKey.charAt(keyIndex % lowerKey.length());
                int textValue = ch - 'a';
                int keyValue = keyChar - 'a';
                int sum = (textValue + keyValue) % 26;

                char encryptedChar = (char) (sum + 'a');
                ciphertext.append(encryptedChar);
                keyIndex++;
            } else {
                ciphertext.append(ch);
            }
        }

        return ciphertext.toString();
    }

    public static String decrypt(String ciphertext, String key) {
        StringBuilder plaintext = new StringBuilder();
        String lowerKey = key.toLowerCase();
        String lowerText = ciphertext.toLowerCase();
        int keyIndex = 0;

        for (int i = 0; i < lowerText.length(); i++) {
            char ch = lowerText.charAt(i);

            if (Character.isLetter(ch)) {
                char keyChar = lowerKey.charAt(keyIndex % lowerKey.length());
                int textValue = ch - 'a';
                int keyValue = keyChar - 'a';
                int diff = (textValue - keyValue + 26) % 26;

                char decryptedChar = (char) (diff + 'a');
                plaintext.append(decryptedChar);
                keyIndex++;
            } else {
                plaintext.append(ch);
            }
        }

        return plaintext.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter operation (E for encrypt, D for decrypt): ");
        String operation = scanner.nextLine().trim().toUpperCase();

        System.out.print("Enter key: ");
        String key = scanner.nextLine().trim();

        System.out.print("Enter text: ");
        String text = scanner.nextLine().trim();

        if (operation.equals("E")) {
            String result = encrypt(text, key);
            System.out.println(result);
        } else if (operation.equals("D")) {
            String result = decrypt(text, key);
            System.out.println(result);
        }

        scanner.close();
    }
}