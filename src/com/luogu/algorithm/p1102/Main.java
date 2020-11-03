package com.luogu.algorithm.p1102;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] line = reader.readLine().trim().split("\\s+");
        int num = Integer.parseInt(line[0]), step = Integer.parseInt(line[1]), temp;
        line = reader.readLine().trim().split("\\s+");
        reader.close();
        Map<Integer, Integer> map = new TreeMap<>();
        for (String s : line) {
            temp = Integer.parseInt(s);
            if (map.containsKey(temp)) {
                map.put(temp, map.get(temp)+1);
            } else {
                map.put(temp, 1);
            }
        }
        long counter = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            temp = entry.getKey();
            if (map.containsKey(temp-step)) {
                // (long)特别重要
                counter += (long)map.get(temp-step) * entry.getValue();
            }
        }
        System.out.println(counter);
    }

}
