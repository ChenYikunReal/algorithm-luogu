package com.luogu.algorithm.p1015;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<Character, Integer> charMap;

    private static Map<Integer, Character> intMap;

    static {
        charMap = new HashMap<>();
        charMap.put('0', 0);
        charMap.put('1', 1);
        charMap.put('2', 2);
        charMap.put('3', 3);
        charMap.put('4', 4);
        charMap.put('5', 5);
        charMap.put('6', 6);
        charMap.put('7', 7);
        charMap.put('8', 8);
        charMap.put('9', 9);
        charMap.put('A', 10);
        charMap.put('B', 11);
        charMap.put('C', 12);
        charMap.put('D', 13);
        charMap.put('E', 14);
        charMap.put('F', 15);
        intMap = new HashMap<>();
        intMap.put(0, '0');
        intMap.put(1, '1');
        intMap.put(2, '2');
        intMap.put(3, '3');
        intMap.put(4, '4');
        intMap.put(5, '5');
        intMap.put(6, '6');
        intMap.put(7, '7');
        intMap.put(8, '8');
        intMap.put(9, '9');
        intMap.put(10, 'A');
        intMap.put(11, 'B');
        intMap.put(12, 'C');
        intMap.put(13, 'D');
        intMap.put(14, 'E');
        intMap.put(15, 'F');
    }

    /**
     * 字符串反转
     * @param string 待翻转字符串
     * @return 翻转后的字符串
     */
    private static String reverse(String string) {
        return new StringBuilder(string).reverse().toString();
    }

    /**
     * 十六进制加法
     * @param num1 加数1
     * @param num2 加数2（位数与加数1相同）
     * @return 十六进制和
     */
    private static String hexAdd(String num1, String num2) {
        //获取char[]
        char[] chars1 = num1.toCharArray();
        char[] chars2 = num2.toCharArray();
        //长度
        int length = chars1.length;
        //结果的char[]
        char[] result = new char[length+1];
        for (int i = length-1; i >= 0; i--) {
            //实际上是int
            int temp = charMap.get(chars1[i]) + charMap.get(chars2[i]) + result[i+1];
            if (temp >= 16) {
                //本位溢出，进位
                result[i+1] = intMap.get(temp-16);
                result[i]++;
            } else {
                result[i+1] = intMap.get(temp);
            }
        }
        //最终溢出
        if (result[0] == 0) {
            return new String(result).substring(1);
        }
        result[0] += 48;
        return new String(result);
    }

    /**
     * 2-10进制的加法
     * @param num1 加数1
     * @param num2 加数2（位数与加数1相同）
     * @param format 两个数所属进制
     * @return N进制和（2 <= N <= 10）
     */
    private static String normallyAdd(String num1, String num2, int format) {
        //获取char[]
        char[] chars1 = num1.toCharArray();
        char[] chars2 = num2.toCharArray();
        //长度
        int length = chars1.length;
        //结果的char[]
        char[] result = new char[length+1];
        for (int i = length-1; i >= 0; i--) {
            //实际上是char
            int temp = chars1[i] + chars2[i] + result[i+1];
            if (temp >= 96 + format) {
                //本位溢出，进位
                result[i+1] = (char)(temp - format - 48);
                result[i]++;
            } else {
                result[i+1] = (char)(temp - 48);
            }
        }
        //最终溢出
        if (result[0] == 0) {
            return new String(result).substring(1);
        }
        result[0] += 48;
        return new String(result);
    }

    /**
     * 判断是否为回文数
     * @param num 待判数值
     * @return 是否为回文数
     */
    private static boolean isPalindrome(String num) {
        if (num.equals(reverse(num))) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //进制（2-10、16）
        int format = Integer.parseInt(scanner.nextLine());
        String num = scanner.nextLine();
        int counter = 0;
        if (format == 16) {
            while (!isPalindrome(num) && counter <= 30) {
                num = hexAdd(num, reverse(num));
                counter++;
            }
        } else {
            while (!isPalindrome(num) && counter <= 30) {
                num = normallyAdd(num, reverse(num), format);
                counter++;
            }
        }
        if (counter > 30) {
            System.out.println("Impossible!");
        } else {
            System.out.println("STEP=" + counter);
        }
        scanner.close();
    }

    private static void low() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String str = Integer.toString(num);
        int i;
        for (i = 0 ; i < 30; i++) {
            StringBuilder reverse = new StringBuilder(str).reverse();
            //是回文数
            if (str.equals(reverse.toString())) {
                break;
            }
            //不是回文数，就增加数值
            num += Integer.parseInt(reverse.toString());
            str = Integer.toString(num);
        }
        if (i == 30) {
            System.out.println("Impossible!");
        } else {
            System.out.println("STEP=" + i);
        }
        scanner.close();
    }

}
