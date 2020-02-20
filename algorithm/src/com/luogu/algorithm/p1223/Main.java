package com.luogu.algorithm.p1223;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    private static class Person {
        Integer time;
        int id;
        Person(int time, int id) {
            this.time = time;
            this.id = id;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Person[] array = new Person[num];
        for (int i = 0; i < num; i++) {
            array[i] = new Person(scanner.nextInt(), i+1);
        }
        scanner.close();
        Arrays.sort(array, Comparator.comparing(person -> person.time));
        long waitingTime = 0, sum = 0;
        StringBuilder result = new StringBuilder();
        for (Person p : array) {
            waitingTime += sum;
            sum += p.time;
            result.append(p.id).append(" ");
        }
        System.out.println(result.toString().trim());
        System.out.printf("%.2f", waitingTime/(double)num);
    }

}
