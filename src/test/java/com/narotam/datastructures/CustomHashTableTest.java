package com.narotam.datastructures;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CustomHashTableTest {
    
    @Test
    public void testAddToCustomHashTable() {
        CustomHashTable<String, String> hashTable = new CustomHashTable<>();

        hashTable.put("number1", "TheValue1");
        hashTable.put("number3", "the value 3");
        hashTable.put("Number4123", "value23131");

        assertEquals("the value 3", hashTable.get("number3"));
    }
}
