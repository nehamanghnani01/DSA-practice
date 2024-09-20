package Sorting;

public class SelectionSort {

    public int[] sort(int[] arrList) {

        for (int i = 0; i < arrList.length; i++) {
            int minimum = -1;
            int index = i;
            for (int j = i; j < arrList.length; j++) {
                if (minimum > arrList[j]) {
                    minimum = arrList[j];
                    index = j;
                }
            }
            if (minimum != -1) {
                int temp = arrList[i];
                arrList[i] = minimum;
                arrList[index] = temp;
            }
        }

        return arrList;
    }
}
