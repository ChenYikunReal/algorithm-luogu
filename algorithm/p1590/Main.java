package com.luogu.algorithm.p1590;

import java.util.Scanner;

public class Main {

    private static int function(char[] chars, int length) {
        int sum = 0;
        for (int i = 0; i < length; i++) {
            if (chars[i] < '7' && i < length-1) {
                chars[i+1] += (chars[i]-48)*10;
            } else {
                chars[i]-=48;
                sum += (chars[i]/10 * (int)(Math.pow(10, length-i-1)));
                chars[i]%=10;
                if (chars[i] >= 7) {
                    sum += (int)(Math.pow(10, length-i-1));
                } else {
                    if (i < length-1) {
                        chars[i+1] += chars[i]*10;
                    }
                }
            }
        }
        return sum;
    }

    /*
    private static int func(char[] chars, int length) {
        int sum = 0, temp = chars[0]-48, left = 0;
        for (int i = 0; i < length; i++) {
            //char变为int，保险起见，规避RE
            int c = chars[i]-48;
            temp += c;
            //当前位为7
            if (c == 7) {
                sum += (int)(Math.pow(10, length-i-1));
                if (i < length-1) {     //当前位不是最低位
                    c = temp/10-1;
                    temp += 60;
                }
            } else if (c > 7) {   //当前位大于7
                sum += (int)(Math.pow(10, length-i-1));
                if (i < length-1) {
                    temp += (--c)*10;
                }
            } else {              //当前位小于7
                if (i < length-1) {
                    temp += c*10;
                }
            }
        }
    }

     */

    private static int calculate_num(int num) {
        char[] chars = Integer.toString(num).toCharArray();
        int length = chars.length;
        if (length == 1) {
            if (num < 7) {
                return 0;
            } else {
                return 1;
            }
        }
        return function(chars, length);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] result = new int[num];
        for (int i = 0; i < num; i++) {
            int tempNumber = scanner.nextInt();
            result[i] = tempNumber-calculate_num(tempNumber);
        }
        for (int i = 0; i < num; i++) {
            System.out.println(result[i]);
        }
        scanner.close();
    }

}
