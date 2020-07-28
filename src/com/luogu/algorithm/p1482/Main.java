package com.luogu.algorithm.p1482;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array_1 = scanner.nextLine().split("/");
        String[] array_2 = scanner.nextLine().split("/");
        BigInteger a = new BigInteger(Integer.toString(Integer.parseInt(array_1[0])*Integer.parseInt(array_2[0])));
        BigInteger b = new BigInteger(Integer.toString(Integer.parseInt(array_1[1])*Integer.parseInt(array_2[1])));
        int gcd = a.gcd(b).intValue();
        System.out.println((b.intValue()/gcd) + " " + (a.intValue()/gcd));
        scanner.close();
    }
}
