public class lastoccur_hash {
    static void last(int[]arr,int k){
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==k){
                ans=mid;
                low=mid+1;
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
        last(arr,k);
    }
}
