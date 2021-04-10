package com.luogu.algorithm.p1604;

import java.util.Scanner;

/**
 * WOC，36进制都TM行，%%%
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radix = Integer.parseInt(sc.nextLine());
        System.out.println(sc.nextBigInteger(radix).add(sc.nextBigInteger(radix)).toString(radix).toUpperCase());
        sc.close();
    }

}
