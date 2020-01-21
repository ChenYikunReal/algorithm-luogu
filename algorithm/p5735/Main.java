package com.luogu.algorithm.p5735;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = scanner.nextDouble(), y1 = scanner.nextDouble(), x2 = scanner.nextDouble(),
                y2 = scanner.nextDouble(), x3 = scanner.nextDouble(), y3 = scanner.nextDouble();
        double l1 = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        double l2 = Math.sqrt(Math.pow(x3-x2, 2) + Math.pow(y3-y2, 2));
        double l3 = Math.sqrt(Math.pow(x3-x1, 2) + Math.pow(y3-y1, 2));
        System.out.printf("%.2f", l1+l2+l3);
        scanner.close();
    }
}
