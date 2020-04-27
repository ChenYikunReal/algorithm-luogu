package com.luogu.algorithm.p2142;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.nextBigInteger().subtract(scanner.nextBigInteger()));
        scanner.close();
    }
}
