package com.luogu.algorithm.p4439;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine()), counter = 1;
        String prev = scanner.nextLine();
        for (int i = 1; i < num; i++) {
            String s = scanner.nextLine();
            if (!prev.equals(s)) {
                counter++;
            }
            prev = s;
        }
        scanner.close();
        System.out.println(counter+1);
    }
}
