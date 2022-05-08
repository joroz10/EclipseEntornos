package ed22_ud12_junit01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GreetingTest {
	
	Greeting hello;
	@BeforeEach
	void setUp() throws Exception {
		hello = new Greeting()	;
	}

	@Test
	void testSayHello() {
		String expected = "Hola clase!!";
		String actual = this.hello.sayHello();
		assertEquals(expected, actual);
	}

}
