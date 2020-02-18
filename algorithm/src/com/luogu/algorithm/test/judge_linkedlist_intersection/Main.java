package com.luogu.algorithm.test.judge_linkedlist_intersection;

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
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.first = node1;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = node4;
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.first = node6;
        Node<Integer> rear1 = list1.first;
        Node<Integer> rear2 = list2.first;
        while (rear1.next != null) {
            rear1 = rear1.next;
        }
        while (rear2.next != null) {
            rear2 = rear2.next;
        }
        System.out.println("两个链表是否相交：" + (rear1 == rear2));
    }

}
