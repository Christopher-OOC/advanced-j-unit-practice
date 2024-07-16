package hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test Math operations in Calculator class")
class CalculatorTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@DisplayName("Test Four divided by Two")
	@Test
	void testIntegerDivision_whenFourIsDividedByTwo_ShouldReturnTwo() {
		Calculator calculator = new Calculator();
		
		int result = calculator.integerDivision(4, 2);
		
		assertEquals(2, result, 2 + " + " + result + " are not equal");
	}
	
	@DisplayName("Test Division by Zero")
	@Test
	void testIntegerDivision_whenDividendIsZero_ShouldThrowArithmeticException() {
		Calculator calculator = new Calculator();
		
		int result = calculator.integerDivision(4, 2);
		
		assertEquals(2, result, 2 + " + " + result + " are not equal");
	}
	
	@DisplayName("Test 33 - 1 = 32")
	@Test
	void integerSubtraction() {
		Calculator calculator = new Calculator();
		
		int minuend = 33;
		int subtrahend = 1;
		int expectedResult = 32;
		
		int result = calculator.integerSubtraction(minuend, subtrahend);
		
		assertEquals(expectedResult, result, () -> minuend + " - " + subtrahend + " did not produce " + expectedResult);
	}

}
