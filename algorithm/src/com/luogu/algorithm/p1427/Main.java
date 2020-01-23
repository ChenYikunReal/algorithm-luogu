package com.luogu.algorithm.p1427;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int x = scan.nextInt();
            if (x != 0) {
                array.add(x);
            } else {
                break;
            }
        }
        int length = array.size();
        for (int i = length-1; i >= 0; i--) {
            System.out.print(array.get(i) + " ");
        }
        scan.close();
    }

}

