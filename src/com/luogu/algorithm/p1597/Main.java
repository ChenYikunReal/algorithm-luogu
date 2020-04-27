package com.luogu.algorithm.p1597;

import java.util.Scanner;

public class Main {

    private static String a = "0", b = "0", c = "0";

    private static void judgeHead(String head, String rear) {
        switch (head) {
            case "a":
                a = judgeRear(rear);
                break;
            case "b":
                b = judgeRear(rear);
                break;
            case "c":
                c = judgeRear(rear);
                break;
        }
    }

    private static String judgeRear(String rear) {
        switch (rear) {
            case "a":
                return a;
            case "b":
                return b;
            case "c":
                return c;
            default:
                return rear;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(";");
        scanner.close();
        for (int i = 0; i < array.length; i++) {
            String[] temp = array[i].split(":=");
            judgeHead(temp[0], temp[1]);
        }
        System.out.println(a + " " + b + " " + c);
    }
}
