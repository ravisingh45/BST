package com.bridgelabz;

public class Node<k extends Comparable<k>> {
    k value;
    Node<k> right;
    Node<k> left;
    public Node(k value) {
        this.value = value;
        right = null;
        left = null;
    }

}
