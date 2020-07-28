package com.luogu.algorithm.p2719;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt()>>1;
        scanner.close();
        double result = 1.0;
        for (int i = 1; i < num; i++) {
            result *= (double) (i + num - 1) / (i << 2);
        }
        System.out.printf("%.4f", 1-result);
    }
}
