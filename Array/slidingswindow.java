package Array;
// this is named sliding window becuz the pointer acts as one ...
// first it takes sum of first window and on second window it removes 
// the first elemnt and adds the next element(k)

public class slidingswindow {
    static int subArr(int[] arr,int k){
        int maxsum=0;
        int currentsum=0;
        for(int j=0;j<k;j++){
            currentsum+=arr[j];
        }
        // maximum sum so far
        maxsum=currentsum; 
        // for next windows (adds one element(i)and removes 1 element(i-k)
        for(int i=k;i<arr.length;i++){
          currentsum=currentsum+arr[i]-arr[i-k];
          maxsum=Math.max(maxsum,currentsum);
        }
            

        return maxsum;

    }
    public static void main(String[] args) {
        int []arr={1,2,4,6,2,3,6,8,9,9};
        int k=3;
        System.out.println(subArr(arr,k));
    }
}
