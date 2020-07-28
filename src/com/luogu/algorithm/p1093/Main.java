package com.luogu.algorithm.p1093;

import java.util.*;

public class Main {

    private static class Grade {
        Integer num;
        Integer chinese;
        Integer grade;
        public Grade(int num, int chinese, int grade) {
            this.num = num;
            this.chinese = chinese;
            this.grade = grade;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        Set<Grade> set = new TreeSet<>(new Comparator<Grade>() {
            @Override
            public int compare(Grade grade1, Grade grade2) {
                int result1 = -grade1.grade.compareTo(grade2.grade);
                if (result1 != 0) {
                    return result1;
                }
                int result2 = -grade1.chinese.compareTo(grade2.chinese);
                if (result2 != 0) {
                    return result2;
                }
                return grade1.num.compareTo(grade2.num);
            }
        });
        for (int i = 1; i <= num; i++) {
            String[] array = scanner.nextLine().split(" ");
            int chinese = Integer.parseInt(array[0]);
            int grade = chinese + Integer.parseInt(array[1]) + Integer.parseInt(array[2]);
            set.add(new Grade(i, chinese, grade));
        }
        int counter = 0;
        for (Grade grade : set) {
            counter++;
            System.out.println(grade.num + " " + grade.grade);
            if (counter == 5) {
                break;
            }
        }
        scanner.close();
    }

}
