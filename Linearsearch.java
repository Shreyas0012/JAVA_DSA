public class Linearsearch {
    static int search(int[]arr,int k){
       for(int i=0;i<arr.length;i++){
        if(arr[i]==k){
            return i;
        }
       }
       return -1;
    }
    public static void main(String[] args) {
       int k=5;
       int[]arr={1,4,2,6,32,5};
       System.out.println(search(arr,k));

    }
}