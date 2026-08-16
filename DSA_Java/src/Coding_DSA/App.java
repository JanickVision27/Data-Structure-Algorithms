package Coding_DSA;

public class App {
    public static void main(String[] args) throws Exception {
        // Pattern_based pat = new Pattern_based();
        // pat.pattern6();

        for(int i = 1; i < 5; i++){
            for(int j = 5; j>= i; j--){
                System.out.print(j);
            }
            System.out.println();
        }

        for(int i = 1; i<= 5; i++){

            for(int k = i; k < 5; k++){
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}
