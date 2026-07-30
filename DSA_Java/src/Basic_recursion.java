import java.util.*;

public class Basic_recursion {

    public void reverseArray(int[] arr) {
        int l = 0;
        int r = arr.length - 1;

        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            l++;
            r--;
        }

    }

    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            char leftchar = s.charAt(l);
            char rightchar = s.charAt(r);

            if (!Character.isLetterOrDigit(leftchar)) {
                l++;
            } else if (!Character.isLetterOrDigit(rightchar)) {
                r--;
            } else {
                if (Character.toLowerCase(leftchar) != Character.toLowerCase(rightchar)) {
                    System.out.println("False");
                    return false;
                }
                l++;
                r--;
            }

        }
        System.out.println("True");
        return true;

    }

    public void checkSubArr() {
        int[] arr = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        int sum = 9;
        int runningsum = 0;
        int count = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0,1);
        for (int i = 0; i < n; i++) {
            runningsum += arr[i];
            int val = runningsum - sum;

            if (map.containsKey(val)) {
                count += map.get(val);
            }

            map.put(runningsum, map.getOrDefault(runningsum, 0) + 1);

        }

    }
}
