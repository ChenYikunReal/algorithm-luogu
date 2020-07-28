package com.luogu.algorithm.p4445;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        String[] strArr = scanner.nextLine().split(" ");
        int[] array = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            array[i] = Integer.parseInt(strArr[i]);
        }
        long counter = 0;
        for (int i = 1; i < num; i++) {
            counter += Math.max(array[i], array[i-1]);
        }
        System.out.println(counter);
    }
}
