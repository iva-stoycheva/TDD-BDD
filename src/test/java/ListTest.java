import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ListTest {
    List emptyList;
    List oneElementList;
    List threeElementList;
    List moreThatMaxSizeElements;

    @BeforeEach
    public void setup(){
        emptyList = new List();

        oneElementList = new List();
        oneElementList.add(2);

        threeElementList = new List();
        threeElementList.add(2);
        threeElementList.add(47);
        threeElementList.add(29);

        moreThatMaxSizeElements = new List();
        moreThatMaxSizeElements.add(1);
        moreThatMaxSizeElements.add(2);
        moreThatMaxSizeElements.add(3);
        moreThatMaxSizeElements.add(4);
        moreThatMaxSizeElements.add(5);
    }

    @Test
    public void whenMyListSizeIsZero() {
        assertEquals(0, emptyList.size());
    }

    @Test
    public void whenTryToAddAnElement() {
        assertEquals(1, oneElementList.size());
    }

    @Test
    public void whenTryToRemoveAnElement() {
        threeElementList.remove(47);
        assertEquals(2, threeElementList.size());
    }

    @Test
    public void whenMyListSizeIsOutOfBound() {
        assertThrows(IndexOutOfBoundsException.class, () -> moreThatMaxSizeElements.add(6));
    }
}
