public class watertapping{
static int bars(int[] arr) {
    int left = 0;
    int right = arr.length - 1;
    int leftMax = 0, rightMax = 0;
    int water = 0;
  while(left<right){
    if(arr[left]<arr[right]){
        if(arr[left]>leftMax){
           leftMax=arr[left];
        }
        else{
            water+=leftMax-arr[left];
        }
        left++;
    }
    else{
        if(arr[right]>rightMax){
            rightMax=arr[right];
        }
        else{
            water+=rightMax-arr[right];
        }
        right--;
    }
  }
    return water;
}
public static void main(String[] args) {
    int [] arr={3,0,1,3};
    System.out.println(bars(arr));
}
}
