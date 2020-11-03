package com.luogu.algorithm.p6159;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong(), p = scanner.nextLong(), k = scanner.nextLong();
        System.out.println(p*k%n);
        scanner.close();
    }

}
