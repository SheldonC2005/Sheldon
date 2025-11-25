package Softskills;

import java.util.*;

public class Hamiltonian {
    int n, path[];
    int[][] g;

    boolean solve(int v, int pos) {
        if (pos == n)
            return g[v][0] == 1;

        for (int i = 1; i < n; i++) {
            if (g[v][i] == 1 && !isInPath(i)) {
                path[pos] = i;
                if (solve(i, pos + 1))
                    return true;
                path[pos] = -1;
            }
        }
        return false;
    }

    boolean isInPath(int v) {
        for (int i = 0; i < n; i++)
            if (path[i] == v)
                return true;
        return false;
    }

    void find(int[][] graph) {
        n = graph.length;
        g = graph;
        path = new int[n];
        Arrays.fill(path, -1);
        path[0] = 0;

        if (solve(0, 1)) {
            System.out.print("Cycle: ");
            for (int i = 0; i < n; i++)
                System.out.print(path[i] + " ");
            System.out.println("0");
        } else {
            System.out.println("No solution");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vertices: ");
        int n = sc.nextInt();
        int[][] g = new int[n][n];
        System.out.println("Adjacency matrix:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                g[i][j] = sc.nextInt();
        new Hamiltonian().find(g);
        sc.close();
    }
}
