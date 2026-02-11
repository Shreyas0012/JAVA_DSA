
import java.util.HashMap;

public class targetsumhashmap {
    
      static void twoSum(int[] arr, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();

    for(int i = 0; i < arr.length; i++) {
        int complement = target - arr[i];

        if(map.containsKey(complement)) {
            System.out.println("Found pair"+i+" ");
            System.out.println(map.get(complement)+" ");
            return;
        }

        map.put(arr[i], i);
    }
}
public static void main(String[] args) {
      int[]arr={1,2,3,4,5};
      int target=9;
      twoSum(arr,target);
}
}
