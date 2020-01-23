package com.luogu.algorithm.p1179;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int from = scanner.nextInt(), to = scanner.nextInt();
        scanner.close();
        int counter = 0;
        for (Integer i = from; i <= to; i++) {
            char[] arr = i.toString().toCharArray();
            for(char c : arr) {
                if (c == 50) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
