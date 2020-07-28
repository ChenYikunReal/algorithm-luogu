package com.luogu.algorithm.p5743;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int j = 1;
        for (int i = 1; i < num; i++) {
            j++;
            j*=2;
        }
        System.out.println(j);
        scanner.close();
    }
}
