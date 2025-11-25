package Softskills;

import java.util.*;

public class Weighted {

    // Find distinct substrings where character weights sum to K
    static int distinctSubString(String str, int K) {
        HashSet<String> distinctSubs = new HashSet<>();
        int n = str.length();

        // Try all possible starting positions
        for (int i = 0; i < n; i++) {
            int weightSum = 0;
            StringBuilder substring = new StringBuilder();

            // Extend substring from position i
            for (int j = i; j < n; j++) {
                char ch = str.charAt(j);
                int weight = ch - 'a' + 1; // a=1, b=2, c=3, ...

                weightSum += weight;
                substring.append(ch);

                if (weightSum == K) {
                    distinctSubs.add(substring.toString());
                } else if (weightSum > K) {
                    break; // No point continuing if sum exceeds K
                }
            }
        }

        return distinctSubs.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        System.out.print("Enter target weight sum (K): ");
        int K = sc.nextInt();

        int result = distinctSubString(str, K);
        System.out.println("Number of distinct substrings with weight sum " + K + ": " + result);

        sc.close();
    }
}