package com.luogu.algorithm.p1320;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstLine = scanner.nextLine();
        int num = firstLine.length(), tempCounter = 0;
        boolean zero = true;
        String[] array = new String[num];
        array[0] = firstLine;
        for (int i = 1; i < num; i++) {
            array[i] = scanner.nextLine();
        }
        scanner.close();
        StringBuilder builder = new StringBuilder(num + " ");
        for (int i = 0; i < num; i++) {
            char[] chars = array[i].toCharArray();
            for (char c : chars) {
                if (c == '0') {
                    if (zero) {
                        tempCounter++;
                    } else {
                        builder.append(tempCounter).append(" ");
                        tempCounter = 1;
                        zero = true;
                    }
                } else {
                    if (zero) {
                        builder.append(tempCounter).append(" ");
                        tempCounter = 1;
                        zero = false;
                    } else {
                        tempCounter++;
                    }
                }
            }
        }
        if (tempCounter != 0) {
            builder.append(tempCounter);
        }
        System.out.println(builder.toString().trim());
    }
}
