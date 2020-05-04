package com.luogu.algorithm.p1192;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), k = scanner.nextInt();
        scanner.close();
        int[] nums = new int[n+1];
        nums[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k && i-j >= 0; j++) {
                nums[i] += nums[i-j];
                nums[i] %= 100003;
            }
        }
        System.out.println(nums[n]);
    }
}
