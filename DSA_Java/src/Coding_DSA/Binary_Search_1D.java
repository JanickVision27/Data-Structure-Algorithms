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

    public static int lowerBound(int[] nums, int x) {
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

    public static int upperBound(int[] nums, int x) {
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
        // celing code
        int left = 0;
        int right = nums.length - 1;
        int celing = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= tar) {
                celing = nums[mid];
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        int left_floor = 0;
        int right_floor = nums.length - 1;
        int floor = -1;

        while (left_floor <= right_floor) {
            int mid = left_floor + (right_floor - left_floor) / 2;

            if (nums[mid] <= tar) {
                floor = nums[mid];
                left_floor = mid + 1;
            } else if (nums[mid] > tar) {
                right_floor = mid - 1;
            }
        }

        System.out.println("Celing is :" + celing);
        System.out.println("Floor is: " + floor);
    }

    public static int[] searchRange(int[] nums, int target) {

        if (nums.length == 0)
            return new int[] { -1, -1 };

        int left = 0;
        int right = nums.length - 1;
        int start = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] >= target) {
                start = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (start == nums.length || nums[start] != target) {
            return new int[] { -1, -1 };
        }

        int left_end = 0;
        int right_end = nums.length - 1;
        int upperBound = nums.length;

        while (left_end <= right_end) {
            int mid = left_end + (right_end - left_end) / 2;

            if (nums[mid] > target) {
                upperBound = mid;
                right_end = mid - 1;
            } else {
                left_end = mid + 1;
            }
        }

        int last = upperBound - 1;

        return new int[] { start, last };
    }

    public static int TotalOccurance(int[] arr, int k) {
        int left = 0;
        int right = arr.length - 1;
        int start = arr.length;

        if(arr.length == 0){
            return 0;
        }

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] >= k) {
                start = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if(start == arr.length || arr[start] != k){
            return 0;
        }

        left = 0;
        right = arr.length - 1;
        int end = arr.length;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > k) {
                end = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        int totalOcc = end - start;

        return totalOcc;
    }

    public static void main(String[] args) {
        findFloor(new int[] { 3, 4, 4, 7, 8, 10 }, 5);
    }

}
