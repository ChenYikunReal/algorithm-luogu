package com.luogu.algorithm.p1029;

import java.util.Scanner;

public class Main {

    private static int gcd(int x,int y) {
        if(y==0) {
            return x;
        }
        return gcd(y,x % y);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt(), y = scanner.nextInt();
        scanner.close();
        int counter = 0;
        for (int i = 1; i <= Math.sqrt(x*y); i++) {
            if ((x * y) % i == 0 && gcd(i, (x * y) / i) == x) {
                counter++;
            }
        }
        System.out.println(counter*2);
    }

}
