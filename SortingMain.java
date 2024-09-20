
import Sorting.*;

class SortingMain {
    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6 };
        System.out.println("Unsorted array");
        for (int i : arr) {
            System.out.print(i + ",");
        }
        System.out.println();
        InsertionSort insertionSort = new InsertionSort();
        int[] sortedArr = insertionSort.sort(arr);

        System.out.println("Insertion Sort result");
        for (int i : sortedArr) {
            System.out.print(i + ",");
        }
        System.out.println();
        SelectionSort selectionSort = new SelectionSort();
        int[] selectionSortArr = selectionSort.sort(arr);

        System.out.println("Selection Sort result");
        for (int i : selectionSortArr) {
            System.out.print(i + ",");
        }
        System.out.println();
        BubbleSort bubbleSort = new BubbleSort();
        int[] bubbleSortArr = bubbleSort.sort(arr);

        System.out.println("Bubble Sort result");
        for (int i : bubbleSortArr) {
            System.out.print(i + ",");
        }
    }

}