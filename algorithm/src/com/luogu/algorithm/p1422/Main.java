package com.luogu.algorithm.p1422;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        final int LOW_NUM = 150;
        final int HIGH_NUM = 400;
        final double LOW_RATE = 0.4463;
        final double MIDDLE_RATE = 0.4663;
        final double HIGH_RATE = 0.5663;
        double result;
        if (num <= LOW_NUM) {
            result = LOW_RATE * num;
        } else if (num <= HIGH_NUM) {
            result = MIDDLE_RATE * (num-LOW_NUM) + LOW_RATE * LOW_NUM;
        } else {
            result = HIGH_RATE * (num-HIGH_NUM) + MIDDLE_RATE * (HIGH_NUM-LOW_NUM) + LOW_RATE * LOW_NUM;
        }
        System.out.printf("%.1f", result);
        scanner.close();
    }
}
