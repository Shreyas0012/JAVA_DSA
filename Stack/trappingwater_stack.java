public class trappingwater_stack {
    static int search(int[]arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int target=7;
        int[]arr={1,4,5,7,82};
        System.out.println(search(arr,target));
    }
}
