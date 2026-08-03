package Coding_DSA;

public class Binary_Search_1D {

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                System.out.println(mid);
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        System.out.println(-1);
        return -1;
    }

    static int lowerBound(int[] nums, int x) {
        int left = 0;
        int right = nums.length - 1;
        int len = nums.length;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= x) {
                len = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        System.out.println(len);
        return len;
    }

    public static void main(String[] args) {
        // search(new int[]{-1, 0, 3, 5, 9, 12}, 2);
        lowerBound(new int[] { 3, 5, 8, 15, 19 }, 9);
    }

}
