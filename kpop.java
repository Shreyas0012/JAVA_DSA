import java.util.HashMap;

public class kpop{
    public static void main(String[] args) {
        int[]arr={1,2,1,3,4,5};
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num, 0)+1);}
            for(int num:arr){
                if(map.get(num)==1){
                    System.out.println(num);
                    
                }
            }
        
    }
}