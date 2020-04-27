package com.luogu.algorithm.p1098;

import java.util.Scanner;

public class Main {

    private static boolean isTypeEqual(char var1, char var2) {
        return (var1 < var2) && ((Character.isDigit(var1) && Character.isDigit(var2)) ||
                (Character.isLowerCase(var1) && Character.isLowerCase(var2)));
    }

    private static void generateAppendString(char from, char to, StringBuilder result, int times,
            boolean isStar, boolean isUpper, boolean isReversed) {
        if (isReversed) {
            for (char i = (char)(to-1); i > from; i--) {
                char add = isStar ? '*' : (Character.isDigit(i) ? i : ((isUpper ? (char)(i-32) : i)));
                for (int j = 0; j < times; j++) {
                    result.append(add);
                }
            }
        } else {
            for (char i = (char)(from+1); i < to; i++) {
                char add = isStar ? '*' : (Character.isDigit(i) ? i : ((isUpper ? (char)(i-32) : i)));
                for (int j = 0; j < times; j++) {
                    result.append(add);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p1 = scanner.nextInt(), p2 = scanner.nextInt(), p3 = scanner.nextInt();
        boolean isStar = p1 == 3;
        boolean isUpper = p1 == 2;
        boolean isReversed = p3 == 2;
        String line = scanner.next();
        scanner.close();
        StringBuilder result = new StringBuilder();
        char[] chars = line.toCharArray();
        for (int i = 0; i < line.length()-2; i++) {
            result.append(chars[i]);
            if (chars[i+1] == '-') {
                if (isTypeEqual(chars[i], chars[i+2])) {
                    generateAppendString(chars[i], chars[i+2], result, p2, isStar, isUpper, isReversed);
                    ++i;
                } else {
                    result.append(chars[++i]);
                }
            }
        }
        if (chars[line.length()-2] != '-' || chars[line.length()-3] == '-') {
            result.append(chars[line.length()-2]);
        }
        result.append(chars[line.length()-1]);
        System.out.println(result);
    }
}
