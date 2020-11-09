package com.luogu.algorithm.p6263;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        Map<Character, Integer> map = new HashMap<>();
        map.put('`', 1);
        map.put('1', 1);
        map.put('Q', 1);
        map.put('A', 1);
        map.put('Z', 1);
        map.put('2', 2);
        map.put('W', 2);
        map.put('S', 2);
        map.put('X', 2);
        map.put('3', 3);
        map.put('E', 3);
        map.put('D', 3);
        map.put('C', 3);
        map.put('4', 4);
        map.put('R', 4);
        map.put('F', 4);
        map.put('V', 4);
        map.put('5', 4);
        map.put('T', 4);
        map.put('G', 4);
        map.put('B', 4);
        map.put('6', 5);
        map.put('Y', 5);
        map.put('H', 5);
        map.put('N', 5);
        map.put('7', 5);
        map.put('U', 5);
        map.put('J', 5);
        map.put('M', 5);
        map.put('8', 6);
        map.put('I', 6);
        map.put('K', 6);
        map.put(',', 6);
        map.put('9', 7);
        map.put('O', 7);
        map.put('L', 7);
        map.put('.', 7);
        map.put('0', 8);
        map.put('P', 8);
        map.put(';', 8);
        map.put('/', 8);
        map.put('-', 8);
        map.put('[', 8);
        map.put('\'', 8);
        map.put('=', 8);
        map.put(']', 8);
        int[] counts = new int[9];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        reader.close();
        for (char c : str.toCharArray()) {
            if (map.containsKey(c)) {
                counts[map.get(c)]++;
            }
        }
        for (int i = 1; i <= 8; i++) {
            System.out.println(counts[i]);
        }
    }

}
