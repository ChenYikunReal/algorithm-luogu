package com.luogu.algorithm.p5681;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
        scanner.close();
        if (a*a > b*c) {
            System.out.println("Alice");
        } else {
            System.out.println("Bob");
        }
    }
}
