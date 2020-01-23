package com.luogu.algorithm.p1765;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        scanner.close();
//        long time1 = System.currentTimeMillis();
        Map<Character, Integer> map = new HashMap<>(64);
        map.put('a', 1);
        map.put('b', 2);
        map.put('c', 3);
        map.put('d', 1);
        map.put('e', 2);
        map.put('f', 3);
        map.put('g', 1);
        map.put('h', 2);
        map.put('i', 3);
        map.put('j', 1);
        map.put('k', 2);
        map.put('l', 3);
        map.put('m', 1);
        map.put('n', 2);
        map.put('o', 3);
        map.put('p', 1);
        map.put('q', 2);
        map.put('r', 3);
        map.put('s', 4);
        map.put('t', 1);
        map.put('u', 2);
        map.put('v', 3);
        map.put('w', 1);
        map.put('x', 2);
        map.put('y', 3);
        map.put('z', 4);
        map.put(' ', 1);
        char[] chars = line.toCharArray();
        int counter = 0;
        for (char c : chars) {
            counter += map.get(c);
        }
        System.out.println(counter);
//        long time2 = System.currentTimeMillis();
//        System.out.println(time2-time1);
    }
}
