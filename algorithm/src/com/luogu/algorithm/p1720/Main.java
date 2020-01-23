package com.luogu.algorithm.p1720;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        long num1 = 1, num2 = 1, result = 0;
        for (int i = 3; i <= num; i++) {
            result = num1 + num2;
            num1 = num2;
            num2 = result;
        }
        System.out.println(result + ".00");
    }
}
