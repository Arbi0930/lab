package part2.test.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import part2.utils.SinglyLinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class main {
    private SinglyLinkedList<Integer> list;

    @BeforeEach
    void setUp() {
        list = new SinglyLinkedList<>();
    }

    @Test
    void testAddAndGet() {
        list.add(1);
        list.add(2);
        list.add(3);

        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(3, list.get(2));
    }

    @Test
    void testSize() {
        list.add(1);
        list.add(2);
        list.add(3);

        assertEquals(3, list.size());
    }
}
