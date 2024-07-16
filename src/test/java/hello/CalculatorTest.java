package hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test Math operations in Calculator class")
class CalculatorTest {
	
	Calculator calculator;
	
	@BeforeAll
	static void setup() {
		System.out.println("Executing @BeforeAll method");
	}
	
	@AfterAll
	static void cleanup() {
		System.out.println("Executing @AfterAll method");
	}
	
	@BeforeEach
    void beforeEach() {
		calculator = new Calculator();
		System.out.println("Executing @BeforeEach method");
	}
	
	@AfterEach
    void beforeAll() {
		System.out.println("Executing @AfterEach method");
	}

	@DisplayName("Test Four divided by Two")
	@Test
	void testIntegerDivision_whenFourIsDividedByTwo_ShouldReturnTwo() {
		int result = calculator.integerDivision(4, 2);
		
		assertEquals(2, result, 2 + " + " + result + " are not equal");
	}
	
	@DisplayName("Test Division by Zero")
	@Test
	void testIntegerDivision_whenDividendIsZero_ShouldThrowArithmeticException() {
		
		int dividend = 4;
		int divisor = 0;
		
		assertThrows(ArithmeticException.class, () -> {
			calculator.integerDivision(dividend, divisor);
		}, "Division by zero should throw Arithmetic Exception.");
	}
	
	@DisplayName("Test 33 - 1 = 32")
	@Test
	void integerSubtraction() {
		
		int minuend = 33;
		int subtrahend = 1;
		int expectedResult = 32;
		
		int result = calculator.integerSubtraction(minuend, subtrahend);
		
		assertEquals(expectedResult, result, () -> minuend + " - " + subtrahend + " did not produce " + expectedResult);
	}

}
