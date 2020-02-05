package com.luogu.algorithm.test;

public class SleepTest {
    public static void main(String[] args) throws InterruptedException {
        long start, end;
        start = System.currentTimeMillis();
//        for (int i = 0; i < 10; i++) {
//            Thread.sleep(100);
//        }
        Thread.sleep(1000);
        end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
