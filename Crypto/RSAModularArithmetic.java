import java.math.BigInteger;

/**
 * RSA Modular Arithmetic Utility
 * Demonstrates key modular operations used in RSA cryptography:
 * 1. Modular Exponentiation: (base^exponent) mod modulus
 * 2. Modular Multiplicative Inverse: a^(-1) mod n
 */
public class RSAModularArithmetic {

    /**
     * Computes modular exponentiation: (base^exponent) mod modulus
     * This is the core operation in RSA encryption and decryption.
     * 
     * @param base     The base value
     * @param exponent The exponent value
     * @param modulus  The modulus value
     * @return (base^exponent) mod modulus
     */
    public static BigInteger modularExponentiation(BigInteger base, BigInteger exponent, BigInteger modulus) {
        return base.modPow(exponent, modulus);
    }

    /**
     * Computes the modular multiplicative inverse: a^(-1) mod n
     * This finds a number x such that (a * x) mod n = 1
     * Used in RSA to calculate the private key exponent d from e and φ(n).
     * 
     * @param a The number to find the inverse of
     * @param n The modulus
     * @return The modular multiplicative inverse, or null if it doesn't exist
     */
    public static BigInteger modularInverse(BigInteger a, BigInteger n) {
        try {
            return a.modInverse(n);
        } catch (ArithmeticException e) {
            System.out.println("Modular inverse does not exist (numbers are not coprime)");
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.println("=== RSA Modular Arithmetic Demonstrations ===\n");

        // Example 1: Basic modulo operation (your example: 5324 mod 187)
        System.out.println("1. Basic Modulo Operation:");
        BigInteger num = new BigInteger("5324");
        BigInteger mod = new BigInteger("187");
        BigInteger result = num.mod(mod);
        System.out.println("   5324 mod 187 = " + result);
        System.out.println();

        // Example 2: Modular Exponentiation (RSA Encryption/Decryption)
        System.out.println("2. Modular Exponentiation (RSA Core Operation):");
        System.out.println("   Example: Encrypt message m=65 with public key (e=17, n=3233)");
        BigInteger message = new BigInteger("65");
        BigInteger publicExp = new BigInteger("17");
        BigInteger n = new BigInteger("3233");
        BigInteger ciphertext = modularExponentiation(message, publicExp, n);
        System.out.println("   Ciphertext = 65^17 mod 3233 = " + ciphertext);
        System.out.println();

        System.out.println("   Example: Decrypt ciphertext with private key (d=2753, n=3233)");
        BigInteger privateExp = new BigInteger("2753");
        BigInteger decrypted = modularExponentiation(ciphertext, privateExp, n);
        System.out.println("   Decrypted = " + ciphertext + "^2753 mod 3233 = " + decrypted);
        System.out.println("   (Original message recovered: " + decrypted + ")");
        System.out.println();

        // Example 3: Modular Multiplicative Inverse (Finding Private Key)
        System.out.println("3. Modular Multiplicative Inverse (Private Key Calculation):");
        System.out.println("   Given: e=17, φ(n)=3120");
        System.out.println("   Find: d such that (e * d) mod φ(n) = 1");
        BigInteger e = new BigInteger("17");
        BigInteger phi = new BigInteger("3120");
        BigInteger d = modularInverse(e, phi);
        if (d != null) {
            System.out.println("   d = " + d);
            System.out.println("   Verification: (17 * " + d + ") mod 3120 = " +
                    e.multiply(d).mod(phi));
        }
        System.out.println();

        // Example 4: Large number modular exponentiation
        System.out.println("4. Large Number Example:");
        BigInteger largeBase = new BigInteger("123456789");
        BigInteger largeExp = new BigInteger("987654321");
        BigInteger largeMod = new BigInteger("1000000007");
        BigInteger largeResult = modularExponentiation(largeBase, largeExp, largeMod);
        System.out.println("   123456789^987654321 mod 1000000007 = " + largeResult);
        System.out.println();

        // Example 5: Another modular inverse example
        System.out.println("5. Another Modular Inverse Example:");
        BigInteger a = new BigInteger("5324");
        BigInteger modulus = new BigInteger("187");
        BigInteger inverse = modularInverse(a, modulus);
        if (inverse != null) {
            System.out.println("   Inverse of 5324 mod 187 = " + inverse);
            System.out.println("   Verification: (5324 * " + inverse + ") mod 187 = " +
                    a.multiply(inverse).mod(modulus));
        }
    }
}
