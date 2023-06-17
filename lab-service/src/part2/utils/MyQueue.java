package part2.utils;

import java.util.NoSuchElementException;

public class MyQueue<E> {
    private Node<E> first;
    private Node<E> last;
    private int size;

    public void add(E item) {
        append(item);
        size++;
    }

    private void append(E item) {
        Node<E> newNode = new Node<>(item);
        if (isEmpty()) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
    }

    private E detach() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        E item = first.data;
        first = first.next;
        if (first == null) {
            last = null;
        }
        return item;
    }

    public E remove() {
        E item = detach();
        size--;
        return item;
    }

    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return first.data;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("front  [");
        Node<E> current = first;
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append("]  back");
        return sb.toString();
    }

    private static class Node<E> {
        private E data;
        private Node<E> next;

        public Node(E data) {
            this.data = data;
            this.next = null;
        }
    }
}
