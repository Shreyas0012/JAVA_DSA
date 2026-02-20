public class kpop {
    static int search(int[]arr,int k){
        int low=0;
        int high=arr.length-1;
       while(low<=high){
        int mid=low+(high-low)/2;
         if(arr[mid]==k){
                return mid;
            }
        if(arr[low]<=arr[mid]){
            if(k>=arr[low] && k<arr[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
            else{
                 if(arr[mid]<=k && arr[high]>k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
            }
       }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int result = search(arr, target);
        System.out.println(result);
    }
}
