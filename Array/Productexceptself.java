public class Productexceptself {
    static int[] productExceptSelf(int[]arr){
        int n=arr.length;
        int[]result=new int[n];
        result[0]=1;
        // resultl={}
        // arr={1,2,3,4}
        for(int i=1;i<n;i++){
          result[i]=result[i-1]*arr[i-1];

        }
        // arr={1,2,3,4}-
        // result={1,1,2,6}
        int suffix=1;
        for(int i =n-1;i>=0;i--){
            
            result[i]=result[i]*suffix;
            suffix=suffix*arr[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4};
        int[]result=productExceptSelf(arr);
        for(int i:result){
            System.out.print(i+" ");
        }
    }
}


// suffix=1,suffix=4,