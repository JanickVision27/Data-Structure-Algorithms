import java.util.Scanner;

public class Pattern_based {

    Scanner sc = new Scanner(System.in);

    public void pattern1() {
        for (int i = 0; i < 5; i++) {
            System.out.println("*****");

        }

    }

    public void Pattern2(){
        int n = 6;
        System.out.println();

        for(int i =0; i < n; i++){
            
            for (int j = 0; j<= i; j++){
                System.out.print("*");
            }
            
            System.out.println();

        }

    }

    public void Pattern3() 
    {
        System.out.println("Please Provide a Number");
        int n = sc.nextInt();

        System.out.println();
        for (int i = 1; i < n; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }

    }

    public void pattern4()
    {
        for(int i = 1; i < 6; i++){
            System.out.println(i);
            for (int j = i; j <= i; j++){
                System.out.print(j);
            }
        }
        
    }



}
