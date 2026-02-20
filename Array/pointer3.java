import java.util.Arrays;

public class pointer3 {
    static void sort(int[]arr){
        int low=0;
        int mid=0;
        int high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,low,mid);
                mid++;
                low++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(arr,mid,high);
                high--;
            }
        }
     }
     static void swap(int[]arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
     }

    public static void main(String[] args) {
        int[]arr={1,2,0,2,1,0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
