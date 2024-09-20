package Sorting;

public class BubbleSort {

    public int[] sort(int[] arrList) {
        int unsortedSize = arrList.length;
        for (int i = 0; i < unsortedSize; i++) {
            for (int j = 0; j < unsortedSize - 1; j++) {
                if (arrList[j] > arrList[j + 1]) {
                    int temp = arrList[j];
                    arrList[j] = arrList[j + 1];
                    arrList[j + 1] = temp;
                }
            }
            unsortedSize--;
        }
        return arrList;
    }
}
