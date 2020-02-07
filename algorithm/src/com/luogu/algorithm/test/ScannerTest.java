package com.luogu.algorithm.test;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.next("\\d+"));
        System.out.println(scanner.next());
        scanner.close();
    }
}
