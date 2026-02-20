public class numberofrotation_binary {
    static int numberofrotation(int[]arr){
        int low=0;
        int high=arr.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            // left sorted
            if(arr[mid]>arr[high]){
                low=mid+1;
            }
            else if(arr[mid]<arr[high]){
                high=mid;
            }
            else{
                high--;
            }
            }
        
        return low;
    }
    public static void main(String[] args) {
        int[]arr={10,10,10,1,10};
        int ans=numberofrotation(arr);
        System.out.println("Number of rotations: " + ans);
    }
}
