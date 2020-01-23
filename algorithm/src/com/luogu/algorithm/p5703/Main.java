package com.luogu.algorithm.p5703;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next(), b = scanner.next();
        System.out.println(new BigInteger(a).multiply(new BigInteger(b)));
    }

}
