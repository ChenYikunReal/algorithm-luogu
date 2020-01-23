package com.luogu.algorithm.p1305;

import java.util.*;

public class Main {

    static class Node {
        char data;
        Node left, right;
        Node(char data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return data == node.data;
        }
        @Override
        public int hashCode() {
            return Objects.hash(data);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        if (num == 0) {
            return;
        }
        //树非空，进行一系列初始化
        Map<Character, Node> map = new HashMap<>(num);
        Map<Character, Node> unAddedMap = new HashMap<>(num);
        char[] firstChars = scanner.nextLine().toCharArray();
        //初始化根结点
        Node root = new Node(firstChars[0]);
        map.put(firstChars[0], root);
        if (firstChars[1] != '*') {
            root.left = new Node(firstChars[1]);
            map.put(firstChars[1], root.left);
        }
        if (firstChars[2] != '*') {
            root.right = new Node(firstChars[2]);
            map.put(firstChars[2], root.right);
        }
        //循环num-1次
        for (int i = 1; i < num; i++) {
            char[] chars = scanner.nextLine().toCharArray();
            //根、左儿子、右儿子的char
            char tempRootChar = chars[0], tempLeftChar = chars[1], tempRightChar = chars[2];
            //临时的根结点、左儿子结点、右儿子结点
            Node tempRoot, tempLeft, tempRight;
            //Map里已有，也就是说已经存在临时父结点，而且子结点肯定没有
            if (map.containsKey(tempRootChar)) {
                tempRoot = map.get(tempRootChar);
                //子结点必定不存在于Map，但要看看unAdded
                if (unAddedMap.containsKey(tempLeftChar)) {
                    tempLeft = unAddedMap.get(tempLeftChar);
                    root.left = tempLeft;
                    addRecursively(tempLeft, map);
                    deleteRecursively(tempLeft, unAddedMap);
                } else if (tempLeftChar == '*') {
                    tempLeft = null;
                } else {
                    tempLeft = new Node(tempLeftChar);
                    map.put(tempLeftChar, tempLeft);
                }
                if (unAddedMap.containsKey(tempRightChar)) {
                    tempRight = unAddedMap.get(tempRightChar);
                    root.right = tempRight;
                    addRecursively(tempRight, map);
                    deleteRecursively(tempRight, unAddedMap);
                } else if (tempRightChar == '*') {
                    tempRight = null;
                } else {
                    tempRight = new Node(tempRightChar);
                    map.put(tempRightChar, tempRight);
                }
                //插入左右儿子节点
                tempRoot.left = tempLeft;
                tempRoot.right = tempRight;
            } else if (unAddedMap.containsKey(tempRootChar)) {  //这就是说它的父结点已经存在咯，然后还没插进树里
                //继续放在unAdded里
                tempRoot = unAddedMap.get(tempRootChar);
                //子结点必定不存在
                //插入左右儿子节点
                if (tempLeftChar != '*') {
                    tempLeft = new Node(tempLeftChar);
                    tempRoot.left = tempLeft;
                    unAddedMap.put(tempLeftChar, tempLeft);
                }
                if (tempRightChar != '*') {
                    tempRight = new Node(tempRightChar);
                    tempRoot.right = tempRight;
                    unAddedMap.put(tempRightChar, tempRight);
                }
            } else {        //两边都没有，看看是不是子结点就是现在的根
                tempRoot = new Node(tempRootChar);
                if (tempLeftChar == '*') {
                    tempLeft = null;
                } else {
                    tempLeft = new Node(tempLeftChar);
                    tempRoot.left = tempLeft;
                }
                if (tempRightChar == '*') {
                    tempRight = null;
                } else {
                    tempRight = new Node(tempRightChar);
                    tempRoot.right = tempRight;
                }
                if (root.equals(tempLeft)) {        //左儿子是根结点，换根
                    tempLeft = root;
                    tempRoot.left = tempLeft;
                    root = tempRoot;
                    //查找右儿子
                    if (unAddedMap.containsKey(tempRightChar)) {
                        tempRight = unAddedMap.get(tempRightChar);
                        root.right = tempRight;
                        addRecursively(tempRight, map);
                        deleteRecursively(tempRight, unAddedMap);
                    }
                } else if (root.equals(tempRight)) {        //右儿子是根结点，换根
                    tempRight = root;
                    tempRoot.right = tempRight;
                    root = tempRoot;
                    //查找左儿子
                    if (unAddedMap.containsKey(tempLeftChar)) {
                        tempLeft = unAddedMap.get(tempLeftChar);
                        root.left = tempLeft;
                        addRecursively(tempLeft, map);
                        deleteRecursively(tempLeft, unAddedMap);
                    }
                } else {                        //插入unAdded里
                    if (unAddedMap.containsKey(tempLeftChar)) {
                        tempRoot.left = unAddedMap.get(tempLeftChar);
                    } else if (tempLeftChar != '*') {
                        unAddedMap.put(tempLeftChar, tempLeft);
                    }
                    if (unAddedMap.containsKey(tempRightChar)) {
                        tempRoot.right = unAddedMap.get(tempRightChar);
                    } else if (tempRightChar != '*') {
                        unAddedMap.put(tempRightChar, tempRight);
                    }
                    unAddedMap.put(tempRootChar, tempRoot);
                }
            }
        }
        scanner.close();
        preOrder(root);
    }

    private static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    private static void deleteRecursively(Node root, Map<Character, Node> unAddedMap) {
        if (root == null) {
            return;
        }
        unAddedMap.remove(root.data);
        deleteRecursively(root.left, unAddedMap);
        deleteRecursively(root.right, unAddedMap);
    }

    private static void addRecursively(Node root, Map<Character, Node> map) {
        if (root == null) {
            return;
        }
        map.put(root.data, root);
        addRecursively(root.left, map);
        addRecursively(root.right, map);
    }

}
