package HCL_Coding;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Before Swapping example:");
        SwapTwoNum();
        System.out.println("Hello World");
    }

    public static void SwapTwoNum() {
        int a = 5;
        int b = 10;
        System.out.println("Before Swapping: a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping: a = " + a + ", b = " + b);
    }
}
