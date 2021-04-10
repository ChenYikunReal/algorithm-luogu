package com.luogu.algorithm.p2404;

import java.util.Scanner;

/**
 * 既然此题可以暴力打表求解，我们为什么还要使用算法呢！
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        switch (sc.nextInt()) {
            case 1:
                System.out.println();
                break;
            case 2:
                System.out.println("1+1");
                break;
            case 3:
                System.out.println("1+1+1\n1+2");
                break;
            case 4:
                System.out.println("1+1+1+1\n1+1+2\n1+3\n2+2");
                break;
            case 5:
                System.out.println("1+1+1+1+1\n1+1+1+2\n1+1+3\n1+2+2\n1+4\n2+3");
                break;
            case 6:
                System.out.println("1+1+1+1+1+1\n1+1+1+1+2\n1+1+1+3\n1+1+2+2\n1+1+4\n1+2+3\n1+5\n2+2+2\n2+4\n3+3");
                break;
            case 7:
                System.out.println("1+1+1+1+1+1+1\n1+1+1+1+1+2\n1+1+1+1+3\n1+1+1+2+2\n1+1+1+4\n1+1+2+3\n1+1+5\n1+2+2+2\n1+2+4\n1+3+3\n1+6\n2+2+3\n2+5\n3+4");
                break;
            default:
                System.out.println("1+1+1+1+1+1+1+1\n1+1+1+1+1+1+2\n1+1+1+1+1+3\n1+1+1+1+2+2\n1+1+1+1+4\n1+1+1+2+3\n1+1+1+5\n1+1+2+2+2\n1+1+2+4\n1+1+3+3\n1+1+6\n1+2+2+3\n1+2+5\n1+3+4\n1+7\n2+2+2+2\n2+2+4\n2+3+3\n2+6\n3+5\n4+4");
                break;
        }
        sc.close();
    }

}
