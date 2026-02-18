public class rotate_binary {
    static void rotate(int[]arr,int k){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;

             if (arr[mid]==k){
                System.out.println(mid);}

            if(arr[mid]>=arr[low]){
           
                if(arr[mid]>k && arr[low]<=k){
                    high=mid-1;
                }

                else{
                    low=mid+1;
                }
            }
            else if(arr[mid]<arr[high]){
                if(arr[mid]>k && arr[high]>=k){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }

        }

        
    }
    public static void main(String[] args) {
        int []arr={4,5,6,7,0,1,2};
        int k=0;       
        rotate(arr, k);
    }
}
