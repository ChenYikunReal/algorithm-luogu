package com.luogu.algorithm.p5714;

import java.util.Scanner;

public class Main {

    private static double roundToSignificantFigures(double num, int n) {
        if(num == 0) {
            return 0;
        }
        double d = Math.ceil(Math.log10(Math.abs(num)));
        int power = n - (int) d;
        double magnitude = Math.pow(10, power);
        long shifted = Math.round(num*magnitude);
        return shifted/magnitude;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = roundToSignificantFigures(scanner.nextDouble()/Math.pow(scanner.nextDouble(), 2), 6);
        scanner.close();
        if (result < 18.5) {
            System.out.println("Underweight");
        } else if (result < 24) {
            System.out.println("Normal");
        } else {
            System.out.println(result + "\nOverweight");
        }
    }

}
