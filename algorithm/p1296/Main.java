package com.luogu.algorithm.p1296;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] array = new int[num];
        int distance = scanner.nextInt(), it = 2, ans = 0;
        for(int i=0; i<num; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        Arrays.sort(array);
        for(int i = 0; i < num; ++i){
            while(it < num && array[it]-array[i] <= distance) {
                ++it;
            }
            --it;
            ans += (it-i);
        }
        System.out.println(ans);
    }
}
