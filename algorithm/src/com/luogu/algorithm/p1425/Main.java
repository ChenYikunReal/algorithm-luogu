package com.luogu.algorithm.p1425;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt(), d = scan.nextInt();
        int e = c - a, f = d - b;
        if (f <= 0) {
            e--;
            f+=60;
        }
        System.out.println(e + " " + f);
    }

}
