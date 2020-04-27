package com.luogu.algorithm.p2907;

import java.util.Scanner;

public class Main {

    private static long limit;

    private static long dfs(long num) {
        if (num > limit && ((num-limit)&1)==0) {
            return dfs((num-limit)/2) + dfs((num+limit)/2);
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        limit = scanner.nextLong();
        scanner.close();
        System.out.println(dfs(num));
    }

}
