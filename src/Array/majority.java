package Array;
//  only works when the number of majority element is more than n/2
 
 public class majority {

    static int majorit(int[] arr) {
        int count = 0;
        int candidate = 0;

     for(int num:arr){
        if(count==0){
            candidate=num;
        }
        if(num==candidate){
            count++;
        }
        else{
            count--;
        }
     }
     return candidate;
     }

    public static void main(String[] args) {
        int[] arr = {2,1, 2, 1, 2, 3, 3, 2,2};
        System.out.println(majorit(arr));
    }
}
 
