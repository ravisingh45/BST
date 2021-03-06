package com.bridgelabz;

public class BinarySearchTree<k extends Comparable<k>> {
    Node<k> root;
    public void add(k key) {
        this.root = this.insert(root, key);
    }
    private Node<k> insert(Node<k> root, k value) {
        if (root == null) {
            return new Node<>(value);
        }
        int compareResult = value.compareTo(root.value);
        if (compareResult == 0) {
            return root;
        }
        if (compareResult < 0) {
            root.left = insert(root.left, value);
        } else if (compareResult > 0) {
            root.right = insert(root.right, value);
        }
        return root;

    }
    public void printNodes() {
        printNodes(root);
    }

    private void printNodes(Node<k> root) {
        if (root != null) {
            printNodes(root.left);
            System.out.println(root.value);
            printNodes(root.right);

        }
    }

    public static void main(String[] args) {
        BinarySearchTree<Integer> element = new BinarySearchTree<>();
        element.add(56);
        element.add(30);
        element.add(70);
        element.printNodes();
    }
}
