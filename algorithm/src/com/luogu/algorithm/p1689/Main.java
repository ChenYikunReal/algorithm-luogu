package com.luogu.algorithm.p1689;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String formula = scanner.nextLine().replaceAll("\\s+", "");
        scanner.close();
        String a, b, c;
        int index1, index2 = formula.indexOf("=");
        if (formula.contains("+")) {
            index1 = formula.indexOf("+");
            a = formula.substring(0, index1);
            b = formula.substring(index1+1, index2);
            c = formula.substring(index2+1);
            if ("?".equals(c)) {
                System.out.println(Integer.parseInt(a) + Integer.parseInt(b));
            } else {
                System.out.println(Integer.parseInt(c) - Integer.parseInt(("?".equals(a)) ? b : a));
            }
        } else {
            index1 = formula.indexOf("-");
            a = formula.substring(0, index1);
            b = formula.substring(index1+1, index2);
            c = formula.substring(index2+1);
            if ("?".equals(a)) {
                System.out.println(Integer.parseInt(b) + Integer.parseInt(c));
            } else {
                System.out.println(Integer.parseInt(a) - Integer.parseInt(("?".equals(c)) ? b : c));
            }
        }
    }
}
