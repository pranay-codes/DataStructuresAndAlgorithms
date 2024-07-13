package com.narotam.datastructures;

public class CustomLinkedList {

    private Node head;
    private int size;
    
    private static class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return new StringBuilder("Node=")
                .append("value=" + value + ";")
                .append("next" + next)
                .toString();
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
        size++;
    }

    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        return this.head.toString();
    }
}
