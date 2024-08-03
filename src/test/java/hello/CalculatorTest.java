package hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.stream.Stream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Test Math operations in Calculator classs")
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
	
	@ParameterizedTest
	@ValueSource(strings= {"John", "Kate", "Alice"})
	void valueSourceDemostration(String firstName) {
		System.out.println(firstName);
		
		assertNotNull(firstName);
	}
	
	@DisplayName("Test Integer Subtraction [minuend, subtrahend, expectedResult]")
	//@Test
	@ParameterizedTest
//	@MethodSource("integerSubtractionInputParameters")
	@CsvSource({
		"33, 1, 32",
		"54, 1, 53",
		"24, 1, 23"
		})
	void integerSubtraction(int minuend, int subtrahend, int expectedResult) {
		
		int result = calculator.integerSubtraction(minuend, subtrahend);
		
		assertEquals(expectedResult, result, () -> minuend + " - " + subtrahend + " did not produce " + expectedResult);
	}
	
//	private static Stream<Arguments> integerSubtractionInputParameters() {
//		
//		return Stream.of(
//				Arguments.of(33, 1, 32),
//				Arguments.of(54, 1, 53),
//				Arguments.of(24, 1, 23)
//				);
//	}
}
