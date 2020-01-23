package com.luogu.algorithm.p1030;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        String inOrder = scanner.nextLine(), postOrder = scanner.nextLine();
        scanner.close();
        preOrder(inOrder, postOrder);
    }

    private static void preOrder(String inOrder, String postOrder) {
        if (inOrder.length() > 0) {
            char root = postOrder.charAt(postOrder.length()-1);
            int index = inOrder.indexOf(root);
            if (index == -1) {
                return;
            }
            System.out.print(root);
            preOrder(inOrder.substring(0, index), postOrder.substring(0, index));
            preOrder(inOrder.substring(index+1), postOrder.substring(index, inOrder.length()-1));
        }
    }
}
