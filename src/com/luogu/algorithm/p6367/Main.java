package com.luogu.algorithm.p6367;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), counter = 0, num = 1, temp;
        scanner.nextLine();
        String name = scanner.nextLine();
        map.put(name, 1);
        for (int i = 1; i < n; i++) {
            name = scanner.nextLine();
            if (!map.containsKey(name)) {
                map.put(name, 1);
            } else {
                temp = map.get(name);
                if (temp > num-temp) {
                    counter++;
                }
                map.put(name, temp+1);
            }
            num++;
        }
        scanner.close();
        System.out.println(counter);
    }

}
