public class kadanealgo{
    public static int same(int[]arr){
       int current=0;
       int max=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++){
        current=current+arr[i];
       if(current>max){
        max=current;
       }
       if(current<0){
        current=0;
       }
        
       }
       return max;

    }
            
        
    
    public static void main(String[] args) {
        int[]arr={-2,1,-3,4,-1,2,1};
        System.out.println(same(arr));
    }
}