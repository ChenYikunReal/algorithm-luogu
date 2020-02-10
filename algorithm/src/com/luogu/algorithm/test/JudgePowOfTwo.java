package com.luogu.algorithm.test;

import java.util.Scanner;

public class JudgePowOfTwo {

    private static boolean isPowOfTwo(int num) {
        return (num & num-1) == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        System.out.println(isPowOfTwo(num));
    }

}
