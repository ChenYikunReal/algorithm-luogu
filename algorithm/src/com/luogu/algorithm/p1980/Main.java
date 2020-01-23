package com.luogu.algorithm.p1980;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toNum = scanner.nextInt(), searchNum = scanner.nextInt();
        int[] array = new int[10];
        for (Integer i = 1; i <= toNum; i++) {
            for (char c : i.toString().toCharArray()) {
                array[c-48]++;
            }
        }
        System.out.println(array[searchNum]);
        scanner.close();
    }
}
