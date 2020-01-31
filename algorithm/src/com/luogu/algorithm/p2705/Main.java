package com.luogu.algorithm.p2705;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int redNum = scanner.nextInt(), blueNum = scanner.nextInt(), c = scanner.nextInt(),
                d = scanner.nextInt(), e = scanner.nextInt();
        scanner.close();
        int result = redNum*c + blueNum*d;
        if (2*e > c+d) {
            result += Math.min(redNum, blueNum) * (2*e-c-d);
        }
        System.out.println(result);
    }
}
