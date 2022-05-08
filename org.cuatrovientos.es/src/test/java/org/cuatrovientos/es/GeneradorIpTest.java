package org.cuatrovientos.es;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class GeneradorIpTest {

	GeneradorIp gen;
	GeneradorIp gen1;
	@BeforeEach
	void setUp() throws Exception {
	}

	@RepeatedTest(1000)
	void testNotSameObject() {
		this.gen = new GeneradorIp();
		this.gen1 = new GeneradorIp();
		assertNotSame(gen, gen1);
	}

}
