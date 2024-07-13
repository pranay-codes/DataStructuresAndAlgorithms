package com.narotam.datastructures;

public class CustomBST {
    
    private Node root;
    private int size;

    private static class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return new StringBuilder("Node: ")
                .append("value=" + this.value + ";")
                .append("left= " + this.left + ";")
                .append("right= " + this.right + ";")
                .toString();
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);

        if (root == null) {
            root = newNode;
        } else {
            Node currentNode = root;

            // go through the node
            // check if the value less that newNode then currentnode is left
            // if value is greater than newNode than currentNode is right
            // if value is equal. value already exist
            

            while (currentNode != null) {
                
                if (currentNode.value < newNode.value) {

                    if (currentNode.left == null) {

                        currentNode.left = newNode;
                        break;
                    } else {
                        currentNode = currentNode.left;
                    }

                } else if (currentNode.value > newNode.value) {

                    if (currentNode.right == null) {
                        currentNode.right = newNode;
                        break;
                    } else {
                        currentNode = currentNode.right;
                    }
                } 

            }
            // System.out.println("curNode - " + currentNode);

        }

        size++;
    }

    public boolean search(int data) {

        Node currentNode = root;

        while (currentNode != null) {
            if (currentNode.value == data) {
                return true;
            }

            if (currentNode.value < data) {
                currentNode = currentNode.left;
            } else if (currentNode.value > data) {
                currentNode = currentNode.right;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return this.root.toString();
    }
}
