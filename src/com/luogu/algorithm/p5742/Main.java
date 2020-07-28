package com.luogu.algorithm.p5742;

import java.util.Scanner;

public class Main {

    private static class Student {
        private int id;
        private int grade1;
        private int grade2;
        private double grade;
        Student(int id, int grade1, int grade2) {
            this.id = id;
            this.grade1 = grade1;
            this.grade2 = grade2;
            this.grade = grade1 * 0.7 + grade2 * 0.3;
        }
        String isExcellent() {
            return (grade1+grade2>140 && grade>=80) ? "Excellent" : "Not excellent";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println((new Student(scanner.nextInt(), scanner.nextInt(), scanner.nextInt())).isExcellent());
        }
        scanner.close();
    }

}