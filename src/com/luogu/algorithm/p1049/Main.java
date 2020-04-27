package com.luogu.algorithm.p1049;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = scanner.nextInt(), num = scanner.nextInt();
        int[] cost = new int[num];
        int[] f = new int[v+1];
        for (int i = 0; i < num; i++) {
            cost[i] = scanner.nextInt();
        }
        scanner.close();
        for (int i = 0; i < num; i++) {
            for (int j = v; j >= cost[i]; j--) {
                f[j] = Math.max(f[j], f[j-cost[i]]+cost[i]);
            }
        }
        System.out.println(v-f[v]);
    }
}
