package com.luogu.algorithm.p1888;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int maxNumber, minNumber, a;
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt(), y = scan.nextInt(), z = scan.nextInt();
        if (x >= y && x >= z) {
            maxNumber = x;
            if (y >= z)
                minNumber = z;
            else
                minNumber = y;
        } else if (y >= x && y >= z) {
            maxNumber = y;
            if (x >= z)
                minNumber = z;
            else
                minNumber = x;
        } else {
            maxNumber = z;
            if (x >= y)
                minNumber = y;
            else
                minNumber = x;
        }

        int number1 = maxNumber;
        int number2 = minNumber;

        while(number2!=0){
            int r = number1 % number2;
            number1 = number2;
            number2 = r;
        }

        //在while过程中，a与b的值会发生改变，所以需要将a，b的值赋给oa,ob
        //oa与ob的最大公约数是a
        a = number1;
        minNumber /= a;
        maxNumber /= a;

        System.out.println(minNumber + "/" + maxNumber);
        scan.close();
    }

}

