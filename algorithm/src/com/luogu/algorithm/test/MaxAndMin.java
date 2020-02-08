package com.luogu.algorithm.test;

import java.util.Scanner;

public class MaxAndMin {

    private static int max (int a, int b) {
        return (a+b+Math.abs(a-b))/2;
    }

    private static int min (int a, int b) {
        return (a+b-Math.abs(a-b))/2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt();
        System.out.println(a +"和" + b + "的最大值是：" + max(a, b));
        System.out.println(a +"和" + b + "的最小值是：" + min(a, b));
        scanner.close();
    }

}
