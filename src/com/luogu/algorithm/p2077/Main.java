package com.luogu.algorithm.p2077;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = reader.readLine().split(" ");
        int num = Integer.parseInt(arr[0]);
        int[] distance_array = new int[num];
        int[] red_time_array = new int[num];
        int[] green_time_array = new int[num];
        distance_array[0] = Integer.parseInt(arr[1]);
        arr = reader.readLine().split(" ");
        for (int i = 1; i < num; i++) {
            distance_array[i] = Integer.parseInt(arr[i-1]);
        }
        arr = reader.readLine().split(" ");
        for (int i = 0; i < num; i++) {
            red_time_array[i] = Integer.parseInt(arr[i]);
        }
        arr = reader.readLine().split(" ");
        for (int i = 0; i < num; i++) {
            green_time_array[i] = Integer.parseInt(arr[i]);
        }
        reader.close();
        int sum_time = 0, temp_time = 0;
        for (int i = 0; i < num; i++) {
            sum_time += distance_array[i];
             temp_time = sum_time % (green_time_array[i] + red_time_array[i]);
             if (temp_time > green_time_array[i]) {
                 sum_time += (green_time_array[i] + red_time_array[i] - temp_time);
             }
            System.out.println(sum_time);
        }
    }
}
