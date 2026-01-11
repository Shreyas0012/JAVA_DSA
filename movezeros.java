import java.util.Arrays;

public class movezeros {

    static void moveNegatives(int[] arr) {
        int[] temp = arr.clone();   // preserve original
        int index = 0;

        for(int i=0;i<temp.length;i++){
            if(temp[i]>=0){
            arr[index]=temp[i];
            index++;
        }}
        for(int i=0;i<temp.length;i++){
            if(temp[i]<0){
            arr[index]=temp[i];
            index++;
        }}

    }

    public static void main(String[] args) {
        int[] arr = {3, -1, 0, -3, 12, 0};
        moveNegatives(arr);
        System.out.println(Arrays.toString(arr));
    }
}
