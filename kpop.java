import java.util.Arrays;
public class kpop{
    static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
  static void dup(int[]arr){
    int i=0;
    for(int j=1;j<arr.length;j++){
       if(arr[i]!=arr[j]){
        i++;
        swap(arr,i,j);
       }
    
        
    }
   
}


    
  
    public static void main(String[] args) {
        int[]arr={1,2,2,1,3,3,4};
        dup(arr);
        System.out.println(Arrays.toString(arr));
    }

}

