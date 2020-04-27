package com.luogu.algorithm.p1480;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.nextBigInteger().divide(scanner.nextBigInteger()));
        scanner.close();
    }
}
