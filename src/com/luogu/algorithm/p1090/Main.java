package com.luogu.algorithm.p1090;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), temp, sum = 0;
        Queue<Integer> queue = new PriorityQueue<>(n);
        for (int i = 0; i < n; i++) {
            queue.add(sc.nextInt());
        }
        sc.close();
        for (int i = 0; i < n-1; i++) {
            temp = queue.poll()+queue.poll();
            queue.add(temp);
            sum += temp;
        }
        System.out.println(sum);
    }

}
