package com.luogu.algorithm.p1177;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 既然是Java，就一定会TLE，所以就不提交这份代码了
 * 而且需要注意的是，普通快排也会TLE
 */
public class Main {

    private static int[] record;

    private static int partition(int first, int last) {
        //初始化一次划分区间
        int i = first, j = last, temp;
        while (i < j) {
            //右侧扫描
            while (i < j && record[i] <= record[j]) {
                j--;
            }
            //将较小记录交换到前面
            if (i < j) {
                temp = record[i];
                record[i] = record[j];
                record[j] = temp;
                i++;
            }
            //左侧扫描
            while (i < j && record[i] <= record[j]) {
                i++;
            }
            //将较大记录交换到后面
            if (i < j) {
                temp = record[i];
                record[i] = record[j];
                record[j] = temp;
                j--;
            }
        }
        //i为轴值记录的最终位置
        return i;
    }

    public static void quickSort(int first, int end) {
        if (first >= end) {
            return;
        } else {
            //一次划分
            int pivot = partition(first, end);
            //对左侧子序列快速排序
            quickSort(first, pivot-1);
            //对右侧子序列快速排序
            quickSort(pivot+1, end);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        record = new int[num];
        String[] nums = reader.readLine().split("\\s+");
        for (int i = 0; i < num; i++) {
            record[i] = Integer.parseInt(nums[i]);
        }
        quickSort(0, num-1);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < num; i++) {
            result.append(record[i]).append(" ");
        }
        System.out.println(result.toString().trim());
    }

}
