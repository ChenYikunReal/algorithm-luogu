package com.luogu.algorithm.p1010;

import java.util.Scanner;

public class Main {
    private static String run(int x){
        StringBuilder s = new StringBuilder();
        if(x == 0) {
            return "0";
        }
        int i = 0;
        do {
            if((x & 1) != 0) {
                s.insert(0, ((i == 1) ? "2" : "2(" + run(i) + ")") + ("".equals(s.toString()) ? "" : "+"));
                //拼接字符串，应题意，要把低次方接在后面
            }
            i++;
            x >>= 1;
        } while(x != 0);//每次向右移位
        return s.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(run(scanner.nextInt()));
        scanner.close();
    }
}
