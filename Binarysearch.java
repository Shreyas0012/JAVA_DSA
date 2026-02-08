import java.util.Scanner;
public class Binarysearch {
    static int search(int[]arr,int k){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;

        if(arr[mid]==k){
            return mid;
        }
        else if(arr[mid]>k){
            high=mid-1;
        }
        else{
            low=mid+1;
        }
        }
        return -1;     
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7};
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        System.out.println(search(arr,k));
    }
}
