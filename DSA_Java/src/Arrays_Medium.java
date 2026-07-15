import java.util.*;

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

}
