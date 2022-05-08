package ed22_ud12_junit03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Clase Euro convectora
 * Se encarga de comprobar que convierto correctamente de Euros a pesetas y de pesetas a euros
 * @author javier
 *
 */
class EurosConversorTest {
	EuroConversor target;
	
	@BeforeEach
	void setUp() throws Exception {
		this.target = new EuroConversor();
	}

	@Test
	void testEuros2pesetas() {
		double expected = 998.326d;
		double actual = this.target.euros2pesetas(6);
		assertEquals(expected, actual, 0.01);
	}

	@Test
	void testPesetas2Euros() {
		double expected = 6.01d;
		double actual = this.target.pesetas2Euros(1000);
		assertEquals(expected, actual, 0.01);
	}

}
