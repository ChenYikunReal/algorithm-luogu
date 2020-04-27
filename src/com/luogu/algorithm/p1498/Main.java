package com.luogu.algorithm.p1498;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        int[] array = new int[1<<num+1];
        array[1] = 1;
        for(int i = 0; i < 1<<num; i++){
            StringBuilder builder = new StringBuilder();
            for(int j = 1; j < (1<<num)-i; j++) {
                builder.append(" ");
            }
            for(int j = i+1; j > 0; j--) {
                array[j]^=array[j-1];
            }
            if(i%2==1) {
                for(int j = 1; j <= i+1; j+=2) {
                    builder.append((array[j] != 0) ? "/__\\" : "    ");
                }
            } else {
                for(int j = 1; j <= i+1; j++) {
                    builder.append((array[j] != 0) ? "/\\" : "  ");
                }
            }
            System.out.println(builder);
        }
    }
}
