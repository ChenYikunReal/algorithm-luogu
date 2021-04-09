package com.luogu.algorithm.p3378;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

// TLE，又一个Java不配过的题
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        Queue<Integer> queue = new PriorityQueue<>(n);
        for (int i = 0; i < n; i++) {
            String[] temp = bf.readLine().split("\\s+");
            switch (Integer.parseInt(temp[0])) {
                case 1:
                    queue.add(Integer.parseInt(temp[1]));
                    break;
                case 2:
                    System.out.println(queue.peek());
                    break;
                case 3:
                    queue.poll();
                    break;
            }
        }
        bf.close();
    }

}
