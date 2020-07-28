package com.luogu.algorithm.p1601;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.nextBigInteger().add(scanner.nextBigInteger()));
        scanner.close();
    }
}
