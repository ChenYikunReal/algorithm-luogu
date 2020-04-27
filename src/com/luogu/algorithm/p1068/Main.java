package com.luogu.algorithm.p1068;

import java.util.*;

public class Main {

    private static class Person {
        Integer id;
        Integer grade;
        public Person(int id, int grade) {
            this.id = id;
            this.grade = grade;
        }
    }

    public static void main(String[] args) {
        Set<Person> set = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person person1, Person person2) {
                int grade_compare = -person1.grade.compareTo(person2.grade);
                if (grade_compare != 0) {
                    return grade_compare;
                }
                return person1.id.compareTo(person2.id);
            }
        });
        Scanner scanner = new Scanner(System.in);
        int all_num = scanner.nextInt(), aim_num = scanner.nextInt();
        scanner.nextLine();
        aim_num = (int)Math.floor(aim_num*1.5);
        for (int i = 0; i < all_num; i++) {
            String[] array = scanner.nextLine().split(" ");
            set.add(new Person(Integer.parseInt(array[0]), Integer.parseInt(array[1])));
        }
        List<String> list = new ArrayList<>(aim_num);
        int counter = 0, low = 0;
        for (Person person : set) {
            if (counter >= aim_num && low != person.grade) {
                break;
            }
            counter++;
            list.add(person.id + " " + person.grade);
            if (counter == aim_num) {
                low = person.grade;
            }
        }
        System.out.println(low + " " + counter);
        for (String s : list) {
            System.out.println(s);
        }
        scanner.close();
    }

}
