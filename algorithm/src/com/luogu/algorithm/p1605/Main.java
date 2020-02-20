package com.luogu.algorithm.p1605;

import java.util.Scanner;

public class Main {

    private static int x2, y2, m, n;

    private static int dfs(int x, int y, boolean[][] graph) {
        if (x < 1 || x > m || y < 1 || y > n || graph[x][y]) {
            return 0;
        } else if (x == x2 && y == y2) {
            return 1;
        }
        graph[x][y] = true;
        boolean[][] array1 = new boolean[m+1][n+1];
        boolean[][] array2 = new boolean[m+1][n+1];
        boolean[][] array3 = new boolean[m+1][n+1];
        boolean[][] array4 = new boolean[m+1][n+1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                array1[i][j] = graph[i][j];
                array2[i][j] = graph[i][j];
                array3[i][j] = graph[i][j];
                array4[i][j] = graph[i][j];
            }
        }
        return dfs(x-1, y, array1) + dfs(x+1, y, array2) + dfs(x, y-1, array3) + dfs(x, y+1, array4);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        m = scanner.nextInt();
        n = scanner.nextInt();
        int num = scanner.nextInt();
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        x2 = scanner.nextInt();
        y2 = scanner.nextInt();
        boolean[][] graph = new boolean[m+1][n+1];
        for (int i = 0; i < num; i++) {
            graph[scanner.nextInt()][scanner.nextInt()] = true;
        }
        scanner.close();
        System.out.println(dfs(x1, y1, graph));
    }

}
