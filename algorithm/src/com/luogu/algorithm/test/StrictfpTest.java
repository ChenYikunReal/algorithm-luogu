package com.luogu.algorithm.test;

public class StrictfpTest {

    private static strictfp double calculate(float a, double b) {
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(0.6710339+0.04150553411984792);
        System.out.println(calculate(0.6710339f, 0.04150553411984792));
    }
}
