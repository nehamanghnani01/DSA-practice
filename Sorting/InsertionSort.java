
package Sorting;

/**
 * InsertionSort
 */
public class InsertionSort {

    public int[] sort(int[] arrList) {

        for (int i = 1; i < arrList.length; i++) {
            int element = arrList[i];
            int j = i - 1;

            for (; j >= 0; j--) {

                if (arrList[j] > element) {
                    arrList[j + 1] = arrList[j];

                } else {

                    break;
                }
            }

            arrList[j + 1] = element;
            // if (insertPos != -1) {
            // for (int k = i; k > insertPos + 1; k--) {
            // arrList[k] = arrList[k - 1];
            // }
            // arrList[insertPos] = element;
            // }

        }

        return arrList;
    }

}
