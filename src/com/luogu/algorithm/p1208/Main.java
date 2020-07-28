package com.luogu.algorithm.p1208;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    private static class Person {
        int price;
        int num;
        Person(int price, int num) {
            this.price = price;
            this.num = num;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] line = reader.readLine().split("\\s");
        int need = Integer.parseInt(line[0]), num = Integer.parseInt(line[1]);
        Person[] array = new Person[num];
        for (int i = 0; i < num; i++) {
            line = reader.readLine().split("\\s");
            array[i] = new Person(Integer.parseInt(line[0]), Integer.parseInt(line[1]));
        }
        reader.close();
        Arrays.sort(array, Comparator.comparing(person -> person.price));
        long sum = 0;
        for (Person p : array) {
            if (need > p.num) {
                sum += p.num * p.price;
                need -= p.num;
            } else {
                sum += need * p.price;
                break;
            }
        }
        System.out.println(sum);
    }

}
