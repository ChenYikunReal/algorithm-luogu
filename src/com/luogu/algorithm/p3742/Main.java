package com.luogu.algorithm.p3742;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        char[] chars1 = scanner.nextLine().toCharArray();
        String string = scanner.nextLine();
        char[] chars2 = string.toCharArray();
        scanner.close();
        for (int i = 0; i < num; i++) {
            if (chars1[i] < chars2[i]) {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(string);
    }
}
