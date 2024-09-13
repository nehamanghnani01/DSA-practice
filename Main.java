import LinkedListImplementation.*;

class Main {
    public static void main(String[] args) {

        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.addNode(1);
        list.addNode(25);
        list.addNode(42);

        list.printLinkedList();
    }
}
