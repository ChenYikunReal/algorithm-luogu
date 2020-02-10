package com.luogu.algorithm.test;

import java.util.Stack;

public class StringReverseTest {

    private static void swap(char a, char b) {
        if (a != b) {
            a ^= b;
            b ^= a;
            a ^= b;
        }
    }

    public static void main(String[] args) {
        String string = "ADFGJINJOOKC";
        int length = string.length();
        char[] chars0 = string.toCharArray();
        //方法一：倒转char[]
        char[] chars1 = new char[length];
        for (int i = 0; i < length; i++) {
            chars1[i] = chars0[length-i-1];
        }
        System.out.println(new String(chars1));
        //方法二：利用StringBuilder的reverse()
        System.out.println(new StringBuilder(string).reverse());
        //方法三：直接拼接
        StringBuilder reverse3 = new StringBuilder();
        for (int i = length-1; i >= 0; i--) {
            reverse3.append(chars0[i]);
        }
        System.out.println(reverse3);
        //方法四：直接倒着打印
        for (int i = length-1; i >= 0; i--) {
            System.out.print(chars0[i]);
        }
        System.out.println();
        //方法五：利用charAt(i)来拼接
        StringBuilder reverse5 = new StringBuilder();
        for (int i = length-1; i >= 0; i--) {
            reverse5.append(string.charAt(i));
        }
        System.out.println(reverse5);
        //方法六：使用栈来拼接
        Stack<Character> stack = new Stack<>();
        for (char c : chars0) {
            stack.push(c);
        }
        StringBuilder reverse6 = new StringBuilder();
        while (!stack.isEmpty()) {
            reverse6.append(stack.pop());
        }
        System.out.println(reverse6);
        //方法七：两侧向中间交换
        char[] chars7 = chars0;
        for (int i = 0; i < length/2; i++) {
            char temp = chars7[i];
            chars7[i] = chars7[length-i-1];
            chars7[length-i-1] = temp;
        }
        System.out.println(new String(chars7));
        //swap()
        char[] chars8 = chars0;
        for (int i = 0; i < length/2; i++) {
            swap(chars8[i], chars8[length-i-1]);
        }
        System.out.println(new String(chars8));
    }

}
