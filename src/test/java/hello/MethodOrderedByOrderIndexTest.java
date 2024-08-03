package hello;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MethodOrderedByOrderIndexTest {
	
	@Order(1)
	@Test
	void testC() {
		System.out.println("RRunning test C");
	}
	
	@Order(2)
	@Test
	void testA() {
		System.out.println("RRunning test A");
	}
	
	@Order(3)
	@Test
	void testD() {
		System.out.println("RRunning test D");
	}
	
	@Order(4)
	@Test
	void testB() {
		System.out.println("RRunning test B");
	}


}
