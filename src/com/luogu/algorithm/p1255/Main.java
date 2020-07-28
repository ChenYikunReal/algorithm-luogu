package com.luogu.algorithm.p1255;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        if (num == 0) {
            System.out.println(0);
            return;
        }
        BigInteger[] nums = new BigInteger[num+1];
        nums[0] = nums[1] = BigInteger.ONE;
        for (int i = 2; i <= num; i++) {
            nums[i] = nums[i-1].add(nums[i-2]);
        }
        System.out.println(nums[num]);
    }
}
