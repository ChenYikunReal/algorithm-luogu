package com.luogu.algorithm.p2524;

import java.util.Scanner;

public class Main {

    private static int[] factorial = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};

    private static int cantor(int num, char[] chars) {
        int result = 1;
        for(int i = 0; i < num; i++) {
            int temp = 0;
            for(int j = i+1; j < num; j++) {
                if(chars[i] > chars[j]) {
                    temp++;
                }
            }
            result += temp * factorial[num-i-1];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        char[] chars = scanner.next().toCharArray();
        scanner.close();
        System.out.println(cantor(num, chars));
    }

}
