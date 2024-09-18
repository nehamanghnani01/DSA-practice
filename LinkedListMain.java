import LinkedListImplementation.*;

class LinkedListMain {
    public static void main(String[] args) {

        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.addNode(1);
        list.addNode(25);
        list.addNode(42);

        list.insertAtBeginning(100);
        list.deleteAtPosition(2);
        list.insertAtPosition(26, 2);

        list.printLinkedList();
    }
}
