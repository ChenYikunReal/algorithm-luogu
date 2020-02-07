package com.luogu.algorithm.p1087;

import java.util.Scanner;

public class Main {

    private static StringBuilder result = new StringBuilder();

    private static class Node<T> {
        T value;
        Node<T> left;
        Node<T> right;
        Node(T value) {
            this.value = value;
        }
    }

    private static class FBITree<T> {
        Node<T> root;
        private void postOrder(Node<T> node) {
            if (node == null) {
                return;
            }
            if (node.left != null) {
                postOrder(node.left);
            }
            if (node.right != null) {
                postOrder(node.right);
            }
            result.append(node.value);
        }
    }

    private static Node<String> produceNode(String sequence) {
        return sequence.contains("0") ? (sequence.contains("1") ? new Node<>("F") : new Node<>("B")) :
                new Node<>("I");
    }

    private static void produceTree(String sequence, Node<String> node) {
        if (sequence.length() == 1) {
            return;
        }
        String leftPart = sequence.substring(0, sequence.length()/2);
        node.left = produceNode(leftPart);
        produceTree(leftPart, node.left);
        String rightPart = sequence.substring(sequence.length()/2);
        node.right = produceNode(rightPart);
        produceTree(rightPart, node.right);
    }

    public static void main(String[] args) {
        FBITree<String> tree = new FBITree<>();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String sequence = scanner.next();
        scanner.close();
//        if (num == 0) {
//            if ("0".equals(sequence)) {
//                System.out.println("B");
//            } else {
//                System.out.println("I");
//            }
//            return;
//        }
        Node<String> node = tree.root = produceNode(sequence);
        produceTree(sequence, node);
    }

}
