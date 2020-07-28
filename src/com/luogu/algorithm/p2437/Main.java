package com.luogu.algorithm.p2437;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt(), n = scanner.nextInt();
        scanner.close();
        BigInteger[] nums = new BigInteger[n+1];
        nums[m] = nums[m+1] = BigInteger.ONE;
        for (int i = m+2; i <= n; i++) {
            nums[i] = nums[i-1].add(nums[i-2]);
        }
        System.out.println(nums[n]);
    }
}
