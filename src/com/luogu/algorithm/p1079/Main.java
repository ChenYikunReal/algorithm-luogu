package com.luogu.algorithm.p1079;

import java.util.Scanner;

//注意-9%26==-9
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] chars1 = scanner.nextLine().trim().toCharArray();
        char[] chars2 = scanner.nextLine().trim().toCharArray();
        scanner.close();
        for (int i = 0; i < chars2.length; i++) {
            int temp = chars2[i] - chars1[i%chars1.length] + 26;
            boolean isUpper = Character.isUpperCase(chars1[i%chars1.length]);
            if (Character.isUpperCase(chars2[i])) {
                if (isUpper) {
                    chars2[i] = (char)((temp % 26) + 'A');
                } else {
                    chars2[i] = (char)(((temp - 'A' + 'a') % 26) + 'A');
                }
            } else {
                if (isUpper) {
                    chars2[i] = (char)(((temp - 'a' + 'A') % 26) + 'a');
                } else {
                    chars2[i] = (char)((temp % 26) + 'a');
                }
            }
        }
        System.out.println(new String(chars2));
    }
}
