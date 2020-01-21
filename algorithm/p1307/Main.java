package com.luogu.algorithm.p1307;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long num = scanner.nextLong();
        scanner.close();
        boolean neg = false;
        if (num < 0) {
            System.out.print("-");
            neg = true;
        }
        char[] chars = num.toString().toCharArray();
        int counter = 0;
        for (int i = chars.length-1; i >= 0; i--) {
            if (chars[i] != 48) {
                break;
            }
            counter++;
        }
        if (neg) {
            for (int i = chars.length-counter-1; i >= 1; i--) {
                System.out.print(chars[i]);
            }
        } else {
            for (int i = chars.length-counter-1; i >= 0; i--) {
                System.out.print(chars[i]);
            }
        }
    }
}
