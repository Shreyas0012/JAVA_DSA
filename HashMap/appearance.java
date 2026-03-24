// simple two for loop method one puts the values in the hashmap and another print the ones with frequecy one
import java.util.HashMap;

public class appearance{
    static void find(int[]arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:arr){
            if(map.get(num)==1)
            System.out.println(num);
        }
    }
    public static void main(String[] args) {

        int []arr={1,2,1,2,3,4};
        find(arr);
    }
}
