package ejercicio6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Realiza un programa que diga cuántas ocurrencias de una palabra hay en un
 * fichero. Tanto el nombre del fichero como la palabra se deben pasar como
 * argumentos en la línea de comandos.
 * 
 * @author Juan Manuel Gonzalez Profumo
 * @version 1.0
 */
public class Ejercicio6 {
	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(args[0] + ".txt"));
			ArrayList<String> palabras = new ArrayList<String>();
			String palabra = "" + args[1];
			int repetida = 0;
			
			String linea = "";
			
			while (linea != null) {
				palabras.add(linea);
				linea = br.readLine();
			}
						
			for (String s : palabras) {
				if (s.equals(palabra)) {
					repetida++;
				}
			}
			
			br.close();
			
			System.out.println("La palabra " + palabra + " se repite en el fichero " + repetida + " veces");
			
		} catch (FileNotFoundException e) {
			System.err.println("No se encuentra el fichero");
		} catch (IOException e) {
			System.err.println("No se puede leer el fichero");
		}
		
	}

}
