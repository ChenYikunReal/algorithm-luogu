package com.luogu.algorithm.p1017;

import java.util.Scanner;

public class Main {

    private static StringBuilder result = new StringBuilder();

    private static void toString(int num, int radix) {
        if (num==0) {
            return;
        }
        int remainder = num % radix;
        if (remainder < 0) {
            remainder -= radix;
            num += radix;
        }
        if (remainder >= 10) {
            remainder += 'A'-10;
        } else {
            remainder += '0';
        }
        toString(num/radix, radix);
        result.append((char)remainder);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int origin_num = scanner.nextInt();
        int radix = scanner.nextInt();
        scanner.close();
        result.append(origin_num).append("=");
        toString(origin_num, radix);
        result.append("(base").append(radix).append(")");
        System.out.println(result);
    }

}
