package com.luogu.algorithm.p2393;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0.0;
        String line = scanner.nextLine();
        if ("".equals(line)) {
            System.out.println("0.00000");
            return;
        }
        String[] array = line.trim().split("\\s+");
        scanner.close();
        for (String s : array) {
            sum += 1000000 * Double.parseDouble(s);
        }
        System.out.printf("%.5f", sum/1000000);
    }
}
