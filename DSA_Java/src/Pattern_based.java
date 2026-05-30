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

        for(int i =0; i< n; i++){
            
            for (int j = 0; j<= i; j++){
                System.out.print("*");
            }
            
            System.out.println();

        }

    }


}
