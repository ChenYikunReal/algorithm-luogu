package com.luogu.algorithm.p1207;

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
        int n = scanner.nextInt(), from_num = scanner.nextInt();
        scanner.close();
        for (int i = from_num+1; n > 0; i++) {
            int counter = 0;
            for (int j = 2; j <= 10 && counter < 2; j++) {
                if (isPalindromic(Integer.toString(i, j).toCharArray())) {
                    counter++;
                }
            }
            if (counter == 2) {
                System.out.println(i);
                n--;
            }
        }
    }

}
