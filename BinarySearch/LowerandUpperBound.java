package BinarySearch;

public class LowerandUpperBound {
    public static void main(String[] args) {
        int[] arr_ = { 1, 2, 3, 3, 5, 8, 8, 10, 10, 11 };
        System.out.println("lower index is = " + lowerBound(arr_, 9));
        int[] arr_ub = { 2, 3, 6, 7, 8, 8, 11, 11, 11, 12 };
        System.out.println("upper index is = " + upperBound(arr_ub, 6));
    }

    public static int lowerBound(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;
        int index = arr.length - 1;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (arr[mid] >= k) {
                index = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return index;
    }

    public static int upperBound(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;
        int index = 0;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (arr[mid] > k) {
                index = mid;
                high = mid - 1;
            } else {
                // index = mid;
                low = mid + 1;

            }

        }
        return index;
    }
}
