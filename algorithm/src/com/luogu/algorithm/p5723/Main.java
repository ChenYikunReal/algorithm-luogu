package com.luogu.algorithm.p5723;

import java.util.Scanner;

public class Main {

    private static boolean prime[];

    private static int num;

    private static void eratosthenes() {
        for(int i = 2; i <= num; ++i) {
            prime[i] = true;
        }
        for(int i = 2; i <= num; ++i) {
            if(prime[i]) {
                for(int j = i * 2; j <= num; j += i) {
                    prime[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        prime = new boolean[num+1];
        int sum = 0;
        eratosthenes();
        for(int i = 1; i <= num; ++i) {
            if(prime[i]) {
                System.out.println(i);
                num -= i;
                sum++;
            }
            if(num <= 0) {
                break;
            }
        }
        System.out.println(sum);
        scanner.close();
    }
    
}
