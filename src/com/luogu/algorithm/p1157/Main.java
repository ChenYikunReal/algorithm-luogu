package com.luogu.algorithm.p1157;

import java.util.Scanner;

public class Main {

    private static int r, n;

    private static int[] array;

    private static void dfs(int k) {
        if(k > r) {
            StringBuilder builder = new StringBuilder();
            for(int i = 1; i <= r; i++) {
                if (array[i] >= 10) {
                    builder.append(" ").append(array[i]);
                } else {
                    builder.append("  ").append(array[i]);
                }
            }
            System.out.println(builder);
            return;
        }
        for(int i = array[k-1]+1; i <= n; i++){
            array[k] = i;
            dfs(k+1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        r = scanner.nextInt();
        scanner.close();
        array = new int[n+1];
        dfs(1);
    }

}
