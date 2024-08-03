package hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;

public class DemoRepeatedTest {
	
	Calculator calculator;

	@BeforeEach
    void beforeEach() {
		calculator = new Calculator();
	}
	
	@DisplayName("Test Division by Zero")
	@RepeatedTest(3)
	void testIntegerDivision_whenDividendIsZero_ShouldThrowArithmeticException(RepetitionInfo repetitionInfo) {
		
		int dividend = 4;
		int divisor = 0;
		String expectedExceptionMessage = "/ by zero";
		
		ArithmeticException assertThrows = assertThrows(ArithmeticException.class, () -> {
			calculator.integerDivision(dividend, divisor);
		}, "Division by zero should throw Arithmetic Exception.");
	
	
		assertEquals(expectedExceptionMessage, assertThrows.getMessage(), () -> "Unexpected exception message");
	}
}
