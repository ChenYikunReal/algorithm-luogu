package com.luogu.algorithm.p1100;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = Integer.toBinaryString(scanner.nextInt());
        int length = num.length();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 32-length; i++) {
            builder.append("0");
        }
        num = builder.append(num).toString();
        num = num.substring(16) + num.substring(0, 16);
        int counter = 0;
        for (char c : num.toCharArray()) {
            if (c != '0') {
                break;
            }
            counter++;
        }
        num = num.substring(counter);
        System.out.println(Long.parseLong(num, 2));
        scanner.close();
    }
}
