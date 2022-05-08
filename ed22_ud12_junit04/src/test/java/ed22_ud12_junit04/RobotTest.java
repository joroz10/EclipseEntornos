package ed22_ud12_junit04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class RobotTest {
	Robot r1;
	Robot r2;
	Robot r3;
	Robot r4;
	
	@BeforeEach
	void setUp() throws Exception {
		this.r1 = null;
		this.r2 = new Robot("R2D2");
		this.r3 = r2;
		this.r4 = new Robot("Arale");
	}

	@RepeatedTest(3)
	void testIfNull() {
		assertNull(r1);
	}
	
	@Test
	void tettIfNotNull() {
		assertNotNull(r1);
	}
	
	@Test
	void testSameObject() {
		assertSame(r2, r3);
	}
	
	@Test
	void testNotSameObject() {
		assertNotSame(r1, r2);
	}
	
	@Test
	void testIfIsTrue() {
		r4.setAutonomy(42);
		boolean cumplecondicion = false;
		if(r4.getAutonomy() == 42) {
			cumplecondicion = true;
		} else {
			cumplecondicion = false;
		}
		assertTrue(cumplecondicion);
	}
	
	@Test
	void testFalse() {
		double testValue = -66.0;
		r4.setAutonomy(testValue);
		assertFalse(r4.getAutonomy() == testValue);
	}

}
