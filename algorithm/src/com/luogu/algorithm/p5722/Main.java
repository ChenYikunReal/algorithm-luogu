package com.luogu.algorithm.p5722;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(num*(num+1)/2);
        scanner.close();
    }
}
