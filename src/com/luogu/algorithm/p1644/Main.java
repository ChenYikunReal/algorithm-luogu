package com.luogu.algorithm.p1644;

import java.util.Scanner;

public class Main {

    private static int counter, m, n;

    private static void dfs(int x, int y) {
        if (x > m || y < 0 || y > n) {
            return;
        } else if (x == m && y == n) {
            counter++;
        } else {
            dfs(x+1, y+2);
            dfs(x+1, y-2);
            dfs(x+2, y+1);
            dfs(x+2, y-1);
        }
    }

    public static void main(String[] args) {
        counter = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        scanner.close();
        dfs(0, 0);
        System.out.println(counter);
    }

}
