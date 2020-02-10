package com.luogu.algorithm.p1017;

import java.util.Scanner;

/**
 * WA的
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int origin_num = -scanner.nextInt();
        int radix = -scanner.nextInt();
        scanner.close();
        StringBuilder result = new StringBuilder();
        result.append(origin_num).append("=").append(Integer.toString(origin_num, radix));
        result = new StringBuilder(result.toString().toUpperCase()).append("(base").append(radix).append(")");
        System.out.println(result);
    }
}
