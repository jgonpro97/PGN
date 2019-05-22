package ejercicio12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * 12. Escribe un programa que genere una secuencia de 5 cartas de la baraja
 * española y que sume los puntos según el juego de la brisca. El valor de las
 * cartas se debe guardar en una estructura HashMap que debe contener parejas
 * (figura, valor), por ejemplo (“caballo”, 3). La secuencia de cartas debe ser
 * una estructura de la clase ArrayList que contiene objetos de la clase Carta.
 * El valor de las cartas es el siguiente: as → 11, tres → 10, sota → 2, caballo
 * → 3, rey → 4; el resto de cartas no vale nada.
 * 
 * @author Juan Manuel Gonzalez Profumo
 * @version 1.0
 */
public class TestCarta {
	public static void main(String[] args) {
		HashMap<String, Integer> brisca = new HashMap<String, Integer>();
		ArrayList<Carta> baraja = new ArrayList<Carta>();
		Carta carta = new Carta();
		int puntos = 0;
		
		brisca.put("AS", 11);
		brisca.put("DOS", 0);
		brisca.put("TRES", 10);
		brisca.put("CUATRO", 0);
		brisca.put("CINCO", 0);
		brisca.put("SEIS", 0);
		brisca.put("SIETE", 0);
		brisca.put("SOTA", 2);
		brisca.put("CABALLO", 3);
		brisca.put("REY", 4);

		for (int i = 0; i < 5; i++) {
			baraja.add(carta);

			do {
				carta = new Carta();
			} while (baraja.contains(carta));

		}

		Collections.sort(baraja);

		for (Carta c : baraja) {
			System.out.println(c);
			puntos += brisca.get(c.getFigura());
		}
		
		System.out.println("\nTienes " + puntos + " puntos");
		
	}

}
