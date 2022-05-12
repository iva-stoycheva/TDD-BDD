import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculationTest {
    List integers;
    Calculation tokens;

    @BeforeEach
    public void setup() {
        integers = new List();

        integers.add(5);
        integers.add(3);
    }

    @DisplayName("Addition calculator!")
    @Test
    public void givenTwoIntegersAndAdditionOperator_WhenCallCalculateMethod_ThenSuccess() {
        tokens = new Calculation(integers);
        assertEquals(8, tokens.calculate('+'));
    }

    @DisplayName("Subtraction calculator!")
    @Test
    public void givenTwoIntegersAndSubtractionOperator_WhenCallCalculateMethod_ThenSuccess() {
        tokens = new Calculation(integers);
        assertEquals(2, tokens.calculate('-'));
    }

    @DisplayName("Multiplication calculator!")
    @Test
    public void givenTwoIntegersAndMultiplicationOperator_WhenCallCalculateMethod_ThenSuccess() {
        tokens = new Calculation(integers);
        assertEquals(15, tokens.calculate('*'));
    }

    @DisplayName("Division calculator!")
    @Test
    public void givenTwoIntegersAndDivisionOperator_WhenCallCalculateMethod_ThenSuccess() {
        tokens = new Calculation(integers);
        assertEquals(1.67, tokens.calculate('/'));
    }
}
