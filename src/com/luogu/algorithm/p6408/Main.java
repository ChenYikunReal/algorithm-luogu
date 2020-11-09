package com.luogu.algorithm.p6408;

import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new TreeMap<>(Comparator.reverseOrder());
        Scanner scanner = new Scanner(System.in);
        int sum;
        for (int i = 1; i <= 5; i++) {
            sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += scanner.nextInt();
            }
            map.put(sum, i);
        }
        scanner.close();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getValue() + " " + entry.getKey());
            break;
        }
    }

}
