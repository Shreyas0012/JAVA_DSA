
import java.util.HashMap;

public class targetsumhashmap {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[]arr={1,2,3,4,5};
        int target=9;
        for(int num:arr){
            int complement=target-num;
            if(map.containsKey(complement)){
              System.out.println("found at " + num+" "+complement);
              return;
        }
        map.put(arr[num],num);
    }
        System.out.println("not found");
    
}
}
