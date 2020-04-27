package com.luogu.algorithm.p1867;

public class Pow {
    public static void main(String[] args) {
        for (long i = 0; i <= 63; i++) {
            System.out.print((long)Math.pow(2, i) + "L,");
        }
    }
}
