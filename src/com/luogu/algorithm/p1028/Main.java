package com.luogu.algorithm.p1028;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] f = new int[1010];
        f[0] = f[1] = 1;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        for(int i = 2; i <= n; i++){
            if(i % 2 == 0){
                f[i] = f[i-1] + f[i/2];
            } else {
                f[i] = f[i-1];
            }
        }
        System.out.println(f[n]);
    }
}
