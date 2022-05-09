import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ListTest {

    List emptyList;

    List oneElementList;

    List threeElementListRemoveOne;

    List moreThatMaxSizeElements;

    @BeforeEach
    public void setup(){
        emptyList = new List();

        oneElementList = new List();
        oneElementList.add(2);

        threeElementListRemoveOne = new List();
        threeElementListRemoveOne.add(2);
        threeElementListRemoveOne.add(47);
        threeElementListRemoveOne.add(29);
        threeElementListRemoveOne.remove(47);

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
        assertEquals(2, threeElementListRemoveOne.size());
    }

    @Test
    public void whenMyListSizeIsOutOfBound() {
        assertThrows(IndexOutOfBoundsException.class, () -> moreThatMaxSizeElements.add(6));
    }
}
