package com.luogu.algorithm.p2415;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().trim().split("\\s+");
        long sum = 0;
        for (String s : array) {
            sum += Long.parseLong(s);
        }
        System.out.println(new BigInteger("2").pow(array.length-1).multiply(new BigInteger(Long.toString(sum))));
        scanner.close();
    }
}
