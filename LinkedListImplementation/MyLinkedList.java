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

    public void insertAtPosition(E data, int positionIndex) {
        Node<E> newNode = new Node<>(data);

        if (head == null) {
            System.out.println("List empty, inserting at beginning");
            head = newNode;
            head.next = null;
        } else {
            Node<E> node = head;
            for (int i = 0; i < positionIndex - 1; i++) {
                node = node.next;

            }

            Node<E> secondNode = node.next;
            node.next = newNode;
            newNode.next = secondNode;
        }
    }

    public void insertAtBeginning(E data) {
        Node<E> newNode = new Node<>(data);

        if (head == null) {
            System.out.println("List empty, inserting at beginning");
            head = newNode;
            head.next = null;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void deleteAtPosition(int positionIndex) {

        if (head == null) {
            System.out.println("List empty, cannot delete");

        } else {
            Node<E> node = head;

            for (int i = 0; i < positionIndex - 1; i++) {
                node = node.next;
            }
            Node<E> deleteNode = node.next;
            Node<E> secondNode = deleteNode.next;
            node.next = secondNode;
            deleteNode.next = null;
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

    // recursive method to reverse list
    public Node<E> reverseList(Node<E> head) {
        if (head == null) {
            head = this.head;
        }

        if (head == null || head.next == null) {
            return head;
        }
        Node<E> newHead = reverseList(head.next);
        Node<E> front = head.next;
        front.next = head;
        head.next = null;

        return newHead;
    }

}
