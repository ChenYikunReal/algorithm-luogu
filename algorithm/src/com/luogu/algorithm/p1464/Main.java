package com.luogu.algorithm.p1464;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static long[][][] array = new long[25][25][25];

    private static long w(int a, int b, int c) {
        if(a <= 0 || b <= 0 || c <= 0) {
            return 1;
        }
        if(a > 20 || b > 20 || c > 20) {
            return w(20, 20, 20);
        }
        if(a < b && b < c) {
            if(array[a][b][c-1] == 0) {
                array[a][b][c-1] = w(a, b, c-1);
            }
            if(array[a][b-1][c-1] == 0) {
                array[a][b-1][c-1] = w(a, b-1 ,c-1);
            }
            if(array[a][b-1][c] == 0) {
                array[a][b-1][c] = w(a, b-1, c);
            }
            array[a][b][c] = array[a][b][c-1] + array[a][b-1][c-1] - array[a][b-1][c];
        } else {
            if(array[a-1][b][c] == 0) {
                array[a-1][b][c] = w(a-1, b, c);
            }
            if(array[a-1][b-1][c] == 0) {
                array[a-1][b-1][c] = w(a-1, b-1 ,c);
            }
            if(array[a-1][b][c-1] == 0) {
                array[a-1][b][c-1] = w(a-1, b, c-1);
            }
            if(array[a-1][b-1][c-1] == 0) {
                array[a-1][b-1][c-1] = w(a-1, b-1, c-1);
            }
            array[a][b][c] = array[a-1][b][c] + array[a-1][b][c-1] + array[a-1][b-1][c] - array[a-1][b-1][c-1];
        }
        return array[a][b][c];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String endFlag = "-1 -1 -1";
        List<StringBuilder> list = new ArrayList<>();
        while (true) {
            String temp = scanner.nextLine();
            if (endFlag.equals(temp)) {
                break;
            }
            StringBuilder builder = new StringBuilder();
            String[] nums = temp.split("\\s+");
            int a = Integer.parseInt(nums[0]), b = Integer.parseInt(nums[1]), c = Integer.parseInt(nums[2]);
            builder.append("w(").append(a).append(", ").append(b).append(", ").append(c).append(") = ").append(w(a,b,c));
            list.add(builder);
        }
        scanner.close();
        for (StringBuilder s : list) {
            System.out.println(s);
        }
    }

}
