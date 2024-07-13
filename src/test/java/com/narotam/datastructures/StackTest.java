package com.narotam.datastructures;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StackTest {
    
    @Test
    public void testPush() {
        Stack<Integer> stack = new Stack<>(10);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        assertEquals(30, stack.peek());
        assertEquals(30, stack.pop());
        assertEquals(20, stack.peek());
        assertEquals(20, stack.pop());
    }
}
