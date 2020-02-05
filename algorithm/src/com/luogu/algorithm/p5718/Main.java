package com.luogu.algorithm.p5718;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(), min = scanner.nextInt();
        for (int i = 1; i < num; i++) {
            int temp = scanner.nextInt();
            if (temp < min) {
                min = temp;
            }
        }
        scanner.close();
        System.out.println(min);
    }
}
