package Project_based;

import java.util.*;

public class task1 {
    private Scanner sc;

    private int[] dailylog;

    public task1() {
        sc = new Scanner(System.in);
        System.err.println("This is default");
    }

    public void inputData() {
        System.out.println("1. Enter your Study Hours per week: ");
        System.out.println("2. View your Longest study hour: ");
        System.out.println("3. View your Second Longest study hour: ");
        System.out.println("4. Check your Consistency Improvement");
        System.out.println("5. Removing the Repeated Study Hours");
        System.out.println("6. Shift Hours by One");
        System.out.println("7. Shift Hours by K Days");
        System.out.println("8. Push Missed Days to End");
        System.out.println("0. Exit the program: ");
        int chose = sc.nextInt();

        switch (chose) {
            case 1:
                System.out.println();
                initailzeLog();
                break;
            case 2:
                System.out.println();
                getLargest();
                break;
            case 3:
                System.out.println();
                getSecondLargest();
                break;
            case 4:
                System.out.println();
                isConsisentTrend();
                break;
            case 5:
                System.out.println();
                removeDuplicateEntries();
                break;
            case 6:
                System.out.println();
                shiftLogByOneDay();
                break;
            case 7:
                System.out.println();
                shiftLogbyKDays();
                break;
            case 8:
                System.out.println();
                pushMissedDaysToEnd();
                break;
            case 0:
                System.out.println("Exiting... the program");
                return;
            default:
                System.out.println("Invalid Value");
        }

    }

    public void initailzeLog() {
        System.out.println("Please Provide Number of days to Log: ");
        int n = this.sc.nextInt();

        dailylog = new int[n];

        for (int i = 0; i < dailylog.length; i++) {
            System.out.println("Enter the Value of a day " + (i + 1) + ": ");
            dailylog[i] = sc.nextInt();
        }

        inputData();

    }

    public void getLargest() {

        if (this.dailylog == null) {
            System.out.println("The values are empty, please fill the value");
            return;
        }

        int maxVal = this.dailylog[0];
        for (int i = 0; i < this.dailylog.length; i++) {
            if (this.dailylog[i] > maxVal) {
                maxVal = dailylog[i];
            }
        }
        System.out.println("The Longest Study Hour: " + maxVal);

    }

    public void getSecondLargest() {
        if (this.dailylog == null) {
            System.out.println("The values are empty, please fill the value");
            return;
        }

        int maxVal = this.dailylog[0];
        for (int i = 0; i < this.dailylog.length; i++) {
            if (this.dailylog[i] > maxVal) {
                maxVal = dailylog[i];
            }
        }

        int secondMax = 0;
        for (int i = 0; i < this.dailylog.length; i++) {
            if (dailylog[i] > secondMax && dailylog[i] != maxVal) {
                secondMax = dailylog[i];
            }
        }

        System.out.println("Second Longest Study Hour: " + secondMax);
    }

    public void isConsisentTrend() {
        if (this.dailylog == null) {
            System.out.println("The values are empty, please fill the value");
            return;
        }
        boolean check = false;
        for (int i = 0; i < this.dailylog.length - 1; i++) {
            if (dailylog[i] > dailylog[i + 1]) {
                check = false;
            } else {
                check = true;
            }
        }

        if (check) {
            System.out.println("The Values are consistent");

        } else {
            System.out.println("The Values are not consistent");
        }
    }

    public void removeDuplicateEntries() {
        if (this.dailylog == null) {
            System.out.println("The values are empty, please fill the value");
            return;
        }

        System.out.println("Before Removing Repeated Values");
        System.out.println(Arrays.toString(this.dailylog));

        LinkedHashSet<Integer> removeDup = new LinkedHashSet<>();

        for (int i = 0; i < this.dailylog.length; i++) {
            removeDup.add(dailylog[i]);
        }

        System.out.println("Values After Removing Duplicates");
        System.out.println(removeDup);

    }

    public void shiftLogByOneDay() {
        if (this.dailylog == null || this.dailylog.length == 0) {
            System.out.println("The values are empty, please fill the value");
            return;
        }

        System.out.println("Before Shifting Hours");
        System.out.println(Arrays.toString(this.dailylog));
        int i = 0;
        int firstVal = this.dailylog[0];
        for (int j = 1; j < this.dailylog.length; j++) {
            dailylog[i] = dailylog[j];
            i++;
        }
        dailylog[this.dailylog.length - 1] = firstVal;

        System.out.println("After shifting hours");
        System.out.println(Arrays.toString(this.dailylog));

    }

    public void shiftLogbyKDays(){
        if (this.dailylog == null || this.dailylog.length == 0) {
            System.out.println("The values are empty, please fill the value");
            return;
        }

        System.out.println("Please Provide How many days you want to shift the log: ");
        int k = this.sc.nextInt();
        int n = this.dailylog.length;

        if(k > n){
            k %= n;
        }

        System.out.println("Before Shifting Hours");
        System.out.println(Arrays.toString(this.dailylog));

        reverseArray(this.dailylog, 0, n - 1);
        reverseArray(this.dailylog, 0, k - 1);
        reverseArray(this.dailylog, k, n - 1);

        System.out.println("After shifting hours by " + k + " days");
        System.out.println(Arrays.toString(this.dailylog));
        
        
        
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

    public void pushMissedDaysToEnd(){
        if (this.dailylog == null || this.dailylog.length == 0) {
            System.out.println("The values are empty, please fill the value");
            return;
        }
        int [] newArr = new int[this.dailylog.length];
        int i = 0;
        for(int j = 0; j < this.dailylog.length; j++){
            if(this.dailylog[j] != 0){
                newArr[i] = this.dailylog[j];
                i++;
            }
        }

        System.out.println("After pushing the missed days to end");
        System.out.println(Arrays.toString(newArr));
    }








}
