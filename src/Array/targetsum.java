package Array;
public class targetsum {

    static void twoSum(int[] arr, int target) {
             for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]+arr[j]==target){
                        System.out.println(arr[i]+","+arr[j]);
                    }

                }                    

             }

       
            }
        
        
    public static void main(String[] args) {
        int[] arr = {3, 7, 11,6, 15};
        int target = 9;
        twoSum(arr, target);
    }
}
// whenever solving the indices sum avoid duplicates using j=i+1