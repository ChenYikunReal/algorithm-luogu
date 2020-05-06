package com.luogu.algorithm.p1184;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        Set<String> boy_places = new HashSet<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = reader.readLine().split(" ");
        int n = Integer.parseInt(nums[0]), m = Integer.parseInt(nums[1]);
        for (int i = 0; i < n; i++) {
            boy_places.add(reader.readLine().trim());
        }
        int counter = 0;
        for (int i = 0; i < m; i++) {
            if (boy_places.contains(reader.readLine().trim())) {
                counter++;
            }
        }
        System.out.println(counter);
        reader.close();
    }
}
