package com.luogu.algorithm.p5019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine().trim());
        String[] str_nums = reader.readLine().split(" ");
        reader.close();
        int[] nums = new int[num];
        long result = 0;
        for (int i = 0; i < num; i++) {
            nums[i] = Integer.parseInt(str_nums[i]);
        }
        for (int i = 1; i < num; i++) {
            if (nums[i] > nums[i-1]) {
                result += nums[i]-nums[i-1];
            }
        }
        System.out.println(result+nums[0]);
    }
}
