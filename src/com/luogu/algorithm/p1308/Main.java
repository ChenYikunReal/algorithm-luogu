package com.luogu.algorithm.p1308;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pattern = scanner.nextLine().toUpperCase(), text = scanner.nextLine().toUpperCase();
        int length = pattern.length(), counter = 0, firstIndex = -1, tempIndex = -1;
        boolean endFlag = false;
        if (text.startsWith(pattern + " ")) {
            counter++;
            firstIndex = 0;
            pattern = " " + pattern + " ";
            tempIndex = text.indexOf(pattern);
        }
        if (text.endsWith(" " + pattern)) {
            counter++;
            endFlag = true;
        }
        pattern = " " + pattern + " ";
        if (counter == 0) {
            firstIndex = tempIndex = text.indexOf(pattern);
        }
        while (tempIndex != -1) {
            tempIndex = text.indexOf(pattern, tempIndex+length);
            counter++;
        }
        if (firstIndex == -1) {
            if (endFlag) {
                System.out.println(1 + " " + (text.length()-1));
            } else {
                System.out.println(-1);
            }
        } else {
            System.out.println(counter + " " + (firstIndex+1));
        }
        scanner.close();
    }
}
