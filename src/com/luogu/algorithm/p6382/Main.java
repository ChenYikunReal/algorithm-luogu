package com.luogu.algorithm.p6382;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        char c;
        if (!str.startsWith("MDA")) {
            System.out.println("1 1 1 1 1");
        } else {
            char[] chars = str.toCharArray();
            for (int i = chars.length-1; i >= 0; i--) {
                c = chars[i];
                if (c == '1' || c == '9') {
                    System.out.println("1 0 0 0 0");
                    break;
                } else if (c == '2' || c == '8') {
                    System.out.println("0 1 0 0 0");
                    break;
                } else if (c == '3' || c == '7') {
                    System.out.println("0 0 1 0 0");
                    break;
                } else if (c == '4' || c == '6') {
                    System.out.println("0 0 0 1 0");
                    break;
                } else if (c == '5' || c == '0') {
                    System.out.println("0 0 0 0 1");
                    break;
                }
            }
        }
    }

}
