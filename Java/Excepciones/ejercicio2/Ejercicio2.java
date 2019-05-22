package ejercicio2;

/**
 * 2. Modifica la clase Gato vista anteriormente añadiendo el método apareaCon.
 * Este método debe comprobar que los gatos son de distinto sexo, tras lo cual,
 * genera un nuevo gato. Por ejemplo, sería válido algo como Gato cria =
 * garfield.apareaCon(lisa). En caso de que los gatos sean del mismo sexo, el
 * método debe generar la excepción ExcepcionApareamientoImposible. Crea un
 * programa desde el que se pruebe el método.
 * 
 * @author Juan Manuel Gonzalez Profumo
 * @version 1.0
 */
public class Ejercicio2 {
	public static void main(String[] args) {
		Gato gato = new Gato("macho");
		Gato gatito = new Gato("macho");
		
		try {
			gato.apareaCon(gatito);
		} catch (ExcepcionApareamientoImposible e) {
			System.err.println(e.getMessage());
		}

	}

}
