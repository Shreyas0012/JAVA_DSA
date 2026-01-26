package Array;
public class RotateArray {
    static void rotate(int[] arr, int k) {
       int n=arr.length;
       swap(arr,0,n-1);
       swap(arr,0,k-1);
       swap(arr,k,n-1);
       for(int i:arr){
        System.out.print(i+" ");
       }
    }
    static void swap(int []arr,int x,int y){
        while(x<y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
        x++;
        y--;
    }   }
    

   public static void main(String[] args) {
    int []arr={1,2,3,4,5};
   int k=2;
   rotate(arr, k);
   } 
}
