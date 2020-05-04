package com.luogu.algorithm.p1170;

import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new FileReader(new File(
//                "D:/IDEA/algorithm/src/com/luogu/algorithm/p1170/P1170_2.in")));
        StringBuilder result = new StringBuilder();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        String[] x1_arr = new String[num], y1_arr = new String[num], x2_arr = new String[num], y2_arr = new String[num];
        for (int i = 0; i < num; i++) {
            String[] temp1 = reader.readLine().split(" "), temp2 = reader.readLine().split(" ");
            x1_arr[i] = temp1[0];
            x2_arr[i] = temp2[0];
            y1_arr[i] = temp1[1];
            y2_arr[i] = temp2[1];
        }
        reader.close();
        for (int i = 0; i < num; i++) {
            BigInteger x1 = new BigInteger(x1_arr[i]), y1 = new BigInteger(y1_arr[i]), x2 = new BigInteger(x2_arr[i]),
                    y2 = new BigInteger(y2_arr[i]);
            if ((x2.subtract(x1)).gcd((y2.subtract(y1))).equals(BigInteger.ONE)) {
                result.append("no\n");
            } else {
                result.append("yes\n");
            }
        }
        System.out.print(result);
    }
}
