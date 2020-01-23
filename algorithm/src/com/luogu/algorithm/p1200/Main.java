package com.luogu.algorithm.p1200;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String star = scanner.nextLine();
        String ufo = scanner.nextLine();
        char[] starArr = star.toCharArray();
        char[] ufoArr = ufo.toCharArray();
        int starInt = 1;
        for (char c : starArr) {
            starInt *= (c-64);
        }
        int ufoInt = 1;
        for (char c : ufoArr) {
            ufoInt *= (c-64);
        }
        if (starInt % 47 == ufoInt % 47) {
            System.out.println("GO");
        } else {
            System.out.println("STAY");
        }
        scanner.close();
    }

}

