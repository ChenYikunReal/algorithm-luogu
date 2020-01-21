package com.luogu.algorithm.p1011;

import java.util.Scanner;

public class Main {

    private static int getFib(int sum, int limit, int first, int next, int from) {
        for (int i = from; i < limit; i++) {
            int up = first + next;
            sum += (up - next);
            first = next;
            next = up;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //出发人数、站数、抵终人数、待求站号
        int head = scanner.nextInt(), num = scanner.nextInt(), rear = scanner.nextInt(), inner = scanner.nextInt();
        scanner.close();
        if (inner == num) {
            System.out.println(0);
            return;
        } else if (inner == 1) {
            System.out.println(head);
            return;
        } else if (inner == 2) {
            System.out.println(head);
            return;
        } else if (inner == 3) {
            System.out.println(head*2);
            return;
        }
        int y_num = getFib(1, inner, 2, 3, 5);
        int all_y_num = getFib(1, num, 2, 3, 5);
//        int num_num = getFib(2, inner, 6);
//        first = 1;
//        next = 1;
//        for (int i = 5; i < inner; i++) {
//            int up = first + next;
//            num_num += (up - next);
//            first = next;
//            next = up;
//        }
//        int all_num_num = 2;
//        first = 1;
//        next = 1;
//        for (int i = 5; i < num; i++) {
//            int up = first + next;
//            all_num_num += (up - next);
//            first = next;
//            next = up;
//        }
//        int per_y = (rear - all_num_num * head) / all_y_num ;
//        System.out.println(y_num*per_y + num_num*head);
    }
}
