package com.luogu.algorithm.p5708;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble(), b = scanner.nextDouble(), c = scanner.nextDouble(), p = (a+b+c)/2;
        System.out.printf("%.1f", Math.sqrt(p*(p-a)*(p-b)*(p-c)));
        scanner.close();
    }
}
