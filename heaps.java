public class heaps {

    public static void main(String[] args) {

        Heap maxHeap = new Heap();
        maxHeap.insert(1);
        maxHeap.insert(2);
        System.out.println("printing heap status now - ");
        maxHeap.print();

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

        // int parentIndex = (index) / 2;

        // if parentIndex is less than inserted child, then swap with parent
        while (index >= 2) {
            System.out.println("inside while -- at index = " + index);
            int parentIndex = (index) / 2;
            System.out.println("parent index = " + parentIndex);

            if (parentIndex >= 1 && arr[parentIndex] < arr[index]) {
                int temp = arr[parentIndex];
                arr[parentIndex] = arr[index];
                arr[index] = temp;
            }
            index = parentIndex;
        }
        if (index < 2) {
            System.out.println("skipped");
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
