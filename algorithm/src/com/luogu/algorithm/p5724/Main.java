package com.luogu.algorithm.p5724;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int max = scanner.nextInt(), min = max;
        for (int i = 1; i < num; i++) {
            int temp = scanner.nextInt();
            if (temp > max) {
                max = temp;
            }
            if (temp < min) {
                min = temp;
            }
        }
        scanner.close();
        System.out.println(max - min);
    }
}
