package DoubleLinkedListImplementation;

public class DoubleLinkedList<E> {
    Node<E> head;
    Node<E> tail;

    // appending to the list (adding in front/end)
    public void addToList(E data) {
        Node<E> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            if (tail != null) {
                // newNode.prev = tail;
                // tail = newNode;
                tail.next = newNode;
                tail = tail.next;
            }
        }
    }

    public void addToBeginning(E data) {
        Node<E> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void traverseForward() {
        Node<E> current = head;

        if (head == null) {
            System.out.println("List is empty");
        } else {
            System.out.println("List = ");
            System.out.print(current.data + ",");
            while (current.next != null) {
                current = current.next;
                if (current.next == null) {
                    System.out.print(current.data);
                } else {
                    System.out.print(current.data + ",");
                }

            }
            System.out.println();
        }
    }
}
