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
            case 5:
                System.out.println();
                removeDuplicateEntries();
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
            System.out.println("The Values are not consisten");
        }
    }

    public void removeDuplicateEntries(){
        if (this.dailylog == null) {
            System.out.println("The values are empty, please fill the value");
            return;
        }

        System.out.println("Before Removing Repeated Values");
        System.out.println(Arrays.toString(this.dailylog));

        int i = 0;
        for(int j = 1; j < this.dailylog.length; j++){
            if(this.dailylog[j] != this.dailylog[i]){
                i++;
                this.dailylog[i] = this.dailylog[j];
            }
        }

        System.out.println("Values After Removing the Values");
        System.out.println(Arrays.toString(this.dailylog));

    }

}
