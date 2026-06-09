import java.util.*;
public class Basic_recursion {

    public void reverseArray(int [] arr){
        int l = 0;
        int r = arr.length - 1;

        while (l < r){
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

        while (l < r){
            char leftchar = s.charAt(l);
            char rightchar = s.charAt(r);

            if(!Character.isLetterOrDigit(leftchar)){
                l++;
            }
            else if(!Character.isLetterOrDigit(rightchar)){
                r--;
            }
            else{
                if(Character.toLowerCase(leftchar) != Character.toLowerCase(rightchar)){
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
}
