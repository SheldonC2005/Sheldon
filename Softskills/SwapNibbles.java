package Softskills;

import java.util.Scanner;

public class SwapNibbles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int swapnum;
        swapnum = ((num & 0x0F) << 4 | (num & 0xF0) >> 4);
        System.out.println("Before swapping the nibble: " + num);
        System.out.println("\n After swapping the nibble: " + swapnum);
        scanner.close();
    }
}