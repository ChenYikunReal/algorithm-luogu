package com.luogu.algorithm.p4702;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        //非奇数==偶数
        boolean isOdd = false;
        for (int i = 0; i < num; i++) {
            int temp = scanner.nextInt();
            //奇数
            if ((temp & 1) == 1) {
                isOdd = !isOdd;
            }
        }
        scanner.close();
        if (isOdd) {
            System.out.println("Alice");
        } else {
            System.out.println("Bob");
        }
    }
}
