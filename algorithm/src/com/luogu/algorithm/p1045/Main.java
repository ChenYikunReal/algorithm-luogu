package com.luogu.algorithm.p1045;

import static java.math.BigInteger.*;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger num = TWO.pow(Integer.parseInt(scanner.nextLine())).subtract(ONE);
        String string = num.toString();
        int length = string.length();
        System.out.println(length);
        if (length <= 500) {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < 500-length; i++) {
                builder.append("0");
            }
            string = builder.append(string).toString();
        } else {
            string = string.substring(length-500);
        }
        scanner.close();
        for (int i = 0; i < 10; i++) {
            System.out.println(string.substring(i*50, i*50+50));
        }
    }
}