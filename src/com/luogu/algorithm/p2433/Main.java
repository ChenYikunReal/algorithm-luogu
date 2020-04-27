package com.luogu.algorithm.p2433;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pi = 3.141593;
        switch (scanner.nextInt()) {
            case 1:
                System.out.println("I love Luogu!");
                break;
            case 2:
                System.out.println("6 4");
                break;
            case 3:
                System.out.println("3\n12\n2");
                break;
            case 4:
                System.out.println("166.667");
                break;
            case 5:
                System.out.println(15);
                break;
            case 6:
                System.out.println("10.8167");
                break;
            case 7:
                System.out.println("110\n90\n0");
                break;
            case 8:
                System.out.println("31.4159\n78.5398\n523.599");
                break;
            case 9:
                System.out.println(22);
                break;
            case 10:
                System.out.println(9);
                break;
            case 11:
                System.out.println("33.3333");
                break;
            case 12:
                System.out.println("13\nR");
                break;
            case 13:
                System.out.println((int)(Math.pow(4.0/3*pi*(4*4*4+10*10*10),1.0*1/3)));
                break;
            case 14:
                System.out.println(50);
                break;
        }
        scanner.close();
    }
}
