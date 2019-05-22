package ejercicio9;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 9. Modifica el programa anterior de tal forma que las cartas se muestren
 * ordenadas. Primero se ordenarán por palo: bastos, copas, espadas, oros.
 * Cuando coincida el palo, se ordenará por número: as, 2, 3, 4, 5, 6, 7, sota,
 * caballo, rey.
 * 
 * @author Juan Manuel Gonzalez Profumo
 * @aversion 1.0
 */
public class Ejercicio9 {
	public static void main(String[] args) {
		ArrayList<Carta> baraja = new ArrayList<Carta>();
		Carta carta = new Carta();

		for (int i = 0; i < 10; i++) {
			do {
				carta = new Carta();
			} while (baraja.contains(carta));
			
			baraja.add(carta);

		}

		Collections.sort(baraja);

		for (Carta c : baraja) {
			System.out.println(c);
		}

	}

}
