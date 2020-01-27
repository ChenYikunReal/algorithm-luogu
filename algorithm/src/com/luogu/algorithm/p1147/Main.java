package com.luogu.algorithm.p1147;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        int tempSum = 3;
        List<String> list = new LinkedList<>();
        for(int i = 1, j = 2; i <= num/2;) {
            if(tempSum == num) {
                list.add(i + " " + j);
                tempSum -= i;
                i++;
            } else if(tempSum < num) {
                j++;
                tempSum += j;
            } else {
                tempSum -= i;
                i++;
            }
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}
