package com.luogu.algorithm.test.random_test;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomTest {

    private static int mathRandom(int from, int to) {
        return new Random().nextInt(to-from)+from;
    }

    public static void main(String[] args) {
        Random random = new Random();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            result.append(random.nextInt(10));
        }
        System.out.println(result);
        System.out.println(Long.parseLong(result.toString()));
        System.out.println(random.nextInt(1000000000));
        System.out.println(random.nextInt(900000000)+100000000);
        //生成0~999999999)
        System.out.println(random.nextInt(999999999));
        System.out.println(Math.random()*1000000000);
        System.out.println(random.nextInt());
        ThreadLocalRandom.current();
    }
}
