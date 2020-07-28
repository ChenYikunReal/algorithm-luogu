package com.luogu.algorithm.p5706;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double all = scanner.nextDouble();
        int num = scanner.nextInt();
        scanner.close();
        System.out.printf("%.3f\n", all/num);
        System.out.println(2*num);
    }
}
