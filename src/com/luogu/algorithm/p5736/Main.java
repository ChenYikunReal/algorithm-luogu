package com.luogu.algorithm.p5736;

import java.util.Scanner;

public class Main {

    private static boolean[] prime;

    private static void eratosthenes(int num) {
        prime = new boolean[100001];
        for (int i = 2; i <= num; ++i) {
            prime[i] = true;
        }
        for(int i = 2; i <= num; ++i) {
            if (prime[i]) {
                for (int j = i * 2; j <= num; j+=i) {
                    prime[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        eratosthenes(100000);
        StringBuilder result = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            int temp_num = scanner.nextInt();
            if (prime[temp_num]) {
                result.append(temp_num).append(' ');
            }
        }
        scanner.close();
        System.out.println(result.toString().trim());
    }

}
