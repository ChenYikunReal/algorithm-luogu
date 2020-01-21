package com.luogu.algorithm.test1;

class Node<T> {
    T element;
    Node<T> next;
}

class LinkedList<T> {
    Node<T> first;
    public T getMiddleElement() {
        if (first == null) {
            return null;
        }
        Node prev, back;
        prev = back = first;
        while (prev != null) {
            prev = prev.next;
            if (prev == null) {
                break;
            }
            prev = prev.next;
            if (prev != null) {
                back = back.next;
            }
        }
        return (T) back.element;
    }
}


public class LinkedMiddleElement {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Node<Integer> node1 = new Node<>();
        Node<Integer> node2 = new Node<>();
        Node<Integer> node3 = new Node<>();
        Node<Integer> node4 = new Node<>();
        Node<Integer> node5 = new Node<>();
        Node<Integer> node6 = new Node<>();
        node1.element = 20;
        node2.element = 40;
        node3.element = 60;
        node4.element = 80;
        node5.element = 100;
        node6.element = 120;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        list.first = node1;
        System.out.println(list.getMiddleElement());
    }

}
