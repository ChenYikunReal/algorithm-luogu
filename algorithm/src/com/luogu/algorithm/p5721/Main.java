package com.luogu.algorithm.p5721;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        int temp = 0;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num-i+1; j++) {
                temp++;
                if (temp < 10) {
                    System.out.print("0" + temp);
                } else {
                    System.out.print(temp);
                }
            }
            System.out.println();
        }
    }
}
