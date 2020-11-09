package com.luogu.algorithm.p6420;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] nums = new int[4];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            nums[i] = scanner.nextInt();
        }
        scanner.close();
        Arrays.sort(nums);
        System.out.println(nums[0] * nums[2]);
    }

}
