package LinkedListImplementation;

public class MyLinkedList<E> {
    Node<E> head = null;

    public void addNode(E data) {

        Node<E> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
        } else {
            Node<E> node = head;

            while (node.next != null) {
                node = node.next;
            }

            node.next = newNode;
            newNode.next = null;
        }
    }

    public void printLinkedList() {
        if (head == null) {
            System.out.print("Empty list, nothing to print!");

        }

        else {
            Node<E> node = head;
            System.out.println("LinkedList = ");
            System.out.print(node.data + ",");
            while (node.next != null) {
                node = node.next;
                System.out.print(node.data + ",");

            }
        }
    }

}
