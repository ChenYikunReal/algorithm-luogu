package com.luogu.algorithm.p1075;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(num/i);
                break;
            }
        }
        scanner.close();
    }
}
