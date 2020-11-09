package com.luogu.algorithm.p6426;

import static java.lang.Math.max;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
        System.out.println(max(b-a, c-b)-1);
        scanner.close();
    }

}
