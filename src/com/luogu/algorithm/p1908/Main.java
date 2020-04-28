package com.luogu.algorithm.p1908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static long result = 0;

    private static int[] nums, temp;

    private static void mergeSort(int left, int right) {
        if (left == right) {
            return;
        }
        int mid = (left+right)/2, i = left, j = mid+1, k = left;
        mergeSort(left, mid);
        mergeSort(j, right);
        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
                result += mid-i+1;
            }
        }
        while (i <= mid) {
            temp[k++] = nums[i++];
        }
        while (j <= right) {
            temp[k++] = nums[j++];
        }
        for (int m = left; m <= right; m++) {
            nums[m] = temp[m];
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        String[] array = reader.readLine().split("\\s+");
        reader.close();
        nums = new int[num];
        temp = new int[num];
        for (int i = 0; i < num; i++) {
            nums[i] = Integer.parseInt(array[i]);
        }
        mergeSort(0, num-1);
        System.out.println(result);
    }

}
