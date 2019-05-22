package ejercicio1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 1. Escribe un programa que guarde en un fichero con nombre primos.dat los
 * números primos que hay entre 1 y 500.
 * 
 * @author Juan Manuel Gonzalez Profumo
 * @version 1.0
 */
public class Ejercicio1 {
	public static void main(String[] args) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("primos.dat"));

			for (int i = 2; i < 501; i++) {
				if (esPrimo(i)) {
					bw.write(String.valueOf(i) + "\n");
				}
			}

			bw.close();
			
			System.out.println("Se ha creado el nuevo fichero");
			
		} catch (IOException e) {
			System.err.println("Fallo con el fichero");
		}

	}

	static boolean esPrimo(int num) {
		for (int i = 2; i < num; i++) {
			if ((num % i) == 0) {
				return false;
			}
		}
		return true;
	}

}
