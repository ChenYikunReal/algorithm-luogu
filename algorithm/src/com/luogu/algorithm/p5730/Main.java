package com.luogu.algorithm.p5730;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringBuilder line1 = new StringBuilder();
        StringBuilder line2 = new StringBuilder();
        StringBuilder line3 = new StringBuilder();
        StringBuilder line4 = new StringBuilder();
        StringBuilder line5 = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        char[] nums = scanner.nextLine().toCharArray();
        scanner.close();
        for (char c : nums) {
            switch (c) {
                case '0':
                    line1.append("XXX.");
                    line2.append("X.X.");
                    line3.append("X.X.");
                    line4.append("X.X.");
                    line5.append("XXX.");
                    break;
                case '1':
                    line1.append("..X.");
                    line2.append("..X.");
                    line3.append("..X.");
                    line4.append("..X.");
                    line5.append("..X.");
                    break;
                case '2':
                    line1.append("XXX.");
                    line2.append("..X.");
                    line3.append("XXX.");
                    line4.append("X...");
                    line5.append("XXX.");
                    break;
                case '3':
                    line1.append("XXX.");
                    line2.append("..X.");
                    line3.append("XXX.");
                    line4.append("..X.");
                    line5.append("XXX.");
                    break;
                case '4':
                    line1.append("X.X.");
                    line2.append("X.X.");
                    line3.append("XXX.");
                    line4.append("..X.");
                    line5.append("..X.");
                    break;
                case '5':
                    line1.append("XXX.");
                    line2.append("X...");
                    line3.append("XXX.");
                    line4.append("..X.");
                    line5.append("XXX.");
                    break;
                case '6':
                    line1.append("XXX.");
                    line2.append("X...");
                    line3.append("XXX.");
                    line4.append("X.X.");
                    line5.append("XXX.");
                    break;
                case '7':
                    line1.append("XXX.");
                    line2.append("..X.");
                    line3.append("..X.");
                    line4.append("..X.");
                    line5.append("..X.");
                    break;
                case '8':
                    line1.append("XXX.");
                    line2.append("X.X.");
                    line3.append("XXX.");
                    line4.append("X.X.");
                    line5.append("XXX.");
                    break;
                default:
                    line1.append("XXX.");
                    line2.append("X.X.");
                    line3.append("XXX.");
                    line4.append("..X.");
                    line5.append("XXX.");
                    break;
            }
        }
        int length = line1.length();
        System.out.println(line1.substring(0, length-1));
        System.out.println(line2.substring(0, length-1));
        System.out.println(line3.substring(0, length-1));
        System.out.println(line4.substring(0, length-1));
        System.out.println(line5.substring(0, length-1));
    }
}
