public class firstoccerance_binary {
    static void first(int[]arr,int k){
        int ans=-1;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==k){
                ans=mid;
                high=mid-1;
            }
            else if(arr[mid]>k){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println(ans);

    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,5,5,6,7};
        int k=5;
        first(arr,k);
    }
}
