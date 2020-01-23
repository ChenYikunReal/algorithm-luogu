package com.luogu.algorithm.p4325;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int arraycount(int [] a) {
        //计算一维数组的长度
        int n = a.length;
        //将数组拷贝到新的地址，这样对新数组操作不会改变原数组
        int [] tmp = new int [n];
        System.arraycopy(a, 0, tmp, 0, n);
        //统计元素种类数
        int Num = 1;
        //将数组按元素大小重新排序
        Arrays.sort(tmp);
        for(int i = 1; i < n; i ++) {
            if (tmp[i] != tmp[i-1]) {
                Num ++;
            }
        }
        return Num;
    }

    public static void main(String[] args) {
        int [] counter = new int[10];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int x = scan.nextInt();
            int y = x % 42;
            counter[i] = y;
        }
        int result = arraycount(counter);
        System.out.println(result);
        scan.close();
    }
}

