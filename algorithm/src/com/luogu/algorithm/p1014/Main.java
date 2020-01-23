package com.luogu.algorithm.p1014;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 0, j = 0; //前i条斜线一共j个数
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        //找到最小的i使得j>=num
        while(num > j) {
            i++;
            j += i;
        }
        if(i % 2 == 1) {
            //i的奇偶决定着斜线上数的顺序,n是第i条斜线上倒数第j-n+1个数
            System.out.println((j-num+1) + "/" + (i+num-j));
        } else {
            //若i是偶数，第i条斜线上倒数第i个元素是(i+1-i)/i
            System.out.println((i+num-j) + "/" + (j-num+1));
        }
        scanner.close();
    }
}
