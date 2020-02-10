package com.luogu.algorithm.p1303;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.nextBigInteger().multiply(scanner.nextBigInteger()));
        scanner.close();
    }
}
