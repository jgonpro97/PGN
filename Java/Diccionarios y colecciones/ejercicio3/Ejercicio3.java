package ejercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 3. Escribe un programa que ordene 10 números enteros introducidos por teclado y
 * almacenados en un objeto de la clase ArrayList.
 * 
 * @author Juan Manuel Gonzalez Profumo
 * @version 1.0
 *
 */
public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Introduce un numero: ");
			int num = sc.nextInt();
			
			numeros.add(num);
		}
		
		System.out.println("\nLista sin ordenar: \n" + numeros);
		
		Collections.sort(numeros);
		
		System.out.println("\nLista ordenada: \n" + numeros);
	}

}
