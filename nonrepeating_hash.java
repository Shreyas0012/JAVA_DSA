
import java.util.HashMap;

public class nonrepeating_hash {
    public static void main(String[] args) {
        int[]arr={1,2,3,3,4,4,2,1};
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:arr){
            map.put(num, map.getOrDefault(num, 0) + 1);

        }
        for(int i:arr){
            if(map.get(i)==1){
                System.out.println(i);
                return ;
            }
            
            
        }
        System.out.println(-1);
    }
    
}
