package com.luogu.algorithm.p1426;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double position = scanner.nextDouble(), radius = scanner.nextDouble();
        scanner.close();
        double tempPosition = 0.0, nextRange = 7.0;
        while (tempPosition < position - radius) {
            tempPosition += nextRange;
            nextRange *= 0.98;
        }
        if (tempPosition + nextRange > position + radius) {
            System.out.println("n");
        } else {
            System.out.println("y");
        }
    }
}
