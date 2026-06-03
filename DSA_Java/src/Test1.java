
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
    
    public void Switch_statment()
    {
        int day = 2;
        
        switch(day){
            case 1: System.out.println("Mon"); break;
            case 2: System.out.println("Tue"); break;
            default: System.out.println("Invalid");
        }
    }
    
    public void arrays_string(){
        int [] nums = {10,20,30,40,50};
        
        int len = nums.length;
        
        for(int i = 0;  i < len; i++){
            System.out.println(nums[i]);
        }
        
    }
    
    public void string_val(){
        String s = "JavaDSA";
        
        if (s.equals("JavaDSA")){
            System.out.println("Print Good");
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int i =0; i< 5; i++){
            sb.append(i);
        }
        
        sb.setCharAt(0, 'z');
        
        String finalresult = sb.toString();
        System.out.println(finalresult);
        
    }
    
//    public void whileLoop(){
//        while(left <= right){
//            left ++;
//        }
//    }
    
    
    
}
