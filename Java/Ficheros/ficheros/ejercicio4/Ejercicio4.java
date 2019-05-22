package ejercicio4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 * 4. Realiza un programa que sea capaz de ordenar alfabéticamente las palabras
 * contenidas en un fichero de texto. El nombre del fichero que contiene las
 * palabras se debe pasar como argumento en la línea de comandos. El nombre del
 * fichero resultado debe ser el mismo que el original añadiendo la coletilla
 * sort, por ejemplo palabras_sort.txt. Suponemos que cada palabra ocupa una
 * línea.
 * 
 * @author Juan Manuel Gonzalez Profumo
 * @version 1.0
 */
public class Ejercicio4 {
	public static void main(String[] args) {
		
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(args[0] + ".txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter(args[0] + "_sort.txt"));
			
			ArrayList<String> palabras = new ArrayList<String>();
			
			String linea = "";
			
			while (linea != null) {
				palabras.add(linea);
				linea = br.readLine();
			}
			

			
			br.close();
			
			Collections.sort(palabras);

			for (String s : palabras) {
				bw.write(s + "\n");
			}
			
			bw.close();
			
			System.out.println("Se ha creado el nuevo fichero");
					
		} catch (FileNotFoundException e) {
			System.err.println("No se encuentra el fichero");
		} catch (IOException e) {
			System.err.println("No se puede leer el fichero");
		}

	}


	}

