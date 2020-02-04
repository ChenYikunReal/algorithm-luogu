package com.luogu.algorithm.p5601;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int answerNum = scanner.nextInt(), questionNum = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < answerNum; i++) {
            String[] key_value = scanner.nextLine().split("\\s+");
            map.put(key_value[0], key_value[1]);
        }
        List<String> list = new ArrayList<>(questionNum);
        for (int i = 0; i < questionNum; i++) {
            String[] key_value = scanner.nextLine().split("\\s+");
            if (map.get(key_value[0]).equals(key_value[1])) {
                list.add("A");
            } else if (map.get(key_value[0]).equals(key_value[2])) {
                list.add("B");
            } else if (map.get(key_value[0]).equals(key_value[3])) {
                list.add("C");
            } else {
                list.add("D");
            }
        }
        scanner.close();
        for (String s : list) {
            System.out.println(s);
        }
    }
}
