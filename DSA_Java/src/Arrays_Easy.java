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

        int i = 0;
        int temp = arr[0];

        for (int j = 1; j < arr.length; j++) {
            arr[i] = arr[j];
            i++;

        }

        arr[arr.length - 1] = temp;

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    

}
