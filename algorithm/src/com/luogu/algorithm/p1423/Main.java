package com.luogu.algorithm.p1423;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double range = scanner.nextDouble();
        double sum = 0.0;
        int step = 0;
        double nextStep = 2.0;
        while (sum < range) {
            sum += nextStep;
            nextStep *= 0.98;
            step++;
        }
        System.out.println(step);
        scanner.close();
    }
}
