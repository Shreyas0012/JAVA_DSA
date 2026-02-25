import java.util.Arrays;
public class pairoflength {
    static void length(int[]arr){
        int count=0;
        Arrays.sort(arr);
        int i=0;
        while(i<arr.length-1){
            if(arr[i+1]-arr[i]<=2){
                count++;
                i+=2;
            }
            else{i++;}
        }
        System.out.println(count);

        
    }
    public static void main(String[] args) {
        int[]arr={3,2,5,1,7,5,8};
        length(arr);
    } 
}
