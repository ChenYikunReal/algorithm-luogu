package com.luogu.algorithm.p5744;

import java.util.Scanner;

public class Main {

    private static class Student {
        private String name;
        private int age;
        private int grade;
        Student(String name, int age, int grade) {
            this.name = name;
            this.age = age;
            this.grade = grade;
        }
        @Override
        public String toString() {
            return name + ' ' + (age+1) + ' ' + ((grade>=500)?600:(int)(grade*1.2));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println(new Student(scanner.next(), scanner.nextInt(), scanner.nextInt()).toString());
        }
        scanner.close();
    }

}
