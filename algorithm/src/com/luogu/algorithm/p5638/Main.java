package com.luogu.algorithm.p5638;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(), radius = scanner.nextInt();
        long[] sum_array = new long[num];
        for (int i = 0; i < num-1; i++) {
            sum_array[i+1] = sum_array[i] + scanner.nextLong();
        }
        scanner.close();
        long count = sum_array[radius];
        for(int i = 1; i < num-radius; i++) {
            count = Math.max(count, (sum_array[i+radius]-sum_array[i]));
        }
        System.out.println(sum_array[num-1]-count);
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt(), radius = scanner.nextInt();
//        long[][] dp = new long[num+1][2];
//        long[] array = new long[num];
//        for (int i = 1; i < num; i++) {
//            array[i] = scanner.nextLong();
//        }
//        scanner.close();
//        for(int i = 2; i <= num;i++) {
//            dp[i][0] = dp[i-1][0] + array[i-1];
//            if(i > radius) {
//                dp[i][1] = dp[i-radius][0];
//            }
//            dp[i][1] = Math.min(dp[i-1][1]+array[i-1], dp[i][1]);//状态转移方程
//        }
//        System.out.println(dp[num][1]);
    }
}
