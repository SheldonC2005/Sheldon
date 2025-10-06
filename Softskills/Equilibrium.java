package Softskills;

import java.util.*;

class Equilibrium {
    static int findMaxSum(int[] arr, int n) {
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int left_sum = 0;
            for (int j = 0; j < i; j++)
                left_sum += arr[j];
            int right_sum = 0;
            for (int j = i + 1; j < n; j++)
                right_sum += arr[j];
            if (left_sum == right_sum)
                res = Math.max(res, left_sum + arr[i] + right_sum);
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