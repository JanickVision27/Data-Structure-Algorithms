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

    static int upperBound(int[] nums, int x) {
        int left = 0;
        int right = nums.length - 1;
        int len = nums.length;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > x) {
                len = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return len;
    }

    static int searchInsert(int[] nums, int tar) {
        int left = 0;
        int right = nums.length - 1;

        int pos = nums.length;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] >= tar) {
                pos = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(pos);
        return pos;
    }

    static void findFloor(int[] nums, int tar) {

        // Floor
        int left = 0;
        int right = nums.length - 1;
        int flor = 0;
        int celing = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] <= tar) {
                flor = nums[mid];
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        left = 0;
        right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] >= tar) {
                celing = nums[mid];
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        System.out.println("Floor : " + flor);
        System.out.println("Celing: " + celing);

    }

    public static void main(String[] args) {
        findFloor(new int[] { 3, 4, 4, 7, 8, 10 }, 5);
    }

}
