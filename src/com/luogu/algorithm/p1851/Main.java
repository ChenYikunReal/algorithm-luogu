package com.luogu.algorithm.p1851;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] a_array = new int[] {220, 1184, 2620, 5020, 6232, 10744, 12285, 17296};
        int[] b_array = new int[] {284, 1210, 2924, 5564, 6368, 10856, 14595, 18416};
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        for (int i = 0; i < 8; i++) {
            if (a_array[i] >= num) {
                System.out.println(a_array[i] + " " + b_array[i]);
                break;
            } else if (b_array[i] >= num) {
                System.out.println(b_array[i] + " " + a_array[i]);
                break;
            }
        }
    }
}
