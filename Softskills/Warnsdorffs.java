package Softskills;

import java.util.*;

public class Warnsdorffs {
    static final int[][] KNIGHT_MOVES = {
            { 2, 1 }, { 1, 2 }, { -1, 2 }, { -2, 1 },
            { -2, -1 }, { -1, -2 }, { 1, -2 }, { 2, -1 }
    };

    // Count valid next moves from current position
    static int countOptions(int[][] board, int x, int y) {
        int count = 0;
        int n = board.length;

        for (int[] move : KNIGHT_MOVES) {
            int nx = x + move[0];
            int ny = y + move[1];
            if (isValid(nx, ny, n) && board[nx][ny] == -1) {
                count++;
            }
        }
        return count;
    }

    // Check if position is valid and unvisited
    static boolean isValid(int x, int y, int n) {
        return x >= 0 && y >= 0 && x < n && y < n;
    }

    // Get all valid moves sorted by Warnsdorff's heuristic (fewest onward moves
    // first)
    static List<int[]> getSortedMoves(int[][] board, int x, int y) {
        List<int[]> moves = new ArrayList<>();
        int n = board.length;

        for (int i = 0; i < KNIGHT_MOVES.length; i++) {
            int nx = x + KNIGHT_MOVES[i][0];
            int ny = y + KNIGHT_MOVES[i][1];

            if (isValid(nx, ny, n) && board[nx][ny] == -1) {
                int options = countOptions(board, nx, ny);
                moves.add(new int[] { options, i, nx, ny });
            }
        }

        // Sort by number of options (Warnsdorff's heuristic)
        moves.sort(Comparator.comparingInt(a -> a[0]));
        return moves;
    }

    // Recursive function to find knight's tour
    static boolean solve(int x, int y, int step, int[][] board) {
        int n = board.length;

        // Base case: all squares visited
        if (step == n * n) {
            return true;
        }

        // Try all valid moves sorted by Warnsdorff's heuristic
        List<int[]> moves = getSortedMoves(board, x, y);

        for (int[] move : moves) {
            int nx = move[2];
            int ny = move[3];

            // Place knight
            board[nx][ny] = step;

            // Recursively try to complete the tour
            if (solve(nx, ny, step + 1, board)) {
                return true;
            }

            // Backtrack
            board[nx][ny] = -1;
        }

        return false;
    }

    // Main function to solve Knight's Tour problem
    static int[][] knightTour(int n) {
        int[][] board = new int[n][n];

        // Initialize board with -1 (unvisited)
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], -1);
        }

        // Start from (0, 0)
        board[0][0] = 0;

        if (!solve(0, 0, 1, board)) {
            return null; // No solution exists
        }

        return board;
    }

    // Print the board
    static void printBoard(int[][] board) {
        for (int[] row : board) {
            for (int val : row) {
                System.out.printf("%3d", val);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the board size (N): ");
        int n = sc.nextInt();

        System.out.println("\nSolving Knight's Tour using Warnsdorff's Algorithm...");
        int[][] result = knightTour(n);

        if (result == null) {
            System.out.println("No solution exists for " + n + "x" + n + " board.");
        } else {
            System.out.println("Solution found:\n");
            printBoard(result);
        }

        sc.close();
    }
}