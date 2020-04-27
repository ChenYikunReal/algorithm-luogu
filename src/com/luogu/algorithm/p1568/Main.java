package com.luogu.algorithm.p1568;

import java.util.Scanner;

public class Main {

    private static int[] sh_array = new int[1000010], kc_array = new int[1000010], flag = new int[1000010];

    private static Scanner scanner = new Scanner(System.in);

    private static int init(int[] array, int num) {
        int temp_v, temp_t, pointer = 0;
        for(int i = 0; i < num; i++) {
            temp_v = scanner.nextInt();
            temp_t = scanner.nextInt();
            for(int j = 1; j <= temp_t; j++) {
                array[pointer+j] = array[pointer+j-1] + temp_v;
            }
            pointer += temp_t;
        }
        return pointer;
    }

    public static void main(String[] args) {
        int n = scanner.nextInt(), m = scanner.nextInt(), pointer = 0, counter = 0;
        pointer = init(sh_array, n);
        init(kc_array, m);
        scanner.close();
        for(int i = 1; i <= pointer; i++) {
            if(sh_array[i] >= kc_array[i]) {
                flag[i] = 1;
            } else {
                flag[i] = 2;
            }
            if(flag[i-1] != flag[i]) {
                counter++;
            }
        }
        System.out.println(counter-1);
    }
}
