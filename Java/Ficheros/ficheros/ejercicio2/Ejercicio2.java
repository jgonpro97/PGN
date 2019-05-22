package ejercicio2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 2. Realiza un programa que lea el fichero creado en el ejercicio anterior y que
 * muestre los números por pantalla.
 * 
 * @author Juan Manuel Gonzalez Profumo
 * @version 1.0
 */
public class Ejercicio2 {
	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("primos.dat"));
			
			String linea = "";
			
			while (linea != null) {
				System.out.println(linea);
				linea = br.readLine();
			}
			
			br.close();
			
		} catch (FileNotFoundException e) {
			System.err.println("No se encuentra el fichero");
		} catch (IOException e) {
			System.err.println("No se puede leer el fichero");
		}

	}

}
