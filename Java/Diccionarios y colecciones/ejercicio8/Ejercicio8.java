package ejercicio8;

import java.util.ArrayList;

/**
 * 8. Realiza un programa que escoja al azar 10 cartas de la baraja española (10
 * objetos de la clase Carta). Emplea un objeto de la clase ArrayList para
 * almacenarlas y asegúrate de que no se repite ninguna.
 * 
 * @author Juan Manuel Gonzalez Profumo
 * @version 1.0
 *
 */
public class Ejercicio8 {
	public static void main(String[] args) {
		ArrayList<Carta> baraja = new ArrayList<Carta>();
		Carta carta = new Carta();
		
		for (int i = 0; i < 10; i++) {
			
			do {
				carta = new Carta();
			} while (baraja.contains(carta));
			
			baraja.add(carta);

		}
		
		for (Carta c : baraja) {
			System.out.println(c);
		}
		
	}

}
