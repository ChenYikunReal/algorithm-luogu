package com.luogu.algorithm.p1451;

import java.util.Scanner;

public class Main {

    private static int m, n, counter = 0;

    private static char[][] graph;

    private static void dfs(int x, int y) {
        if (x >= m || y >= n || x < 0 || y < 0 || graph[x][y] == '0') {
            return;
        } else {
            graph[x][y] = '0';
            dfs(x+1, y);
            dfs(x-1, y);
            dfs(x, y+1);
            dfs(x, y-1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        m = scanner.nextInt();
        n = scanner.nextInt();
        scanner.nextLine();
        graph = new char[m][n];
        for (int i = 0; i < m; i++) {
            char[] temp = scanner.nextLine().toCharArray();
            for (int j = 0; j < n; j++) {
                graph[i][j] = temp[j];
            }
        }
        scanner.close();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (graph[i][j] != '0') {
                    dfs(i, j);
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }

}
