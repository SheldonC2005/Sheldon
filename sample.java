import java.util.*;

class sample {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        boolean arr[] = new boolean[num + 1];
        for (int i = 0; i <= num; i++) {
            arr[i] = true;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (arr[i] == true) {
                for (int j = i * i; j <= num; j += i) {
                    arr[j] = false;
                }
            }
        }
        for (int i = 50; i <= 60; i++) {
            if (arr[i] == true) {
                System.out.println(i + " ");
            }
        }
    }
}