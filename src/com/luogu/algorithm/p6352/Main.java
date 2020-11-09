package com.luogu.algorithm.p6352;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] nums = new int[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            nums[i] = scanner.nextInt();
        }
        Arrays.sort(nums);
        int a = nums[2] - nums[1], b = nums[1] - nums[0];
        if (a == b) {
            System.out.println(nums[2] + a);
        } else if (a > b) {
            System.out.println(nums[2] - b);
        } else {
            System.out.println(nums[1] - a);
        }
        scanner.close();
    }

}
