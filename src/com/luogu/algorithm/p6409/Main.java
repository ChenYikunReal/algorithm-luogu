package com.luogu.algorithm.p6409;

import java.util.Scanner;

public class Main {

    private static boolean judge(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        char[] chars = str.toCharArray();
        int i, length = chars.length;
        for (i = 0; i <= length-3; i++) {
            if (judge(chars[i]) && chars[i+1] == 'p' && chars[i] == chars[i+2]) {
                i+=2;
            }
            result.append(chars[i]);
        }
        if (i == length-2) {
            result.append(chars[length-2]+chars[length-1]);
        } else if (i == length-1) {
            result.append(chars[length-1]);
        }
        System.out.println(result);;
    }

}
