package com.luogu.algorithm.p1071;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        char[] cipher = scanner.nextLine().trim().toCharArray();
        char[] origin = scanner.nextLine().trim().toCharArray();
        char[] chars = scanner.nextLine().trim().toCharArray();
        scanner.close();
        for (int i = 0; i < cipher.length; i++) {
            char c1 = cipher[i], c2 = origin[i];
            if (map1.containsKey(c1)) {
                if (map1.get(c1)!=c2) {
                    System.out.println("Failed");
                    return;
                }
            } else {
                map1.put(c1, c2);
            }
            if (map2.containsKey(c2)) {
                if (map2.get(c2)!=c1) {
                    System.out.println("Failed");
                    return;
                }
            } else {
                map2.put(c2, c1);
            }
        }
        if (map1.size() < 26 || map2.size() < 26) {
            System.out.println("Failed");
            return;
        }
        char[] result = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            result[i] = map1.get(chars[i]);
        }
        System.out.println(new String(result));
    }
}
