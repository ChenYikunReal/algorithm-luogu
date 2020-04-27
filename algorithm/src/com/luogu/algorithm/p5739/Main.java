package com.luogu.algorithm.p5739;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    private static BigInteger calculate_factorial(BigInteger num, BigInteger result) {
        if (num.equals(new BigInteger("0"))) {
            return new BigInteger("1");
        } else if (num.equals(new BigInteger("1"))) {
            return result;
        } else {
            result = result.multiply(num);
            return calculate_factorial(num.subtract(new BigInteger("1")), result);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger limit = new BigInteger(scanner.next());
        scanner.close();
        System.out.println(calculate_factorial(limit, new BigInteger("1")));
    }

}
