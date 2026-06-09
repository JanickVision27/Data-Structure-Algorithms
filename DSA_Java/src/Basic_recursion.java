public class Basic_recursion {
    
    public boolean isPalindrome(String s) {
        // Convert Uppercase string to Lowercase String
        s = s.toLowerCase();

        // Remove all non-alphanumeric characters
        String word = s.replaceAll("[^A-zA-Z0-9]", "");


        int L = 0;
        int R = word.length() - 1;

        while (L < R){
            if (word.charAt(L) != word.charAt(R)){
                System.out.println("FALSE");
                return false;
            }
            else{
                L++;
                R--;
            }

        }
        System.out.println("TRUE");
        return true;
        
    }
}
