package com.luogu.algorithm.p1876;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        long sqrtResult = (long)Math.sqrt(num);
        for (long i = 1; i < sqrtResult; i++) {
            System.out.print(i*i + " ");
        }
        System.out.print(sqrtResult*sqrtResult);
        scanner.close();
    }
}
