package com.luogu.algorithm.p5734;

import java.util.Scanner;

public class Main {

    private static String doc = "";

    private static void append(String append_doc) {
        doc = doc + append_doc;
    }

    private static void cut(int from, int range) {
        doc = doc.substring(from, from+range);
    }

    private static void insert(int from, String insert_doc) {
        String head = doc.substring(0, from);
        String rear = doc.substring(from);
        doc = head + insert_doc + rear;
    }

    private static int search(String search_key) {
        return doc.indexOf(search_key);
    }

    private static String getResult(String command) {
        String[] arr = command.split(" ");
        if (command.startsWith("1")) {
            append(arr[1]);
            return doc;
        } else if (command.startsWith("2")) {
            cut(Integer.parseInt(arr[1]), Integer.parseInt(arr[2]));
            return doc;
        } else if (command.startsWith("3")) {
            insert(Integer.parseInt(arr[1]), arr[2]);
            return doc;
        } else {
            return Integer.toString(search(arr[1]));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        doc = scanner.nextLine();
        String[] result = new String[num];
        for (int i = 0; i < num; i++) {
            result[i] = getResult(scanner.nextLine());
        }
        scanner.close();
        for (String s : result) {
            System.out.println(s);
        }
    }

}
