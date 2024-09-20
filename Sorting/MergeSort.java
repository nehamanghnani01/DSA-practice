package Sorting;

public class MergeSort {

    public int[] sort(int[] arrayList, int l, int r) {

        if (l < r) {
            int m = l + (r - l) / 2;
            sort(arrayList, l, m);
            sort(arrayList, m + 1, r);
            merge(arrayList, l, m, r);
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
}