package com.luogu.algorithm.p2181;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger number = scanner.nextBigInteger();
        scanner.close();
        BigInteger num1 = new BigInteger("1");
        BigInteger num2 = new BigInteger("2");
        BigInteger num3 = new BigInteger("3");
        BigInteger num4 = new BigInteger("4");
        number = number.multiply(number.subtract(num1)).divide(num2).multiply(number.subtract(num2)).divide(num3)
                .multiply(number.subtract(num3)).divide(num4);
        System.out.println(number);
    }
}
