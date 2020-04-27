package com.luogu.algorithm.p1226;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger b = scanner.nextBigInteger(), p = scanner.nextBigInteger(), k = scanner.nextBigInteger();
        scanner.close();
        System.out.println(b +"^" + p + " mod " + k + "=" + b.modPow(p, k));
    }
}
