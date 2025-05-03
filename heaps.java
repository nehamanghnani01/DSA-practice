public class heaps {

    public static void main(String[] args) {

        Heap maxHeap = new Heap();
        maxHeap.insert(1);
        maxHeap.insert(2);
        maxHeap.insert(3);
        maxHeap.insert(4);
        // maxHeap.remove();
        maxHeap.insert(5);
        System.out.println("printing heap status now - ");
        maxHeap.print();

        int[] arr1 = { -1, 54, 53, 55, 52, 50 };
        int n = 5;
        System.out.println("heapify the array = arr1");
        for (int i = 1; i <= (n / 2); i++) {
            maxHeap.heapify(arr1, n, i);
        }
        System.out.println("Heapified array = ");
        for (int i = 1; i <= n; i++) {
            System.out.print(arr1[i] + ", ");
        }
        System.out.println();

    }

}

class Heap {
    int[] arr;
    int size;

    public Heap() {
        arr = new int[100];
        size = 0;
    }

    public void insert(int value) {

        int index = size + 1;
        arr[index] = value;
        size++;

        // if parentIndex is less than inserted child, then swap with parent
        while (index >= 2) {
            // System.out.println("inside while -- at index = " + index);
            int parentIndex = (index) / 2;
            // System.out.println("parent index = " + parentIndex);

            if (parentIndex >= 1 && arr[parentIndex] < arr[index]) {
                int temp = arr[parentIndex];
                arr[parentIndex] = arr[index];
                arr[index] = temp;
            }
            index = parentIndex;
        }
        // if (index < 2) {
        // System.out.println("skipped");
        // }

    }

    public void remove() {
        System.out.println("size whrn remove called = " + size);
        if (size > 1) {
            arr[1] = arr[size];
            arr[size] = 0;
            size--;

            int index = 1;
            while (index < size) {
                int leftChild = 2 * index;
                int rightChild = 2 * index + 1;

                if (leftChild < size && arr[index] < arr[leftChild]) {
                    int temp = arr[index];
                    arr[index] = arr[leftChild];
                    arr[leftChild] = temp;
                } else if (rightChild < size && arr[index] < arr[rightChild]) {
                    int temp = arr[index];
                    arr[index] = arr[rightChild];
                    arr[rightChild] = temp;
                }
                index = leftChild;
            }

        }
    }

    public void heapify(int[] arr, int n, int i) {

        int largest = i;

        int leftChild = 2 * largest;
        int rightChild = 2 * largest + 1;

        if (leftChild < n && arr[largest] < arr[leftChild]) {
            int temp = arr[largest];
            arr[largest] = arr[leftChild];
            arr[leftChild] = temp;
            heapify(arr, n, leftChild);
        } else if (rightChild < n && arr[largest] < arr[rightChild]) {
            int temp = arr[largest];
            arr[largest] = arr[rightChild];
            arr[rightChild] = temp;
            heapify(arr, n, rightChild);
        }

    }

    public void print() {
        System.out.println();
        for (int i = 1; i <= size; i++) {
            System.out.print("" + arr[i] + ", ");
        }
        System.out.println();
    }
}
