package ejercicio10;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 10. Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras
 * (con su correspondiente traducción). Utiliza un objeto de la clase HashMap
 * para almacenar las parejas de palabras. El programa pedirá una palabra en
 * español y dará la correspondiente traducción en inglés.
 * 
 * @author Juan Manuel Gonzalez Profumo
 *
 */
public class Ejercicio10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> diccionario = new HashMap<String, String>();
		
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
		
		System.out.println("Palabra en español: ");
		String palabra = sc.nextLine();
		
		if (diccionario.containsKey(palabra)) {
			System.out.println("Palabra en ingles: " + diccionario.get(palabra));
		}
		
		else {
			System.out.println("Esa palabra no se encuentra en el diccionario");
		}
	}

}
