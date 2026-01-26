package Array;
public class leader{
    static void leaders(int[]arr){
        int max=arr[arr.length-1];
        System.out.println(max);
        for(int p=arr.length-2;p>=0;p--){
            if(arr[p]>max){
                max=arr[p];
                System.out.println(max);
            }
        }
  
    }
    public static void main(String[] args) {
        int []arr={12,33,43,66,2,12,43};
        leaders(arr);
    }
}