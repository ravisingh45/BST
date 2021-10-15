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
    public int  getSize() {
        return this.getSizeRecursive(root);
    }
    public int getSizeRecursive(Node<k> root) {
        if(root==null) {
            return 0;
        }
        return 1 + getSizeRecursive(root.left)+getSizeRecursive(root.right);
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
        element.add(22);
        element.add(40);
        element.add(60);
        element.add(95);
        element.add(11);
        element.add(65);
        element.add(3);
        element.add(16);
        element.add(63);
        element.add(67);
        element.printNodes();
        int size = element.getSize();
        System.out.println("Size of tree "+" " +size);
    }
}
