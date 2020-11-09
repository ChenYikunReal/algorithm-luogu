package com.luogu.algorithm.p6337;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println((n/2+1)*(n-n/2+1));
    }

}
