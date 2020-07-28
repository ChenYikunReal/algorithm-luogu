package com.luogu.algorithm.p5717;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
        scanner.close();
        boolean isTriangle = a < b + c && b < a + c && c < a + b;
        boolean isObtuse = a*a >  b*b + c*c || b*b >  a*a + c*c || c*c >  a*a + b*b;
        boolean isRight  = a*a == b*b + c*c || b*b == a*a + c*c || c*c == a*a + b*b;
        if (!isTriangle) {
            System.out.println("Not triangle");
            return;
        } else if (isObtuse) {
            System.out.println("Obtuse triangle");
        } else if (isRight) {
            System.out.println("Right triangle");
        } else {
            System.out.println("Acute triangle");
        }
        boolean isIsosceles = a == b || a == c || b == c;
        boolean isEquilateral = a == b && a == c && b == c;
        if (isIsosceles) {
            System.out.println("Isosceles triangle");
            if (isEquilateral) {
                System.out.println("Equilateral triangle");
            }
        }
    }
}
