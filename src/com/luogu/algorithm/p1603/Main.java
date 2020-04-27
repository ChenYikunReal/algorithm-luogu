package com.luogu.algorithm.p1603;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(20);
        map.put("one",       "01");
        map.put("a",         "01");
        map.put("two",       "04");
        map.put("three",     "09");
        map.put("four",      "16");
        map.put("five",      "25");
        map.put("six",       "36");
        map.put("seven",     "49");
        map.put("eight",     "64");
        map.put("nine",      "81");
        //map.put("ten",       "00");
        map.put("eleven",    "21");
        map.put("twelve",    "44");
        map.put("thirteen",  "69");
        map.put("fourteen",  "96");
        map.put("fifteen",   "25");
        map.put("sixteen",   "56");
        map.put("seventeen", "89");
        map.put("eighteen",  "24");
        map.put("nineteen",  "61");
        //map.put("twenty",    "00");
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().trim().split("\\s+");
        scanner.close();
        for (String s : words) {
            if (map.containsKey(s)) {
                list.add(map.get(s));
            }
        }
        if (list.isEmpty()) {
            System.out.println(0);
        }
        StringBuilder str = new StringBuilder();
        list.sort(Comparator.naturalOrder());
        for (String s : list) {
            str.append(s);
        }
        String result = str.toString();
        if (result.startsWith("0")) {
            result = result.substring(1);
        }
        System.out.println(result);
    }
}
