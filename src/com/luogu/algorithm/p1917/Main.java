package com.luogu.algorithm.p1917;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] chars = new char[9];
        for (int i = 0; i < 3; i++) {
            char[] temp = scanner.nextLine().toCharArray();
            System.arraycopy(temp, 0, chars, i * 3, 3);
        }
        scanner.close();
        boolean flag = false;
        int counter = 0;
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                char a = chars[3*i+j];
                if(a!='-'){
                    counter++;
                    if(a =='X' && Math.abs(i-j) == 1) {
                        flag = true;
                    }
                }
            }
        }
        if(flag) {
            System.out.println("xiaoa will win.");
        } else {
            System.out.println("Dont know.");
        }
        System.out.println(counter);
    }
}
