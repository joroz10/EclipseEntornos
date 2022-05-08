package ed22_ud12_junit02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	Calculator calc;
	@BeforeEach
	void setUp() throws Exception {
		calc = new Calculator();
	}

	@Test
	void testAdd() {
		int expected = 5;
		int actual = calc.add(3, 2);
		assertEquals(expected, actual);
	}

}
