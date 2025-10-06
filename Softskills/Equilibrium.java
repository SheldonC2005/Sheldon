package Softskills;

import java.util.*;

class Equilibrium {
    static int findMaxSum(int[] arr, int n) {
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int prefix_sum = arr[i];
            for (int j = 0; j < i; j++)
                prefix_sum += arr[j];
            int suffix_sum = arr[i];
            for (int j = n - 1; j > i; j--)
                suffix_sum += arr[j];
            if (prefix_sum == suffix_sum)
                res = Math.max(res, prefix_sum);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println(findMaxSum(arr, n));
        s.close();
    }
}