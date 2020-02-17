package com.luogu.algorithm.test.relative_molecular_mass;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Character, Double> map = new HashMap<>(4);
        map.put('C', 12.01);
        map.put('H', 1.008);
        map.put('O', 16.00);
        map.put('N', 14.01);
        Scanner scanner = new Scanner(System.in);
        String formula = scanner.nextLine();
        scanner.close();
        int num = 0;
        double sum = 0;
        char[] chars = formula.toCharArray();
        char temp = chars[0];
        for (int i = 1; i < chars.length; i++) {
            char c = chars[i];
            if (c >= '0' && c <= '9') {
                num *= 10;
                num += c-'0';
            } else {
                if (num == 0) {
                    sum += map.get(temp);
                } else {
                    sum += map.get(temp)*num;
                }
                num = 0;
                temp = c;
            }
        }
        if (!formula.endsWith("\\d+")) {
            sum += map.get(temp);
        }
        System.out.printf("%.3f", sum);
    }
}
