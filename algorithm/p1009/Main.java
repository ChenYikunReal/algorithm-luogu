package com.luogu.algorithm.p1009;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();
        BigInteger sum = new BigInteger("0");
        for (int i = 1; i <= limit; i++) {
            BigInteger temp = new BigInteger("1");
            for (Integer j = 1; j <= i; j++) {
                temp = temp.multiply(new BigInteger(j.toString()));
            }
            sum = sum.add(temp);
        }
        System.out.println(sum.toString());
        scanner.close();
    }
}
