package com.luogu.algorithm.p1048;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt(), num = scanner.nextInt();
        int[] f = new int[time+1];
        int[] cost = new int[num], value = new int[num];
        for (int i = 0; i < num; i++) {
            cost[i] = scanner.nextInt();
            value[i] = scanner.nextInt();
        }
        scanner.close();
        for (int i = 0; i < num; i++) {
            for (int j = cost[i]; j <= time; j++) {
                if (j >= cost[i]) {
                    f[j] = Math.max(f[j], f[j-cost[i]]+value[i]);
                }
            }
        }
        System.out.println(f[time]);
    }
}
