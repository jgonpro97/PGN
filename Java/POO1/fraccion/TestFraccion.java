package fraccion;

/**
 * @author Juan Manuel Gonzalez Profumo
 * @version 1.0
 */
public class TestFraccion {
	public static void main(String[] args) {
		Fraccion fraccion = new Fraccion(4, 6);
		Fraccion fraccion2 = new Fraccion(2, 5);

		System.out.println(fraccion);
		System.out.println("Fraccion modificada: " + fraccion.modificar(2, 9));
		
		System.out.println("El resultado de la fraccion es: " + fraccion.calcularResultado());
		System.out.println(fraccion + " * 7: " + fraccion.multiplicarPorNumero(7));
		System.out.println(fraccion + " * " + fraccion2 + ": " + fraccion.multiplicarFracciones(fraccion2));
		System.out.println(fraccion + " + " + fraccion2 + ": " + fraccion.sumarFracciones(fraccion2));
		System.out.println(fraccion + " - " + fraccion2 + ": " + fraccion.restarFracciones(fraccion2));
		System.out.println(fraccion.simplificarFraccion());
	}

}
