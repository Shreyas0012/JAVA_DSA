import java.util.Arrays;
public class differencetwonumberis{
    static boolean height(int []arr,int k,int t){
        Arrays.sort(arr);
        int count=0;
      for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]-arr[i]<=k && Math.abs(i-j)<=t){
                
                if(count>=k){
                    return true;
                }
            }
        }
      }
         return false;
    }
    public static void main(String[] args) {
        int []arr={1,2,3,1};
        int k=0;
        int t=3;
       System.out.println(height(arr,k,t));
    }
}
