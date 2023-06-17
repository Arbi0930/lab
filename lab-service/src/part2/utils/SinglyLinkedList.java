package part2.utils;

public class SinglyLinkedList<E> {
    private Node<E> first;
    private int size;

    public SinglyLinkedList() {
        first = null;
        size = 0;
    }

    public void add(E element) {
        Node<E> newNode = new Node<>(element);
        if (first == null) {
            first = newNode;
        } else {
            Node<E> current = first;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<E> current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public int size() {
        return size;
    }

    private static class Node<E> {
        private E data;
        private Node<E> next;

        public Node(E data) {
            this.data = data;
            this.next = null;
        }

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }
    }
}
