// very important question
import java.util.Arrays;
public class longestconsecutivenumber {
    static int longs(int[] arr){
        int count=1;
        int max=0;
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                continue;
            }
            if(arr[i]==arr[i-1]+1){
                count++;
            }
            else{
                count=1;
            }
            max=Math.max(max, count);
        }
        return max;
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,3};
        System.out.println(longs(arr));
    }
}