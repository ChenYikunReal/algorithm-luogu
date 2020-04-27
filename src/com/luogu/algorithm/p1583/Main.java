package com.luogu.algorithm.p1583;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static class Person {
        Integer value;
        Integer id;
        Person(int value, int id) {
            this.value = value;
            this.id = id;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(), k = scanner.nextInt();
        Person[] person_array = new Person[num];
        int[] external_array = new int[10];
        for (int i = 0; i < 10; i++) {
            external_array[i] = scanner.nextInt();
        }
        for (int i = 0; i < num; i++) {
            person_array[i] = new Person(scanner.nextInt(), i+1);
        }
        scanner.close();
        Arrays.sort(person_array, (person1, person2) -> {
            int result = -person1.value.compareTo(person2.value);
            return result == 0 ? person1.id.compareTo(person2.id) : result;
        });
        for (int i = 0; i < num; i++) {
            person_array[i].value += external_array[i%10];
        }
        Arrays.sort(person_array, (person1, person2) -> {
            int result = -person1.value.compareTo(person2.value);
            return result == 0 ? person1.id.compareTo(person2.id) : result;
        });
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < k; i++) {
            result.append(person_array[i].id).append(" ");
        }
        System.out.println(result.toString().trim());
    }

}
