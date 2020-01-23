package com.luogu.algorithm.p1151;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        Scanner scan = new Scanner(System.in);
        int K = scan.nextInt();
        if (K > 0 && K < 3000) {
            for (int i = 10000; i<=30000; i++) {
                int a = i/10000;
                int b = (i - a*10000)/1000;
                int c = (i - a*10000 - b*1000)/100;
                int d = (i - a*10000 - b*1000 - c*100)/10;
                int e = (i - a*10000 - b*1000 - c*100 - d*10);
                int sub1 = a*100 + b*10 + c;
                int sub2 = b*100 + c*10 + d;
                int sub3 = c*100 + d*10 + e;
                if (sub1%K==0 && sub2%K==0 && sub3%K==0) {
                    System.out.println(i);
                    count++;
                }
            }
            if (count==0) {
                System.out.println("No");
            }
        }
        scan.close();
    }
}
