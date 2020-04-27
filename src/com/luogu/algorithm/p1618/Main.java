package com.luogu.algorithm.p1618;

import java.util.Scanner;

public class Main {

    private static byte[] arr = new byte[9];

    private static boolean judge(int i) {
        int a = i / 100;
        int b = (i % 100) / 10;
        int c = i - a*100 - b*10;
        if (b == 0 || c == 0 || a == b || a == c || b == c || arr[a-1] == 1 || arr[b-1] == 1 || arr[c-1] == 1) {
            return false;
        }
        arr[a-1] = arr[b-1] = arr[c-1] = 1;
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
        scanner.close();
        boolean flag = false;
        for (int i = 1; i < 1000; i++) {
            arr = new byte[9];
            int one = a*i, two = b*i, three = c*i;
            if (one > 100 && one < 1000 && two > 100 && two < 1000 && three > 100 && three < 1000
                    && judge(one) && judge(two) && judge(three)) {
                flag = true;
                System.out.println(one + " " + two + " " + three);
            }
        }
        if (!flag) {
            System.out.println("No!!!");
        }
    }

}
