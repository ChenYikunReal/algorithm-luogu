package com.luogu.algorithm.p1085;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int result = 0;
        for (int i = 1; i <= 7; i++) {
            int x = scanner.nextInt(), y = scanner.nextInt();
            int temp = x + y;
            if (temp > 8 && temp > max) {
                max = temp;
                result = i;
            }
        }
        System.out.println(result);
        scanner.close();
    }
}
