package ejercicio11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

import ejercicio12.Carta;

/**
 * 11. Realiza un programa que escoja al azar 5 palabras en español del
 * minidiccionario del ejercicio anterior. El programa irá pidiendo que el
 * usuario teclee la traducción al inglés de cada una de las palabras y
 * comprobará si son correctas. Al final, el programa deberá mostrar cuántas
 * respuestas son válidas y cuántas erróneas.
 * 
 * @author Juan Manuel Gonzalez Profumo
 * @version 1.0
 */
public class Ejercicio11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> diccionario = new HashMap<String, String>();
		ArrayList<String> palabrasEspagnol = new ArrayList<String>();
		ArrayList<String> palabrasAleatorias = new ArrayList<String>();
		
		int aciertos = 0;
		int fallos = 0;
		int indice = 0;
		int num = 0;
		
		diccionario.put("rojo", "red");
		diccionario.put("azul", "blue");
		diccionario.put("verde", "green");
		diccionario.put("negro", "black");
		diccionario.put("blanco", "white");
		diccionario.put("barco", "boat");
		diccionario.put("coche", "car");
		diccionario.put("autobus", "bus");
		diccionario.put("bicicleta", "bike");
		diccionario.put("moto", "motorcycle");
		diccionario.put("perro", "dog");
		diccionario.put("gato", "cat");
		diccionario.put("caballo", "horse");
		diccionario.put("mono", "monkey");
		diccionario.put("pajaro", "bird");
		diccionario.put("cama", "bed");
		diccionario.put("ventana", "windows");
		diccionario.put("silla", "chair");
		diccionario.put("mesa", "desk");
		diccionario.put("ordenador", "computer");
		
		palabrasEspagnol.addAll(diccionario.keySet());

		for (int i = 0; i < 5; i++) {
			do {
				num = (int)(Math.random() * 20);
			} while (palabrasAleatorias.contains(num));
			
			palabrasAleatorias.add(palabrasEspagnol.get(num));
		}
		
		for (String palabra : palabrasAleatorias) {
			System.out.println("Introduzca la traduccion al ingles de " + palabra + ": ");
			String pIntroducida = sc.nextLine();
			
			if (pIntroducida.contains(diccionario.get(palabrasAleatorias.get(indice)))) {
				System.out.println("\nPalabra acertada!!\n");
				aciertos++;
			}
			
			else {
				System.out.println("\nPalabra erronea!!\n");
				fallos++;
			}
			
			indice++;
			
		}
		
		System.out.println("\nPalabras correctas: " + aciertos);
		System.out.println("Palabras erroneas: " + fallos);
		
	}

}
