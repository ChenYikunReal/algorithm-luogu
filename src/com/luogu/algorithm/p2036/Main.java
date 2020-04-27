package com.luogu.algorithm.p2036;

import java.util.Scanner;

public class Main {

    private static int[] acidity_array;

    private static int[] sweetness_array;

    private static int num;

    private static long result = 0x3f3f3f3f;

    private static void dfs(int i, long x, long y) {
        if(i > num){
            if(x!=1 || y!=0) {
                result = Math.min(Math.abs(x-y), result);
            }
            return;
        }
        //添加的情况
        dfs(i + 1, x * acidity_array[i], y + sweetness_array[i]);
        //不添加的情况
        dfs(i + 1, x, y);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        acidity_array = new int[num+1];
        sweetness_array = new int[num+1];
        for (int i = 1; i <= num; i++) {
            acidity_array[i] = scanner.nextInt();
            sweetness_array[i] = scanner.nextInt();
        }
        scanner.close();
        dfs(1, 1, 0);
        System.out.println(result);
    }

}
