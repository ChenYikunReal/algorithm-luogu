package com.luogu.algorithm.p5709;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt(), t = scanner.nextInt(), s = scanner.nextInt();
        if (t == 0) {
            System.out.println(0);
            return;
        }
        int temp =  (int) Math.ceil((double)s / t);
        m -= temp;
        if (m < 0) {
            System.out.println(0);
        } else {
            System.out.println(m);
        }
        scanner.close();
    }
}
