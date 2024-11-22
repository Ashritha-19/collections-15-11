package com.neoteric.collections.customhashmap;

import java.util.ArrayList;
import java.util.LinkedList;

public class CustomHashMap<k,v> {

    private ArrayList<Bucket<k,v>> buckets; // List of buckets
    private int capacity; // Number of buckets
    private int size; // Number of key-value pairs

    public CustomHashMap() {
        this.capacity = 16; // Default capacity
        this.buckets = new ArrayList<>(capacity);
        this.size = 0;

        // Initialize buckets
        for (int i = 0; i < capacity; i++) {
            buckets.add(new Bucket<>());
        }
    }

    // Hash function to determine the bucket index
    private int getBucketIndex(k key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    // Add or update a key-value pair
    public void put(k key, v value) {
        int index = getBucketIndex(key);
        Bucket<k,v> bucket = buckets.get(index);

        bucket.addOrUpdate(key, value);
        size++;
    }

    // Get the value associated with a key
    public v get(k key) {
        int index = getBucketIndex(key);
        Bucket<k,v> bucket = buckets.get(index);

        return bucket.get(key);
    }

    // Remove a key-value pair
    public void remove(k key) {
        int index = getBucketIndex(key);
        Bucket<k,v> bucket = buckets.get(index);

        if (bucket.remove(key)) {
            size--;
        }
    }

    // Get the size of the HashMap
    public int size() {
        return size;
    }

    // Check if the HashMap is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Display all key-value pairs
    public void display() {
        for (int i = 0; i < capacity; i++) {
            LinkedList<Node<k,v>> nodes = buckets.get(i).getNodes();
            if (!nodes.isEmpty()) {
                System.out.println("Bucket " + i + ": " + nodes);
            }
        }
    }

}
