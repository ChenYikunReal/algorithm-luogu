package com.luogu.algorithm.p1923;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 线性复杂度算法
 * 该算法的C++版本可AC，但Java版本就会MLE/TLE
 * 该算法C++版本跑的比nth_element()跑得快
 */
public class Main {

    private static int[] nums;

    private static int k, num;

    private static void swap(int left, int right) {
        int temp = nums[left];
        nums[left]  = nums[right];
        nums[right] = temp;
    }

    private static void sort(int left, int right) {
        int left_mid=left, right_mid=right, mid= nums[(left+right)/2];
        while (left_mid <= right_mid) {
            while (nums[right_mid] > mid) {
                right_mid--;
            }
            while (nums[left_mid] < mid) {
                left_mid++;
            }
            if (left_mid <= right_mid && right_mid < num) {
                swap(left_mid, right_mid);
                left_mid++;
                right_mid--;
            }
        }
        if (k <= right_mid) {
            sort(left, right_mid);
        } else if (left_mid <= k) {
            sort(left_mid, right);
        } else {
            System.out.println(nums[right_mid+1]);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] line1 = reader.readLine().split("\\s+");
        num = Integer.parseInt(line1[0]);
        k = Integer.parseInt(line1[1]);
        nums = new int[num];
        String[] array = reader.readLine().split("\\s+");
        for (int i = 0; i < num; i++) {
            nums[i] = Integer.parseInt(array[i]);
        }
        reader.close();
        sort(0, num-1);
    }

}
