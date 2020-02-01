package com.luogu.algorithm.p2525;

import java.util.List;
import java.util.Scanner;

public class Main {

    private static int num;

    private static int[] f, result, chars;

    private List<Integer> list;

    private static int cantor() {
        int result = 0, x;
        for(int i = 0; i < num; i++) {
            x = 0;
            for(int j = i+1; j < num; j++)
                if(chars[i] - chars[j] > 0) {
                    x++;
                }
            result += x * f[num-i-1];
        }
        return result;
    }

//    private static void inCantor(int k) {
//        int x;
//        while(!v.empty()) {
//            v.erase(v.end());
//        }
//        for(int i = 1; i <= num; i++) {
//            v.push_back(i);
//        }
//        for(int i=1; i<num; ++i) {
//            result[i] = v[(x = k / f[num - i])];
//            v.erase(v.begin() + x);
//            k %= f[num - i];
//        }
//        result[num] = v[0];
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        chars = new int[num];
        for (int i = 0; i < num; i++) {
            chars[i] = scanner.nextInt();
        }
        scanner.close();
        f = new int[10];
        result = new int[10];
        f[0] = 1;
        f[1] = 1;
        for (int i = 2; i < 10; i++) {
            f[i] = f[i-1] * i;
        }
//        inCantor(cantor()-1, );
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            builder.append(result[i]);
        }
    }

}
