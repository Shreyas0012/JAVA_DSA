public class mindifference{
    static void mindif(int[]arr){
       int currmin=arr[0];
       int max_diff=0;
       for(int i=1;i<arr.length;i++){
        if(arr[i]<currmin){
            currmin=arr[i];
        }
        else{
            int diff=arr[i]-currmin;
            max_diff=Math.max(max_diff,diff);
        }
        }
        System.out.println(max_diff);
    }
    public static void main(String[] args) {
        int[]arr={5,3,1,2,7};
        mindif(arr);

    }
}