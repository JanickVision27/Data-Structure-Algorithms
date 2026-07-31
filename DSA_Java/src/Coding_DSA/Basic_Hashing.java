package Coding_DSA;

import java.util.*;

public class Basic_Hashing {

    public void Testing_Hashing() {
        HashMap<String, Double> map = new HashMap<>();

        map.put("apple", 0.50);
        map.put("orange", 0.50);
        map.put("banana", 0.25);
        map.put("coconut", 1.00);

        System.out.println(map);

    }

    public void countFreq() {
        int[] arr = { 10, 5, 10, 15, 10, 5 };
        int n = arr.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        // Storing the values for counting the elements
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

    public void GetContainsKey() {
        HashMap<String, Integer> salaries = new HashMap<>();
        salaries.put("John", 50000);
        salaries.put("Jane", 60000);

        // Get the salary of John
        int johnSalary = salaries.get("John");
        System.out.println("John's salary: " + johnSalary);

        // Check if the map contains a key for Jane
        boolean hasJane = salaries.containsKey("Jane");
        if (hasJane) {
            System.out.println("Jane's Salary: " + salaries.get("Jane"));
        } else {
            System.out.println("Jane's salary not found.");
        }

    }

    public void findHighest_Lowest() {
        int[] arr = { 10, 5, 10, 15, 10, 5 };
        int n = arr.length;

        int maxFreq = Integer.MAX_VALUE;
        int minFreq = Integer.MIN_VALUE;

        int maxElement = -1;
        int minElement = -1;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int element = entry.getKey();
            int freq = entry.getValue();

            if (freq > maxFreq) {
                maxFreq = freq;
                maxElement = element;
            }

            if (freq < minFreq) {
                minFreq = freq;
                minElement = element;
            }

        }

        // Print results
        System.out.println("The highest frequency element is: " + maxElement);
        System.out.println("The lowest frequency element is: " + minElement);

    }
}
