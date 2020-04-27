package com.luogu.algorithm.p4413;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int R2;
        Scanner scan = new Scanner(System.in);
        int R1 = scan.nextInt(), S = scan.nextInt();
        if (R1 <= 1000 && R1 >= -1000) {
            if (S <= 1000 && S >= -1000) {
                R2 = 2 * S - R1;
                System.out.println(R2);
            }
        }
    }

}
