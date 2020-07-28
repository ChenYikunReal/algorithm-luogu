package com.luogu.algorithm.p4327;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] alphabets = scanner.nextLine().split("");
        scanner.close();
        String demo1 = "..#.", demo6  = "..*.", demo11 = "..#.";
        String demo2 = ".#.#", demo7  = ".*.*", demo12 = ".#.#";
        String demo3 = "#.?.", demo8  = "*.?.", demo13 = "*.?.";
        String demo4 = ".#.#", demo9  = ".*.*", demo14 = ".#.#";
        String demo5 = "..#.", demo10 = "..*.", demo15 = "..#.";
        StringBuilder line1 = new StringBuilder(demo1);
        StringBuilder line2 = new StringBuilder(demo2);
        StringBuilder line3 = new StringBuilder(demo3.replaceAll("\\?", alphabets[0]));
        StringBuilder line4 = new StringBuilder(demo4);
        StringBuilder line5 = new StringBuilder(demo5);
        for (int i = 1; i < alphabets.length; i++) {
            String s = alphabets[i];
            switch ((i+1) % 3) {
                case 0:
                    line1.append(demo6);
                    line2.append(demo7);
                    line3.append(demo8.replaceAll("\\?", s));
                    line4.append(demo9);
                    line5.append(demo10);
                    break;
                case 1:
                    line1.append(demo11);
                    line2.append(demo12);
                    line3.append(demo13.replaceAll("\\?", s));
                    line4.append(demo14);
                    line5.append(demo15);
                    break;
                default:
                    line1.append(demo1);
                    line2.append(demo2);
                    line3.append(demo3.replaceAll("\\?", s));
                    line4.append(demo4);
                    line5.append(demo5);
                    break;
            }
        }
        line1.append(".");
        line2.append(".");
        line4.append(".");
        line5.append(".");
        if (alphabets.length % 3 == 0) {
            line3.append("*");
        } else {
            line3.append("#");
        }
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
    }
}
