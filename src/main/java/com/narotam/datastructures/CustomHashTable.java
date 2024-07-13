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
        int hash = 7;
        String hashCode = String.valueOf(Math.abs(key.hashCode()));
        for (int i = 0; i < hashCode.length(); i++) {
          hash = Math.abs(hash * 31 + hashCode.charAt(i));
        }
        return hash % buckets.length; // Map hash code to bucket index
    }

    public void put(K key, V value) {
        int index =  hash(key);

        Entry<K,V> entry = new Entry<>(key, value);

        if (buckets[index] == null) {
            buckets[index] = entry;
        } else {
            entry.next = buckets[index];
            buckets[index] = entry;
        }
    }

    @SuppressWarnings("unchecked")
    public V get(K key) {
        int index = hash(key);

        Entry<K, V> current = buckets[index];

        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }

            current = current.next;
        }
        return null;
    }
}
