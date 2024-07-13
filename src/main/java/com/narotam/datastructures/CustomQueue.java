package com.narotam.datastructures;

public class CustomQueue <T> {
    
    private T[] queue;
    private int front = 0;
    private int rear = 0;

    public CustomQueue(int initialCapacity) {
        this.queue = (T[]) new Object[initialCapacity];
    }

    public void add(T t) {
        this.queue[rear++] = t;
    }

    public T peek() {
        return this.queue[front];
    }

    public T dequeue() {
        return this.queue[front++];
    }
}
