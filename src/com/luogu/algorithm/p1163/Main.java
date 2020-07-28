package com.luogu.algorithm.p1163;

import java.util.Scanner;

public class Main {

    private static double a, b;

    private static int c;

    private static void getResult(double left, double right) {
        double mid = (left+right)/2, temp = a;
        if(right-left < 0.0001) {
            System.out.printf("%.1f", mid*100);
            return;
        }
        for(int i = 0; i < c; i++) {
            temp = temp*(1+mid)-b;
        }
        if(temp > 0) {
            getResult(left, mid);
        } else if(temp < 0) {
            getResult(mid, right);
        } else {
            System.out.printf("%.1f", mid*100);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextInt();
        scanner.close();
        getResult(0, 5);
    }

}
