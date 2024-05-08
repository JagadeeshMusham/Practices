package com.musham.practices.ds.search;

import java.util.HashMap;
import java.util.Map;

public class HashSearch {
    public static void main(String[] args) {
        // Create a HashMap to store key-value pairs
        Map<String, Integer> map = new HashMap<>();

        // Populate the map with some data
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);
        map.put("David", 40);

        // Search for a specific key
        String keyToSearch = "Bob";
        if (map.containsKey(keyToSearch)) {
            int age = map.get(keyToSearch);
            System.out.println(keyToSearch + "'s age is " + age);
        } else {
            System.out.println(keyToSearch + " not found in the map");
        }
    }
}
