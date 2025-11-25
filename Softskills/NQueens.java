package Softskills;

import java.util.*;

public class NQueens {
    static boolean solutionFound = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the board size (N): ");
        int n = sc.nextInt();
        int[] queenPos = new int[n];
        boolean[] rows = new boolean[n];
        boolean[] lowerDiagonal = new boolean[2 * n - 1];
        boolean[] upperDiagonal = new boolean[2 * n - 1];

        solve(0, n, queenPos, rows, lowerDiagonal, upperDiagonal);

        if (!solutionFound) {
            System.out.println("No solution exists.");
        }
        sc.close();
    }

    static void solve(int col, int n, int[] queenPos, boolean[] rows,
            boolean[] lowerDiagonal, boolean[] upperDiagonal) {
        if (col == n) {
            solutionFound = true;
            System.out.println("Solution found:");
            printBoard(queenPos, n);
            return;
        }

        for (int row = 0; row < n; row++) {
            int lowerDiagIndex = row + col;
            int upperDiagIndex = col - row + n - 1;

            if (!rows[row] && !lowerDiagonal[lowerDiagIndex] && !upperDiagonal[upperDiagIndex]) {
                // Place queen
                queenPos[col] = row;
                rows[row] = true;
                lowerDiagonal[lowerDiagIndex] = true;
                upperDiagonal[upperDiagIndex] = true;

                solve(col + 1, n, queenPos, rows, lowerDiagonal, upperDiagonal);

                if (solutionFound)
                    return;

                // Backtrack
                rows[row] = false;
                lowerDiagonal[lowerDiagIndex] = false;
                upperDiagonal[upperDiagIndex] = false;
            }
        }
    }

    static void printBoard(int[] queenPos, int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (queenPos[col] == row) {
                    System.out.print("Q ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }
}