import java.util.Arrays;

public class duplicates{

    static void duplicate(int[]arr){
        int i=0;
       for(int j=1;j<arr.length;j++){
        if(arr[i]!=arr[j]){
            i++;
            swap(arr,i,j);
        }
       }
       
            
        }
        static void swap(int[]arr,int x,int y){
            int temp=arr[x];
            arr[x]=arr[y];
            arr[y]=temp;
        }


    
public static void main(String[] args) {
    int[]arr={1,1,2,2,3,3,4,4};
    duplicate(arr);
System.out.println(Arrays.toString(arr));
}
}