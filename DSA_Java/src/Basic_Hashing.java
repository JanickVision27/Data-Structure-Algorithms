import java.util.*;

public class Basic_Hashing {

    public void countFreq() {
        int[] arr = { 10, 5, 10, 15, 10, 5 };
        int n = arr.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(arr[i],
                    map.getOrDefault(arr[i], 0) + 1);

        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
