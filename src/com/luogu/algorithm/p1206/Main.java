package com.luogu.algorithm.p1206;

import java.util.Scanner;

public class Main {

    private static boolean isPalindromic(char[] chars) {
        for (int i = 0; i < chars.length/2; i++) {
            if (chars[i] != chars[chars.length-1-i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= 300; i++) {
            String temp_num = Integer.toString(i*i, num);
            if (isPalindromic(temp_num.toCharArray())) {
                System.out.println(Integer.toString(i, num).toUpperCase() + " " + temp_num.toUpperCase());
            }
        }
    }

}
