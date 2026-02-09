                 
public class watertapping{
static int bars(int[] arr) {
    int l = 0;
    int r = arr.length - 1;
    int leftmax = 0, rightmax = 0;
    int water = 0;
  while(l<r){
     leftmax=Math.max(leftmax,arr[l]);
     rightmax=Math.max(rightmax,arr[r]);
     if(leftmax>rightmax){
        water+=rightmax-arr[r];
        r--;
     }else{
        water+=leftmax-arr[l];
        l++;
     }
     }

  
    return water;
    }
public static void main(String[] args) {
    int [] arr={6,0,1,4};
    System.out.println(bars(arr));
}
}
