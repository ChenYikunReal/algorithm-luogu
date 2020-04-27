package com.luogu.algorithm.p2955;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            BigInteger temp = new BigInteger(scanner.next());
            if (temp.mod(new BigInteger("2")).equals(new BigInteger("0"))) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
        scanner.close();
    }
}
