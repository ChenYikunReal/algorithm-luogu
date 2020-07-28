package com.luogu.algorithm.p1007;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt(), num = scanner.nextInt(), max = 0, min = 0;
        for (int i = 0; i < num; i++) {
            int temp = scanner.nextInt();
            max = Math.max(max, Math.max(length-temp+1, temp));
            min = Math.max(min, Math.min(length-temp+1, temp));
        }
        System.out.println(min + " " + max);
        scanner.close();
    }
}
