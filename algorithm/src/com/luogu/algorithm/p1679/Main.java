package com.luogu.algorithm.p1679;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        int[] f = new int[num+1];
        Arrays.fill(f, (int)1e8);
        f[0] = 0;
        int limit = (int)Math.pow(num, 0.25);
        int[] cost = new int[limit+1];
        for (int i = 0; i <= limit; i++) {
            cost[i] = i*i*i*i;
        }
        for(int i = 1; i <= limit; i++) {
            for(int j = cost[i]; j <= num; j++) {
                f[j] = Math.min(f[j], f[j-cost[i]]+1);
            }
        }
        System.out.println(f[num]);
    }
}
