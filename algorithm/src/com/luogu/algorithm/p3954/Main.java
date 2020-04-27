package com.luogu.algorithm.p3954;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt(), y = scan.nextInt(), z = scan.nextInt();
        int result = (int)(x*0.2 + y*0.3 + z*0.5);
        System.out.println(result);
        scan.close();
    }

}

