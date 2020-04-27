package com.luogu.algorithm.p1304;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        for (int i = 4; i <= num; i+=2) {
            for (int j = 2; j < num; j++) {
                if (judgePrime(j) && judgePrime(i-j)) {
                    System.out.println(i + "=" + j + "+" + (i-j));
                    break;
                }
            }
        }
    }
    private static boolean judgePrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
