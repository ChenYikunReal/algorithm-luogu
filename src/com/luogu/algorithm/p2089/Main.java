package com.luogu.algorithm.p2089;

import java.util.LinkedList;
        import java.util.List;
        import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(), counter = 0;
        scanner.close();
        List<StringBuilder> list = new LinkedList<>();
        for (int a = 1; a <= 3; a++) {
            for (int b = 1; b <= 3; b++) {
                for (int c = 1; c <= 3; c++) {
                    for (int d = 1; d <= 3; d++) {
                        for (int e = 1; e <= 3; e++) {
                            for (int f = 1; f <= 3; f++) {
                                for (int g = 1; g <= 3; g++) {
                                    for (int h = 1; h <= 3; h++) {
                                        for (int i = 1; i <= 3; i++) {
                                            for (int j = 1; j <= 3; j++) {
                                                if (a + b + c + d + e + f + g + h + i + j == num) {
                                                    counter++;
                                                    StringBuilder str = new StringBuilder();
                                                    str.append(a).append(" ").append(b).append(" ").append(c)
                                                            .append(" ").append(d).append(" ").append(e).append(" ")
                                                            .append(f).append(" ").append(g).append(" ").append(h)
                                                            .append(" ").append(i).append(" ").append(j);
                                                    list.add(str);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(counter);
        for (StringBuilder str : list) {
            System.out.println(str);
        }
    }
}
