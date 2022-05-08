package ed22_ud12_junit03;

public class EuroConversor {

	private static final double EUROS_PESETAS_CHANGE = 166.368;
	public double euros2pesetas(double euros) {
		return euros*EUROS_PESETAS_CHANGE;
	}
	public double pesetas2Euros(double pesetas) {
		return pesetas / EUROS_PESETAS_CHANGE;
	}
}
