package com.luogu.algorithm.p4326;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        System.out.printf("%.6f\n%.6f", Math.PI*num*num, 2.0*num*num);
    }
}
