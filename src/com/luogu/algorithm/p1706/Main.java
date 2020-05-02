package com.luogu.algorithm.p1706;

import java.util.Scanner;

public class Main {

    private static StringBuilder result = new StringBuilder();

    private static int num;

    private static int[] sequence;

    private static boolean[] used;

    private static void dfs(int k) {
        if (k == num) {
            for (int j = 1; j <= num; j++) {
                result.append(' ').append(' ').append(' ').append(' ').append(sequence[j]);
            }
            result.append('\n');
            return;
        }
        for (int i = 1; i <= num; i++) {
            if (!used[i]) {
                used[i] = true;
                sequence[k+1] = i;
                dfs(k+1);
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        scanner.close();
        sequence = new int[num+1];
        used = new boolean[num+1];
        dfs(0);
        System.out.print(result);
    }

}
