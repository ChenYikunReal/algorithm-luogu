package com.luogu.algorithm.p5727;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        LinkedList<Integer> list = new LinkedList<>();
        while (num > 1) {
            list.push(num);
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num*=3;
                ++num;
            }
        }
        list.push(1);
        for (int i = 0; i < list.size()-1; i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println(list.get(list.size()-1));
    }
}
