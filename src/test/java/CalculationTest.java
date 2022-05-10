import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculationTest {
    Calculation tokens;

    @BeforeEach
    public void setup() {
        tokens = new Calculation();

        tokens.addOperand(5);
        tokens.addOperand(3);
    }

    @Test
    public void whenAddElementsCheckMyListSize() {
        assertEquals(2, tokens.size());
    }

    @Test
    public void calculateTest() {
        assertEquals(8, tokens.calculate('+'));
    }
}
