import LinkedListImplementation.*;
import DoubleLinkedListImplementation.*;

class LinkedListMain {
    public static void main(String[] args) {

        MyLinkedList<Integer> list = new MyLinkedList<>();
        DoubleLinkedList<Integer> doubleLinkedList = new DoubleLinkedList<>();

        // list.addNode(1);
        // list.addNode(25);
        // list.addNode(42);

        // list.insertAtBeginning(100);
        // list.deleteAtPosition(2);
        // list.insertAtPosition(26, 2);

        // list.printLinkedList();

        doubleLinkedList.addToList(3);
        doubleLinkedList.addToBeginning(2);
        doubleLinkedList.addToList(4);
        doubleLinkedList.addToBeginning(1);

        doubleLinkedList.traverseForward();

    }
}
