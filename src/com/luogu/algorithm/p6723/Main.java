package com.luogu.algorithm.p6723;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt(), right = sc.nextInt(), sum = sc.nextInt(), temp, max = left, min = right;
        sc.close();
        String num;
        for (int i = left; i <= right; i++) {
            num = Integer.toString(i);
            temp = 0;
            for (char c : num.toCharArray()) {
                temp += (c-'0');
            }
            if (temp == sum) {
                min = Math.min(i, min);
                max = Math.max(i, max);
            }
        }
        System.out.println(min);
        System.out.println(max);
    }

}
