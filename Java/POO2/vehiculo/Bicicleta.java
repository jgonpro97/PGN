package vehiculo;

/**
 * Clase Bicicleta hereda de Vehiculo y su atributo y metodo propio
 * @author Juan Manuel Gonzalez Profumo
 * @version 1.0
 */
public class Bicicleta extends Vehiculo {
	private int velocidades;

	public Bicicleta(int velocidades) {
		super();
		this.velocidades = velocidades;
	}

	public int getVelocidades() {
		return velocidades;
	}

	public void setVelocidades(int velocidades) {
		this.velocidades = velocidades;
	}
	
	void hacerCaballido() {
		System.out.println("\nEstoy haciendo el caballito\n");
	}
}
