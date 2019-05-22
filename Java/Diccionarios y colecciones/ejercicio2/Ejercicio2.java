package ejercicio2;

import java.util.ArrayList;

/**
 * 2. Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
 * ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de
 * esos números. El tamaño de la lista también será aleatorio y podrá oscilar
 * entre 10 y 20 elementos ambos inclusive.
 * 
 * @author Juan Manuel Gonzalez Profumo
 * @version 1.0
 */
public class Ejercicio2 {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		int tamanno = (int)(Math.random() * (10 - 21) + 20);
		int suma = 0;
		double media;
		int max = 0;
		int min = 100;
		
		for (int i = 0; i < tamanno; i++) {
			int num = (int)(Math.random() * 101);
			
			numeros.add(num);
		}
		
		System.out.println(numeros);
		
		for (int num : numeros) {
			suma += num;
			
			if (num > max) {
				max = num;
			}
			
			else if (num < min) {
				min = num;
			}
		}
		
		media = Math.round(((double) suma/tamanno) * 100d)/100d;
		
		System.out.println("\nSuma: " + suma);
		System.out.println("Media: " + media);
		System.out.println("Maximo: " + max);
		System.out.println("Minimo: " + min);
		
	}

}
