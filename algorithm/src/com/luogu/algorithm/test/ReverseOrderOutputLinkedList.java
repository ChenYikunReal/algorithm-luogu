package com.luogu.algorithm.test;

class Node<T> {
    T element;
    Node<T> next;
    Node(T element) {
        this.element = element;
    }
}

class Stack<T> {
    Node<T> top;
    void push(T data) {
        if (top == null) {
            top = new Node<>(data);
        } else {
            Node<T> temp = new Node<>(data);
            temp.next = top;
            top = temp;
        }
    }
    Node<T> pop() {
        if (isEmpty()) {
            return null;
        }
        Node<T> temp = top;
        top = temp.next;
        return temp;
    }
    boolean isEmpty() {
        return top == null;
    }
}

class LinkedList<T> {
    Node<T> first;
    public void reverseOutput() {
        Stack<T> stack = new Stack<>();
        Node<T> temp = first;
        while (temp != null) {
            stack.push(temp.element);
            temp = temp.next;
        }
        Node<T> top = stack.top;
        while (top != null) {
            top = stack.pop();
            if (top == null) {
                break;
            }
            System.out.println(top.element);
        }
    }
}

public class ReverseOrderOutputLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Node<Integer> node1 = new Node<>(20);
        Node<Integer> node2 = new Node<>(40);
        Node<Integer> node3 = new Node<>(60);
        Node<Integer> node4 = new Node<>(80);
        Node<Integer> node5 = new Node<>(100);
        Node<Integer> node6 = new Node<>(120);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        list.first = node1;
        list.reverseOutput();
    }
}
