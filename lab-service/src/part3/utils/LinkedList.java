package part3.utils;

public class LinkedList<E> {
    private Node<E> first;
    private Node<E> last;
    private int size;

    public LinkedList() {
        first = null;
        last = null;
        size = 0;
    }

    // Node class
    private static class Node<E> {
        private E data;
        private Node<E> next;
        private Node<E> prev;

        public Node(Node<E> prev, E data) {
            this(prev, data, null);
        }

        public Node(Node<E> prev, E data, Node<E> next) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    // Other methods for LinkedList class

    // Add an element to the end of the list
    public void add(E element) {
        Node<E> newNode = new Node<>(last, element);
        if (last != null) {
            last.next = newNode;
        } else {
            first = newNode;
        }
        last = newNode;
        size++;
    }

    // Get the element at the specified index
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        Node<E> currentNode = getNode(index);
        return currentNode.data;
    }

    // Get the size of the list
    public int size() {
        return size;
    }

    // Private helper method to get the node at the specified index
    private Node<E> getNode(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        Node<E> currentNode;
        if (index < size / 2) {
            currentNode = first;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }
        } else {
            currentNode = last;
            for (int i = size - 1; i > index; i--) {
                currentNode = currentNode.prev;
            }
        }

        return currentNode;
    }
}
