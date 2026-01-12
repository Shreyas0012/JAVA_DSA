// finds the missing number in a sorted array sequencially
public class missingnumber {

    static int missingNumber(int[] arr, int n) {
         int sum=n*(n+1)/2;
         System.out.println(sum);
         int sum1=0;
        for(int i=0;i<arr.length;i++){
           sum1+=arr[i];
        }
        System.out.println(sum1);

        return sum-sum1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int n = 5;
        System.out.println(missingNumber(arr, n));
    }
}
