package part2.week06;

import part2.utils.SinglyLinkedList;

public class SLLPrintTest {
    public static void main(String[] args) {
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        printLinkedList(list);
    }

    private static <E> void printLinkedList(SinglyLinkedList<E> list) {
        for (int i = 0; i < list.size(); i++) {
            E element = list.get(i);
            System.out.println(element);
        }
    }
}
