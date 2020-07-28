package com.luogu.algorithm.p1994;

import java.util.Scanner;

public class Main {

    private static int i = 0, c_counter = 0, h_counter = 0, o_counter = 0, temp = 0;

    private static char[] formula;

    private static int count() {
        int counter = 0;
        while (++i < formula.length && Character.isDigit(formula[i])) {
            temp *= 10;
            temp += formula[i]-'0';
        }
        if (temp == 0) {
            counter++;
        } else {
            counter += temp;
            temp = 0;
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        formula = scanner.nextLine().toCharArray();
        scanner.close();
        for ( ; i < formula.length; ) {
            switch (formula[i]) {
                case 'C':
                    c_counter += count();
                    break;
                case 'H':
                    h_counter += count();
                    break;
                default:
                    o_counter += count();
            }
        }
        while ((h_counter & 1) != 0 || (h_counter - 2*o_counter) % 4 != 0) {
            c_counter <<= 1;
            h_counter <<= 1;
            o_counter <<= 1;
        }
        System.out.println(c_counter + " " + h_counter/2);
    }

}
