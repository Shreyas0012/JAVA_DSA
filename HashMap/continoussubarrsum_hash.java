import java.util.HashMap;
public class continoussubarrsum_hash {

    static boolean check(int[] arr, int k){

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;

        for(int i = 0; i < arr.length; i++){

            sum += arr[i];

            if(sum == k){
                return true;
            }

            if(map.containsKey(sum - k)){
                return true;
            }

            map.put(sum, i);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 9;
        System.out.println(check(arr, k));
    }
}