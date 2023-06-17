package part1.tests.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import part1.utils.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class main {
    private ArrayList<Integer> arrayList;

    @BeforeEach
    void setUp() {
        arrayList = new ArrayList<>();
    }

    @Test
    void testAddAndGet() {
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        assertEquals(1, arrayList.get(0));
        assertEquals(2, arrayList.get(1));
        assertEquals(3, arrayList.get(2));
    }

    @Test
    void testSize() {
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        assertEquals(3, arrayList.size());
    }
}
