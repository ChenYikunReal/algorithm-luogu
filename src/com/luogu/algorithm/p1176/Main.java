package com.luogu.algorithm.p1176;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt();
        int[][] nums = new int[n+1][n+1];
        for (int i = 0; i < m; i++) {
            nums[scanner.nextInt()][scanner.nextInt()] = -1;
        }
        scanner.close();
        nums[1][1] = 1;
        for (int i = 2; i <= n; i++) {
            if (nums[1][i] == -1) {
                nums[1][i] = 0;
            } else {
                nums[1][i] = nums[1][i-1];
            }
            if (nums[i][1] == -1) {
                nums[i][1] = 0;
            } else {
                nums[i][1] = nums[i-1][1];
            }
        }
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= n; j++) {
                if (nums[i][j] == -1) {
                    nums[i][j] = 0;
                } else {
                    nums[i][j] = (nums[i-1][j] + nums[i][j-1]) % 100003;
                }
            }
        }
        System.out.println(nums[n][n]);
    }
}
