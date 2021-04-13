package com.luogu.algorithm.p6500;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next().replaceAll("6", "5"), b = sc.next().replaceAll("6", "5");
        System.out.println(Integer.parseInt(a)+Integer.parseInt(b) + " " + (Integer.parseInt(a.replaceAll("5", "6"))+Integer.parseInt(b.replaceAll("5", "6"))));
        sc.close();
    }

}
