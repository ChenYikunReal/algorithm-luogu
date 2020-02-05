package com.luogu.algorithm.p2084;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int radix = scanner.nextInt();
        char[] num = scanner.next().toCharArray();
        scanner.close();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < num.length; i++) {
            int temp = num[i] - 48;
            if (temp != 0) {
                result.append("+").append(temp).append("*").append(radix).append("^").append(num.length-1-i);
            }
        }
        System.out.println(result.toString().substring(1));
    }
}
