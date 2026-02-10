public class quicksort {

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {

            int p = partition(arr, low, high);

            quickSort(arr, low, p - 1);   // left of pivot
            quickSort(arr, p + 1, high);  // right of pivot
        }
    }

    static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];  // choose last element
        int i = low - 1;        // index of smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;   // pivot index
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1};
        quickSort(arr, 0, arr.length - 1);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
