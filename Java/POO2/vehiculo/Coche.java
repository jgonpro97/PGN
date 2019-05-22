package vehiculo;

/**
 * Clase Coche hereda de Vehiculo y su atributo y metodo propio
 * @author Juan Manuel Gonzalez Profumo
 * @version 1.0
 */
public class Coche extends Vehiculo {
	private int motor;

	public Coche(int motor) {
		super();
		this.motor = motor;
	}

	public int getMotor() {
		return motor;
	}

	public void setMotor(int motor) {
		this.motor = motor;
	}
	
	void quemarRueda() {
		System.out.println("\nEstoy quemando rueda\n");
	}
}
