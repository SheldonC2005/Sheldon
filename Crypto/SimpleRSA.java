import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class SimpleRSA {
    private BigInteger n, e, d;

    public SimpleRSA() {
        // Small primes for demonstration
        BigInteger p = new BigInteger("61");
        BigInteger q = new BigInteger("53");

        n = p.multiply(q); // n = p * q = 3233
        BigInteger phi = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE)); // φ(n) = (p-1)(q-1)

        e = new BigInteger("17"); // Public exponent
        d = e.modInverse(phi); // Private exponent

        System.out.println("RSA Key Generation:");
        System.out.println("p = " + p + ", q = " + q);
        System.out.println("n = " + n);
        System.out.println("φ(n) = " + phi);
        System.out.println("e = " + e + " (public key)");
        System.out.println("d = " + d + " (private key)");
        System.out.println();
    }

    public List<BigInteger> encrypt(String plaintext) {
        List<BigInteger> ciphertext = new ArrayList<>();

        for (char c : plaintext.toCharArray()) {
            BigInteger m = BigInteger.valueOf((int) c);
            BigInteger encrypted = m.modPow(e, n);
            ciphertext.add(encrypted);
        }

        return ciphertext;
    }

    public String decrypt(List<BigInteger> ciphertext) {
        StringBuilder plaintext = new StringBuilder();

        for (BigInteger c : ciphertext) {
            BigInteger decrypted = c.modPow(d, n);
            plaintext.append((char) decrypted.intValue());
        }

        return plaintext.toString();
    }

    public static void main(String[] args) {
        SimpleRSA rsa = new SimpleRSA();
        String plaintext = "HELLO";

        System.out.println("Plaintext: " + plaintext);

        List<BigInteger> encrypted = rsa.encrypt(plaintext);
        System.out.println("Encrypted: " + encrypted);

        String decrypted = rsa.decrypt(encrypted);
        System.out.println("Decrypted: " + decrypted);
    }
}