import java.util.*;
public class Arrays_Medium {

    public void twoSumExist() {
        int[] arr = { 2, 6, 5, 8, 11 };
        int target = 14;
        HashMap<Integer, Integer> countMap = new HashMap<>();
        int complement = 0;

        for(int i = 0; i < arr.length; i++){
            complement = target - arr[i];

            if(countMap.containsKey(complement)){
                System.out.println(countMap.get(complement) + " " +  i);

            }
            else{
                countMap.put(arr[i], i);
            }

        }

    }

}
