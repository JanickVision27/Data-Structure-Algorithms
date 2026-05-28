
package com.mycompany.mavenproject1;

import java.util.Scanner;
public class Test1 {
        
    Scanner sc = new Scanner(System.in);
    public void Input_Output()
    {
             
        System.out.println("Enter an integer:");
        int n = sc.nextInt();
        
        System.out.println("Enter a double:");
        double d = sc.nextDouble();
        
        System.out.println("Enter a word:");
        String s = sc.next();
        
        // --- THE FIX ---
        sc.nextLine(); // Consumes the leftover "Enter" from sc.next()
        // ----------------
        
        System.out.println("Enter a full line:");
        String line = sc.nextLine();
        
        System.out.println("Results:");
        System.out.println("Int: " + n + ", Double: " + d + ", Word: " + s + ", Line: " + line);


    }
    
    public void if_Function()
    {
        System.out.println("Please Provide a Score");
        int score = sc.nextInt();
        
        if (score >= 90){
            System.out.println("A");
            
        } else if (score >= 80){
            System.out.println("B");
        } else {
            System.out.println("C");
        }
        
    }
    
}
