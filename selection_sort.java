public class selection_sort{

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void selectionSort(int[] arr) { 
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            swap(arr,i,min);
        }
    }
           

    public static void main(String[] args) {
        int[] arr = {1, 21, 34, 2, 60, 7};
        selectionSort(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
