package com.luogu.algorithm.p1036;

import java.util.Scanner;

public class Main {

    private static int num, k;

    private static int[] array = new int[25];

    private static long result;

    private static boolean isPrime(int a){//判断素数
        for(int i = 2; i*i <= a; i++) {
            if(a % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void dfs(int m,int sum,int starts) {
        if(m == k) {
            if(isPrime(sum)) {
                result++;
            }
            return;
        }
        for(int i = starts; i < num; i++) {
            dfs(m+1,sum+ array[i],i+1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        k = scanner.nextInt();
        for(int i = 0; i < num; i++) {
            array[i] = scanner.nextInt();
        }
        dfs(0,0,0);
        System.out.println(result);
    }

}
