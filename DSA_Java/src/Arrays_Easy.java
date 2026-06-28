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

    public void MoveZerosToEnd() {
        int[] arr = { 0, 1, 0, 3, 12 };
        // int insertPos = 0;

        // for (int i = 0; i < arr.length; i++){
        //     if (arr[i] != 0){
        //         arr[insertPos] = arr[i];
        //         insertPos++;
        //     }
        // }
        // while (insertPos < arr.length) {
        //     arr[insertPos] = 0;
        //     insertPos++;
        // }
        // System.out.println(Arrays.toString(arr));

        int left = 0;
        for (int right = 0; right < arr.length; right++){
            if (arr[right] != 0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
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

}
