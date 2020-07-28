package com.luogu.algorithm.p1067;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num == 0) {
            System.out.println();
            return;
        }
        int head = scanner.nextInt();
        if (num == 1) {
            System.out.println(head);
            return;
        } else if (num == 2) {
            int rear = scanner.nextInt();
            if (head == 1) {
                System.out.print("x");
            } else if (head == -1) {
                System.out.print("-x");
            } else {
                System.out.print(head + "x");
            }
            if (rear > 0) {
                System.out.println("+" + rear);
            } else if (rear < 0) {
                System.out.println(rear);
            }
            return;
        }
        StringBuilder builder = new StringBuilder();
        if (head == 1) {
            builder.append("x^" + num);
        } else if (head == -1) {
            builder.append("-x^" + num);
        } else {
            builder.append(head + "x^" + num);
        }
        for (int i = num-1; i >= 2; i--) {
            int temp = scanner.nextInt();
            if (temp == 1) {
                builder.append("+x^" + i);
            } else if (temp == -1) {
                builder.append("-x^" + i);
            } else if (temp > 0) {
                builder.append("+" + temp + "x^" + i);
            } else if (temp < 0) {
                builder.append(temp + "x^" + i);
            }
        }
        int first = scanner.nextInt();
        if (first == 1) {
            builder.append("+x");
        } else if (first == -1) {
            builder.append("-x");
        } else if (first > 0) {
            builder.append("+" + first + "x");
        } else if (first < 0) {
            builder.append(first + "x");
        }
        int rear = scanner.nextInt();
        if (rear > 0) {
            builder.append("+" + rear);
        } else if (rear < 0) {
            builder.append(rear);
        }
        System.out.println(builder.toString());
        scanner.close();
    }
}
