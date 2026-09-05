package Coding_DSA;

import java.util.*;

public class SlidingWindow {

    public static void main(String[] args) {

    }

    public void slidingWindowExample() {
        int[] arr = { 5, 2, 1, 0, 3 };
        int k = 3;

        int left = 0;
        int right = 0;
        int windowSum = 0;
        int maxSum = 0;

        for (right = 0; right < arr.length; right++) {
            // ! this is a value that adds up the element
            windowSum += arr[right];

            // ! this is where it tracks the window size of sliding window array
            int windowSize = right - left + 1;

            // ! to check if the window size is growing more than k.
            if (windowSize > k) {
                windowSum -= arr[left];
                left++;
            }

            // ! If our window is exactly size k, check for a new high score!
            if (windowSize == k) {
                maxSum = Math.max(windowSum, maxSum);
            }
        }

        System.out.println("Max Value is: " + maxSum);
    }

    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLength = 0;
        HashSet<Character> check = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            while (check.contains(s.charAt(right))) {
                check.remove(s.charAt(left));
                left++;
            }

            check.add(s.charAt(right));

            int windowSize = right - left + 1;

            maxLength = Math.max(windowSize, maxLength);
        }

        return maxLength;
    }

    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int maxLength = 0;
        int zeroCount = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeroCount++;
            }

            while (zeroCount > k) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);

        }

        return maxLength;
    }

    public int totalFruit(int[] fruits) {
        int left = 0;
        int maxLength = 0;
        HashMap<Integer, Integer> basket = new HashMap<>();

        for (int right = 0; right < fruits.length; right++) {
            if (basket.containsKey(fruits[right])) {

                basket.put(fruits[right], basket.getOrDefault(fruits[right], 0) + 1);
            }

            while (basket.size() > 2) {
                int leftCount = basket.get(fruits[left]) - 1;

                if (leftCount == 0) {
                    basket.remove(fruits[left], leftCount);
                } else {
                    basket.put(fruits[left], leftCount);
                }
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);

        }
        return maxLength;
    }

}
