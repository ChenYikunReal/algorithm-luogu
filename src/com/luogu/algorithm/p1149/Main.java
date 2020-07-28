package com.luogu.algorithm.p1149;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] num_array = new int[2001], basic_array = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
        num_array[0] = 6;
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        //求每个数需要的火柴棒数量
        for(int i = 1; i <= 2000; i++) {
            int temp = i;
            while(temp >= 1) {
                num_array[i] += basic_array[temp%10];
                temp = temp/10;
            }
        }
        int counter = 0;
        //暴力枚举判断等式是否符合要求
        for(int i = 0; i <= 1000; i++) {
            for(int j = 0; j <= 1000; j++) {
                //加号算2个等号算2个
                if(num_array[i] + num_array[j] + num_array[i+j] + 4 == num) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
