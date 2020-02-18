package com.luogu.algorithm.test.judge_circular_linkedlist;

public class Main {

    private static class Node<T> {
        T element;
        Node<T> next;
        Node(T element) {
            this.element = element;
        }
    }

    private static class LinkedList<T> {
        Node<T> first;
        private Node<T> isCircular() {
            Node<T> prev = first;
            Node<T> rear = first;
            while (prev.next != null) {
                prev = prev.next;
                if (prev.next == null) {
                    return null;
                }
                prev = prev.next;
                rear = rear.next;
                if (prev == rear) {
                    return prev;
                }
            }
            return null;
        }
        private Node<T> getEntry() {
            Node<T> prev = isCircular();
            if (prev == null) {
                return null;
            }
            Node<T> rear = first;
            while (prev != rear) {
                prev = prev.next;
                rear = rear.next;
            }
            return prev;
        }
    }

    public static void main(String[] args) {
        Node<Integer> node1 = new Node<>(1);
        Node<Integer> node2 = new Node<>(2);
        Node<Integer> node3 = new Node<>(3);
        Node<Integer> node4 = new Node<>(4);
        Node<Integer> node5 = new Node<>(5);
        Node<Integer> node6 = new Node<>(6);
        Node<Integer> node7 = new Node<>(7);
        Node<Integer> node8 = new Node<>(8);
        Node<Integer> node9 = new Node<>(9);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = node4;
        LinkedList<Integer> list = new LinkedList<>();
        list.first = node1;
        System.out.println("链表是否有环：" + (list.isCircular() == null ? "false" : "true"));
        Node<Integer> entry = list.getEntry();
        System.out.println("链表环的入口是：" + (entry == null ? "不存在" : "Node"+entry.element));
    }

}
