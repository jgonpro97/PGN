package vehiculo;

/**
 * Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases
 * de la primera. Para la clase Vehiculo, crea los atributos de clase
 * vehiculosCreadosy kilometrosTotales, así como el atributo de instancia
 * kilometrosRecorridos. Crea también algún método específico para cada una de
 * las subclases. Prueba las clases creadas mediante un programa con un menú
 * como el que se muestra a continuación:
 * 
 * @author Juan Manuel Gonzalez Profumo
 * @version 1.0
 */
public class Vehiculo {
	public static int vehiculosCreados;
	public static int kilometrosTotales = 0;
	
	private int kilometrosRecorridos;

	public Vehiculo() {
		this.kilometrosRecorridos = 0;
		vehiculosCreados++;
	}

	public static int getKilometrosTotales() {
		return kilometrosTotales;
	}

	public static void setKilometrosTotales(int kilometrosTotales) {
		Vehiculo.kilometrosTotales = kilometrosTotales;
	}

	public int getKilometrosRecorridos() {
		return kilometrosRecorridos;
	}

	public void setKilometrosRecorridos(int kilometrosRecorridos) {
		this.kilometrosRecorridos = kilometrosRecorridos;
	}
	
	void andar(int km) {
		this.kilometrosRecorridos += km;
		Vehiculo.kilometrosTotales += this.kilometrosRecorridos;
	}
	
	
}
