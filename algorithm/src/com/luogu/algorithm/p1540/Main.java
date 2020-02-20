package com.luogu.algorithm.p1540;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt(), num = scanner.nextInt(), counter = 0, result = 0;
        while (queue.size() <= num && result < limit) {
            int temp = scanner.nextInt();
            if (!queue.contains(temp)) {
                queue.offer(temp);
                result++;
            }
            counter++;
        }
        for (int i = counter; i < num; i++) {
            int temp = scanner.nextInt();
            if (!queue.contains(temp)) {
                queue.poll();
                queue.offer(temp);
                result++;
            }
        }
        scanner.close();
        System.out.println(result);
    }
}
