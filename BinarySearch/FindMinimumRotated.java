
public class FindMinimumRotated {

    static int findMin(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > arr[high]) {
                low = mid + 1;
            }
            else if (arr[mid] < arr[high]) {
                high = mid;
            }
            else {
                high--;   
            }
        }

        return arr[low];
    }

    public static void main(String[] args) {

        int[] arr1 = {4,5,6,0,1,2,3};
        int[] arr2 = {2,2,2,0,1,2};
        int[] arr3 = {1,3,5};

        System.out.println("Minimum: " + findMin(arr1));
        System.out.println("Minimum: " + findMin(arr2));
        System.out.println("Minimum: " + findMin(arr3));
    }
}
