package com.luogu.algorithm.p1996;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder result = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(), key = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= num; i++) {
            queue.offer(i);
        }
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j < key; j++) {
                queue.offer(queue.poll());
            }
            result.append(queue.poll()).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
