import java.util.*;
import java.util.stream.LongStream;

public class Arrays_Medium {

    public void twoSumExist() {
        int[] arr = { 2, 6, 5, 8, 11 };
        int target = 14;
        HashMap<Integer, Integer> countMap = new HashMap<>();
        int complement = 0;

        for (int i = 0; i < arr.length; i++) {
            complement = target - arr[i];

            if (countMap.containsKey(complement)) {
                System.out.println(countMap.get(complement) + " " + i);

            } else {
                countMap.put(arr[i], i);
            }

        }

    }

    // Dutch National Flag Algorithm

    public void SortAnArray() {

        int[] num = { 1, 0, 2, 1, 0 };
        int low = 0;
        int high = num.length - 1;
        int mid = 0;
        while (mid <= high) {

            if (num[mid] == 0) {
                int temp = num[low];
                num[low] = num[mid];
                num[mid] = temp;

                low++;
                mid++;

            } else if (num[mid] == 1) {
                mid++;

            } else if (num[mid] == 2) {
                int temp = num[high];
                num[high] = num[mid];
                num[mid] = temp;

                high--;
            }
        }
    }

    // Moore Voting algorithm
    public void MajorityElement() {
        int[] nums = { 7, 0, 0, 1, 7, 7, 2, 7, 7 };

        int count = 0;
        int candiate = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                candiate = nums[i];
                count = 1;
            } else if (candiate == nums[i]) {
                count++;
            } else {
                count--;
            }

        }

        System.out.println(candiate);
    }

    // Kadane Algorithm
    public void maxSubArray() {
        int[] nums = { 2, 3, 5, -2, 7, -4 };
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (currentSum <= 0) {
                currentSum = 0;
            }

            currentSum += nums[i];
            maxSum = Math.max(maxSum, currentSum);

        }

    }

    public void StockBuySell() {

        int[] prices = { 7, 6, 4, 3, 1 };
        int minPrice = Integer.MAX_VALUE;
        int maxPrice = 0;

        for (int i = 0; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);

            int potentialProfit = prices[i] - minPrice;

            maxPrice = Math.max(maxPrice, potentialProfit);

        }

        System.out.println(maxPrice);

    }

    public void rearrangeArray() {
        int[] arr = { 1, 2, -4, -5 };

        int posIndex = 0;
        int negIndex = 1;

        int[] newArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                newArr[posIndex] = arr[i];
                posIndex += 2;

            } else if (arr[i] < 0) {
                newArr[negIndex] = arr[i];
                negIndex += 2;
            }
        }

        System.out.println(Arrays.toString(newArr));

    }

    public void nextPermutation() {
        int[] nums = { 1, 2, 3 };
        int n = nums.length;
        int breakIndex = -1;

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                breakIndex = i;
                break;
            }
        }

        if (breakIndex == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        for (int i = n - 1; i > breakIndex; i--) {
            if (nums[i] > nums[breakIndex]) {
                swap(nums, i, breakIndex);
                break;
            }
        }

        reverse(nums, breakIndex + 1, n - 1);

    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public void LeadersInArray() {
        int[] arr = { 1, 2, 5, 3, 1, 2 };

        ArrayList<Integer> ans = new ArrayList<>();
        int maxFromRight = arr[arr.length - 1];
        ans.add(maxFromRight);

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                ans.add(maxFromRight);
            }
        }

        Collections.reverse(ans);

        System.out.println(ans);

    }

    // The reason I use Hashset because, It has ability to like
    // Extract the values in O(1) Look up instead of using array to go through every
    // single step.
    public void longestConsecutive() {
        int[] arr = { 100, 4, 200, 1, 3, 2 };

        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int longStreak = 0;

        for (int num : set) {
            if (set.contains(num - 1) == false) {
                int currentNum = num;
                int currentStreak = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longStreak = Math.max(longStreak, currentStreak);
            }
        }

        System.out.println(longStreak);

    }

    public void MatrixZero() {
        int[][] matrix = {
                { 1, 1, 1 },
                { 1, 0, 1 },
                { 1, 1, 1 }
        };

        int numRows = matrix.length;
        int numCols = matrix[0].length;

        Set<Integer> zeroRows = new HashSet<>();
        Set<Integer> zeroCols = new HashSet<>();

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows.add(i);
                    zeroCols.add(j);
                }
            }
        }

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if(zeroRows.contains(i) || zeroCols.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        }

        System.out.println(Arrays.deepToString(matrix));

    }
}
