package com.luogu.algorithm.p1553;

import java.util.Scanner;

public class Main {

    private static String reverse1(String num) {
        char[] chars = new StringBuilder(num).reverse().toString().toCharArray();
        int count = 0;
        while (count < chars.length && chars[count] == '0') {
            count++;
        }
        if (count >= chars.length) {
            return "0";
        }
        return new String(chars).substring(count);
    }

    private static String reverse2(String num) {
        char[] chars = new StringBuilder(num).reverse().toString().toCharArray();
        int count = chars.length-1;
        while (count >= 0 && chars[count] == '0') {
            count--;
        }
        if (count < 0) {
            return "0";
        }
        return new String(chars).substring(0, count+1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        scanner.close();
        if (num.contains(".")) {
            //小数
            String[] nums = num.split("\\.");
            System.out.println(reverse1(nums[0]) + "." + reverse2(nums[1]));
        } else if (num.contains("/")) {
            //分数
            String[] nums = num.split("/");
            System.out.println(reverse1(nums[0]) + "/" + reverse1(nums[1]));
        } else if (num.endsWith("%")) {
            //百分数
            System.out.println(reverse1(num.substring(0, num.length()-1)) + "%");
        } else {
            //整数
            System.out.println(reverse1(num));
        }
    }
}
