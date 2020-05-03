package com.luogu.algorithm.p1164;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        scanner.close();
        int[] result = new int[m+1];
        result[0] = 1;
        for (int i : nums) {
            for (int j = m; j >= i; j--) {
                result[j] += result[j-i];
            }
        }
        System.out.println(result[m]);
    }
}
