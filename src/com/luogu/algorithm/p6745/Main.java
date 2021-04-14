package com.luogu.algorithm.p6745;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String x = sc.next();
        sc.close();
        System.out.println(new BigInteger("10").pow(k).add(new BigInteger(x)));
    }

}
