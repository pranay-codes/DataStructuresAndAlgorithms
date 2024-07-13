package com.narotam.datastructures;

public class Stack<T> {
    
    private T[] stack;
    private int top;

    public Stack(int capacity) {
        this.stack = (T[]) new Object[capacity];
        top = -1;
    }

    public void push(T t) {
        if (top ==  stack.length -1) {
            resize(stack.length * 2);
        }
        stack[++top] = t;
    }

    public T pop() {
        return stack[top--];
    }

    public T peek() {
        return stack[top];
    }

    private void resize(int newCapacity) {
        T[] newStack = (T[]) new Object[newCapacity];
        System.arraycopy(this.stack, 0, newStack, 0, newCapacity);
        this.stack = newStack;
    }
}
