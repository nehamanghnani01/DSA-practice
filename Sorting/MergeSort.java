package Sorting;

public class MergeSort {

    public int[] sort(int[] arrayList, int l, int r) {

        if (l < r) {
            int m = l + (r - l) / 2;
            sort(arrayList, l, m);
            sort(arrayList, m + 1, r);
            // merge(arrayList, l, m, r);
            mergeAnotherWay(l, m, m, arrayList);
        }

        return arrayList;
    }

    int[] merge(int[] arrayList, int l, int m, int r) {

        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i) {
            L[i] = arrayList[l + i];
        }

        for (int j = 0; j < n2; ++j) {
            R[j] = arrayList[m + 1 + j];
        }

        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arrayList[k] = L[i];
                i++;

            } else {
                arrayList[k] = R[j];
                j++;

            }
            k++;
        }

        while (i < n1) {
            arrayList[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arrayList[k] = R[j];
            j++;
            k++;
        }

        return arrayList;

    }

    public static int[] mergeAnotherWay(int low, int mid, int high, int[] arr) {
        int n1 = mid - low + 1;
        int n2 = high - mid;

        int[] mergedArr = new int[n1 + n2];
        int i = low, j = mid + 1, k = 0;
        while (i <= mid && j <= high) {
            if (arr[i] < arr[j]) {
                mergedArr[k] = arr[i];
                i++;
            } else {
                mergedArr[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            mergedArr[k] = arr[i];
            i++;
            k++;
        }
        while (j <= high) {
            mergedArr[k] = arr[j];
            j++;
            k++;
        }
        k = 0;
        for (int p = low; p <= high; p++) {
            arr[p] = mergedArr[k];
            k++;
        }
        return arr;
    }
}