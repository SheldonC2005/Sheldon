package Softskills;

import java.util.*;

public class Maze {
    static int N;

    void printSolution(int[][] sol) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(" " + sol[i][j] + " ");
            System.out.println();
        }
    }

    boolean isSafe(int[][] maze, int x, int y) {
        return (x >= 0 && x < N && y >= 0 && y < N &&
                maze[x][y] == 1);
    }

    boolean solveMaze(int[][] maze) {
        int[][] sol = new int[N][N];
        if (!solveMazeUtil(maze, 0, 0, sol)) {
            System.out.println("Solution doesn't exist");
            return false;
        }
        printSolution(sol);
        return true;
    }

    boolean solveMazeUtil(int[][] maze, int x, int y, int[][] sol) {
        if (x == N - 1 && y == N - 1 && maze[x][y] == 1) {
            sol[x][y] = 1;
            return true;
        }
        if (isSafe(maze, x, y)) {
            sol[x][y] = 1;
            if (solveMazeUtil(maze, x + 1, y, sol))
                return true;
            if (solveMazeUtil(maze, x, y + 1, sol))
                return true;
            if (solveMazeUtil(maze, x - 1, y, sol))
                return true;
            if (solveMazeUtil(maze, x, y - 1, sol))
                return true;
            sol[x][y] = 0;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Maze maze = new Maze();
        System.out.print("Enter the size of the maze (N x N): ");
        N = sc.nextInt();
        int[][] mazeMatrix = new int[N][N];
        System.out.println("Enter the maze matrix (only 0s and 1s):");
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                mazeMatrix[i][j] = sc.nextInt();
        maze.solveMaze(mazeMatrix);
        sc.close();
    }
}