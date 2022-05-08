package ed22_ud12_junit04;
/**
 * 
 * @author javie
 *
 */
public class Robot {

	private String name;
	private double autonomy;
	
	/**
	 * 
	 * @param name
	 * Introduce un nombre para el robot
	 */
	public Robot(String name) {
		this.name = name;
		this.autonomy = 42;
	}

	public double getAutonomy() {
		return autonomy;
	}

	public void setAutonomy(double autonomy) {
		if (this.autonomy <= 0) {
			this.autonomy = 42;
		} else {
			this.autonomy = autonomy;
		}
		this.autonomy = autonomy;
	}
	
	
}
