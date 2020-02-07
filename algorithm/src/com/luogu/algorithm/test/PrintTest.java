package com.luogu.algorithm.test;

public class PrintTest {
    public static void main(String[] args) {
        //System.out.printf("%d", "s");
        int[] array = new int[100000];
        long time1 = System.currentTimeMillis();
        for (int i = 0; i < array.length-1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(array[array.length-1]);
        long time2 = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            builder.append(array[i]).append(" ");
        }
        System.out.println(builder.toString().trim());
        long time3 = System.currentTimeMillis();
        System.out.println("策略1的输出时间：" + (time2-time1));
        System.out.println("策略2的输出时间：" + (time3-time2));
    }
}
