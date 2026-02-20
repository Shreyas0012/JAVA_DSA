import java.util.HashMap;

public class duplicate_hashmap {
    public static void main(String[] args) {

        int[] arr = {1,2,3,2,4,4};
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : arr){
            if(!map.containsKey(num)){
                System.out.println("Duplicate found: " + num);
                
                return;
            
            }
            map.put(num,1);
            
        }

        System.out.println("No duplicate");
    }
}
