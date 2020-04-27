package com.luogu.algorithm.p1008;

public class Main {

    private static byte[] arr = new byte[9];

    public static void main(String[] args) {
        for (int i = 123; i < 333; i++) {
            arr = new byte[9];
            int two = 2*i, three = 3*i;
            if (judge(i) && judge(two) && judge(three)) {
                System.out.println(i + " " + two + " " + three);
            }
        }
    }

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

}
