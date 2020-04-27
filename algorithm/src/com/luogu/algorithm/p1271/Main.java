package com.luogu.algorithm.p1271;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        reader.readLine();
        String[] read = reader.readLine().split("\\s+");
        reader.close();
        int length = read.length;
        int[] nums = new int[length];
        for (int i = 0; i < length; i++) {
            nums[i] = Integer.parseInt(read[i]);
        }
        Arrays.sort(nums);
        StringBuilder result = new StringBuilder();
        for (int i : nums) {
            result.append(i).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
