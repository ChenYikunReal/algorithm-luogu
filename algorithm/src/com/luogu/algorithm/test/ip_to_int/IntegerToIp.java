package com.luogu.algorithm.test.ip_to_int;

import java.util.Scanner;

public class IntegerToIp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = Long.toString(scanner.nextLong(), 2);
        int length = num.length();
        System.out.println(Integer.parseInt(num.substring(0, length-24), 2) + "." +
                Integer.parseInt(num.substring(length-24, length-16), 2) + "." +
                Integer.parseInt(num.substring(length-16, length-8), 2) + "." +
                Integer.parseInt(num.substring(length-8, length), 2));
        scanner.close();
    }
}
