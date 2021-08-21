import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calc = null;
    @BeforeEach
    void assignedObject(){
        calc = new Calculator();
    }

    @Test
    void toCalculateSumOfTwoDoubleInputs(){
        assertEquals(8.0,calc.sum(4.0,4.0));
    }

    @Test
    void toCalculateDifferenceBetweenTwoDoubleInputs(){
        assertEquals(2.0,calc.difference(4.0,2.0));
    }

    @Test
    void toCalculateProductOfTwoDoubleInputs(){
        assertEquals(8.0,calc.product(4.0,2.0));
    }

    @Test
    void toCalculateQuotientWhenDividingTwoDoubleInputs(){
        assertEquals(2.0,calc.division(4.0,2.0));
    }
}
