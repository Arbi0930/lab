package part2.stack.utils;

import java.util.EmptyStackException;

public class myStack<E> {
    private Node<E> first;
    private Node<E> last;
    private int size;

    public void push(E item) {
        Node<E> newNode = new Node<>(item, null);
        if (isEmpty()) {
            first = newNode;
            last = newNode;
        } else {
            newNode.next = first;
            first = newNode;
        }
        size++;
    }

    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        E item = first.data;
        first = first.next;
        size--;
        if (isEmpty()) {
            last = null;
        }
        return item;
    }

    public E peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
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
        sb.append("bottom  [");
        Node<E> current = first;
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append("]  top");
        return sb.toString();
    }

    private static class Node<E> {
        private E data;
        private Node<E> next;

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }
    }
}
