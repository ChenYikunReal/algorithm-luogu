package com.luogu.algorithm.p6882;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] sentences = sc.nextLine().split("[.?!]\\s+"), temp;
        for (String s : sentences) {
            temp = s.split("\\s+");
            int counter = 0;
            for (String word : temp) {
                if ('A' <= word.charAt(0) && word.charAt(0) <= 'Z') {
                    boolean flag = true;
                    for (char c : word.toCharArray()) {
                        if ('0' <= c && c <= '9') {
                            flag = false;
                            break;
                        }
                    }
                    if (flag) {
                        counter++;
                    }
                }
            }
            System.out.println(counter);
        }
        sc.close();
    }

}
