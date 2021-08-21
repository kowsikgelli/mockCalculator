import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class CalculatorTest {
    Calculator calc = null;
    CalculatorService calculatorService = mock(CalculatorService.class);
    @BeforeEach
    void assignedObject(){
        calc = new Calculator(calculatorService);
    }

    @Test
    void toCalculateSumOfTwoDoubleInputs(){
        when(calculatorService.sum(4.0,4.0)).thenReturn(8.0);
        assertEquals(8.0,calc.sum(4.0,4.0));
        verify(calculatorService).sum(4.0,4.0);
    }

    @Test
    void toCalculateDifferenceBetweenTwoDoubleInputs(){
        when(calculatorService.difference(4.0,2.0)).thenReturn(2.0);
        assertEquals(2.0,calc.difference(4.0,2.0));
        verify(calculatorService).difference(4.0,2.0);
    }

    @Test
    void toCalculateProductOfTwoDoubleInputs(){
        when(calculatorService.product(4.0,2.0)).thenReturn(8.0);
        assertEquals(8.0,calc.product(4.0,2.0));
        verify(calculatorService).product(4.0,2.0);
    }

    @Test
    void toCalculateQuotientWhenDividingTwoDoubleInputs(){
        when(calculatorService.division(4.0,2.0)).thenReturn(2.0);
        assertEquals(2.0,calc.division(4.0,2.0));
        verify(calculatorService).division(4.0,2.0);
    }
}
