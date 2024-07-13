package com.narotam.datastructures;

public class CustomHashTable <K, V> {

    private Entry<K,V>[] buckets;

    public CustomHashTable() {
        this.buckets = new Entry[10];
    }
    
    private static class Entry <K,V> {
        private K key;
        private V value;
        private Entry next;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

    }

    private int hash(K key) {
        return key.hashCode();
    }

    public void put(K key, V value) {
        
    }
}
