package com.luogu.algorithm.test.ip_to_int;

import java.util.Scanner;

public class IpToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] info = scanner.nextLine().split("\\.");
        scanner.close();
        long num1 = Long.parseLong(info[0])<<24;
        long num2 = Long.parseLong(info[1])<<16;
        long num3 = Long.parseLong(info[2])<<8;
        System.out.println(num1+num2+num3+Long.parseLong(info[3]));
    }
}
