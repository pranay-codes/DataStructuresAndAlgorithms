package com.narotam.datastructures;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class CustomQueueTest {
    
    @Test
    public void testAddToQueue() {
        CustomQueue<Integer> queue = new CustomQueue<>(10);
        queue.add(50);
        queue.add(60);
        queue.add(100);
        queue.add(122);

        assertEquals(50, queue.peek());
        assertEquals(50, queue.dequeue());
        assertEquals(60, queue.peek());
        assertEquals(60, queue.dequeue());

        // HashMap
    }
}
