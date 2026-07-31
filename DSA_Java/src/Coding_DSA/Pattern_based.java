package Coding_DSA;

import java.util.Scanner;

public class Pattern_based {

    Scanner sc = new Scanner(System.in);

    public void pattern1() {
        for (int i = 0; i < 5; i++) {
            System.out.println("*****");

        }

    }

    public void Pattern2() {
        int n = 6;
        System.out.println();

        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();

        }

    }

    public void Pattern3() {
        System.out.println("Please Provide a Number");
        int n = sc.nextInt();

        System.out.println();
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

    public void pattern4() {
        System.out.println("Please Provide a Number");
        int n = sc.nextInt();

        System.out.println();

        for (int i = 1; i < n; i++) {
            // this inner loops until j <= i to print the same number
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public void pattern5() {
        System.out.println();
        for (int i = 7; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public void pattern6() {
        System.out.println();
        for (int i = 7; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

    public void pattern7() {
        System.out.println("Please Provide a Number");
        int n = sc.nextInt();

        System.out.println();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public void pattern8() {
        System.out.println("Please Provide a Number");
        int n = sc.nextInt();

        System.out.println();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern9() {
        System.out.println("Please Provide a Number");
        int n = sc.nextInt();

        System.out.println();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public void pattern10() {
        System.out.println("Please Provide a Number");
        int n = sc.nextInt();

        System.out.println();

        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public void pattern11() {
        System.out.println("Please Provide a Number");
        int n = sc.nextInt();

        System.out.println();

        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }

            }
            System.out.println();
        }

    }

    public void pattern12() {
        System.out.println("Please Provide a Number");
        int n = sc.nextInt();

        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }

    }

}
