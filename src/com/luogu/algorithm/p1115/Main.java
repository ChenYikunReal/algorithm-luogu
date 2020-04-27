package com.luogu.algorithm.p1115;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine()), max;
        if (num == 0) {
            reader.close();
            System.out.println(0);
            return;
        }
        String[] nums = reader.readLine().split("\\s+");
        reader.close();
        int[] result = new int[num+1];
        result[1] = max = Integer.parseInt(nums[0]);
        for (int i = 2; i <= num; i++) {
            int tempNum = Integer.parseInt(nums[i-1]);
            result[i] = Math.max(result[i-1]+tempNum, tempNum);
            max = Math.max(result[i], max);
        }
        System.out.println(max);
    }
}
