package com.luogu.algorithm.p1554;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void  main(String[] args) {
        ArrayList<Integer> collector= new ArrayList<>();
        int x = 0, y = 0, a = 0, b = 0, c = 0;
        int[] count = new int[10];

        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();
        y = scan.nextInt();

        String stry = y + " ";
        int len2 = stry.length()-1;

        for (int i = x; i <= y; i++) {
            c = i;
            for (int j = len2-1; j >= 0; j--) {
                a = (int)Math.pow(10, j);
                b = c/a;
                c %= a;
                collector.add(b);
            }
        }

        for (int i : collector) {
            switch (i) {
                case 0:
                    count[0] ++;
                    break;
                case 1:
                    count[1] ++;
                    break;
                case 2:
                    count[2] ++;
                    break;
                case 3:
                    count[3] ++;
                    break;
                case 4:
                    count[4] ++;
                    break;
                case 5:
                    count[5] ++;
                    break;
                case 6:
                    count[6] ++;
                    break;
                case 7:
                    count[7] ++;
                    break;
                case 8:
                    count[8] ++;
                    break;
                case 9:
                    count[9] ++;
                    break;
                default:
                    System.err.println("Error!");
            }
        }

        for (int i : count) {
            System.out.print(i + " ");
        }

        scan.close();
    }

}

