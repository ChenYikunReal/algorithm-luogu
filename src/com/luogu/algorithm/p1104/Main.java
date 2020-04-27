package com.luogu.algorithm.p1104;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static class OIer {
        String name;
        Integer year;
        Integer month;
        Integer day;
        Integer id;
        OIer(String name, int year, int month, int day, int id) {
            this.name = name;
            this.year = year;
            this.month = month;
            this.day = day;
            this.id = id;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        OIer[] oIers = new OIer[num];
        for (int i = 0; i < num; i++) {
            String[] info = scanner.nextLine().split("\\s+");
            oIers[i] = new OIer(info[0], Integer.parseInt(info[1]), Integer.parseInt(info[2]),
                    Integer.parseInt(info[3]), i);
        }
        scanner.close();
        Arrays.sort(oIers, (dalao1, dalao2) -> {
            int year = dalao1.year.compareTo(dalao2.year);
            if (year != 0) {
                return year;
            }
            int month = dalao1.month.compareTo(dalao2.month);
            if (month != 0) {
                return month;
            }
            int day = dalao1.day.compareTo(dalao2.day);
            if (day != 0) {
                return day;
            }
            return dalao2.id.compareTo(dalao1.id);
        });
        for (OIer dalao : oIers) {
            System.out.println(dalao.name);
        }
    }

}
