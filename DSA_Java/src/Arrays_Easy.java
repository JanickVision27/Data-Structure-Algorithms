import java.util.*;

public class Arrays_Easy {

    /*
     * Basically use the first element as a Largest element
     */
    public void LargestElement() {
        int[] arr = { 8, 10, 5, 7, 9 };
        int MaxVal = arr[0];

        if (arr.length == 0) {
            System.out.println(-1);
        }

        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > MaxVal) {
                MaxVal = arr[i];
            }
        }

        System.out.println("Maximum Value : " + MaxVal);

    }

    public void get_second_min_max() {
        int[] arr = { 1, 2, 4, 7, 7, 5 };

        int maxVal = arr[0];
        int minVal = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            } else if (arr[i] < minVal) {
                minVal = arr[i];
            }
        }

        // USe max for determining min and use min for determining Max values
        int secondMax = Integer.MIN_VALUE;
        int secondMin = Integer.MAX_VALUE;

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondMax && arr[i] != maxVal) {
                secondMax = arr[i];
            }

            if (arr[i] < secondMin && arr[i] != minVal) {
                secondMin = arr[i];
            }
        }

        System.out.println("Second Highest: " + secondMax);
        System.out.println("Second Smallest : " + secondMin);

    }

    public void CheckArraySorted() {
        int[] arr = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        boolean checkSorted = true;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                checkSorted = false;
                break;
            } else {

                checkSorted = true;
            }
        }

        if (checkSorted) {
            System.out.println("It is True");
        } else {
            System.out.println("It is False");
        }
    }

    public void RemoveDuplicatesInPlace() {
        int[] arr = { 1, 1, 2, 2, 2, 3, 3 };
        int i = 0;

        // You just swap the values when they are not equal
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];

            }
        }

        System.out.println();

        System.out.println("How many Unique Elements  " + (i + 1));

    }

    public void LeftRotateByOne() {
        int[] arr = { 1, 2, 3, 4, 5 };

        int temp = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = temp;

        System.out.println(Arrays.toString(arr));

    }

    public void RotateArrayByK() {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

        int k = 3;
        int n = arr.length;

        if (k > n) {
            k = k % n;
        }

        reverseArray(arr, 0, arr.length - 1);
        reverseArray(arr, 0, k - 1);
        reverseArray(arr, k, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public void moveZeroes() {
        int[] arr = { 1, 2, 0, 3, 0 };

        int n = arr.length;
        int i = 0;

        for (int j = 0; j < n; j++) {
            if (arr[j] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;

            }

        }

        System.out.println(Arrays.toString(arr));

    }

    public void linearSearch() {
        int[] arr = { 1, 2, 3, 4, 5 };
        int num = 5;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                System.out.println(i + 1);
            }

        }

    }

    // will be do that later.
    public void UnionArrays() {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 2, 3, 4, 4, 5 };

        ArrayList<Integer> union = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            } else if (arr2[j] < arr1[i]) {
                if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]) {
                    union.add(arr2[j]);
                }
                j++;
            } else {
                if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
                j++;
            }

        }

        while (i < arr1.length) {
            if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                union.add(arr1[i]);
            }
            i++;
        }

        while (j < arr2.length) {
            if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]) {
                union.add(arr2[j]);
            }
            j++;
        }

    }

    public int MaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        int max_counter = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                counter++;

                if (counter > max_counter) {
                    max_counter = counter;
                }

            } else {
                counter = 0;
            }
        }

        return max_counter;
    }

    public void SingleNumber(int[] nums) {
        Map<Integer, Integer> countArr = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            countArr.put(nums[i], countArr.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : countArr.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("The value is : " + entry.getKey());
            }
        }

    }

    public void LongestSubArray() {
        int[] nums = { 10, 5, 2, 7, 1, 9 };
        int k = 15;
        int total_sum = 0;
        int max_length = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            total_sum += nums[right];

            while (total_sum > k && left <= right) {
                total_sum = total_sum - nums[left];
                left = left + 1;
            }

            if (total_sum == k) {
                int current_window_len = right - left + 1;
                if (current_window_len > max_length) {
                    max_length = current_window_len;
                }
            }
        }

        System.out.println(max_length);
    }

    public void maxLen() {
        int[] arr = { 9, -3, 3, -1, 6, -5 };
        int runningTotal = 0;
        int max_len = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int right = 0; right < arr.length; right++) {
            runningTotal += arr[right];

            if (runningTotal == 0) {
                max_len = right + 1;
            }

            if (map.containsKey(runningTotal)) {
                int oldIndex = map.get(runningTotal);

                int current_len = right - oldIndex;

                if (current_len > max_len) {
                    max_len = current_len;
                }
            } else {
                map.put(runningTotal, right);
            }

        }

        System.out.println("Longest Subarray Length: " + max_len);

    }

}
