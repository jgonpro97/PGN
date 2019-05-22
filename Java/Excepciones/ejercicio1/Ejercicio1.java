package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 1. Realiza un programa que pida 6 números por teclado y nos diga cuál es el
 * máximo. Si el usuario introduce un dato erróneo (algo que no sea un número
 * entero) el programa debe indicarlo y debe pedir de nuevo el número.
 * 
 * @author Juan Manuel Gonzalez Profumo
 * @version 1.0
 */
public class Ejercicio1 {
	public static void main(String[] args) {
		int numero = 0;
		int maximo = 0;
		
		for (int i = 0; i < 6; i++) {
			
			try {
				numero = pedirDatos();
			} catch (NumeroNoValidoException e) {
				System.err.println(e.getMessage());
			}
			
			if (numero > maximo) {
				maximo = numero;
			}
		}
		
		System.out.println("\nMaximo: " + maximo);
	}
	
	static int pedirDatos() throws NumeroNoValidoException {
		Scanner sc = new Scanner(System.in);
		int numero;
		boolean valido = false;
		
		do {
			try {
				System.out.println("Introduce un numero: ");
				numero = sc.nextInt();
				valido = true;
			} catch (InputMismatchException e) {
				valido = false;
				throw new NumeroNoValidoException("Valor introducido no valido");
			}finally {
				sc.nextLine();
			}
		} while (!valido);
			
		return numero;
	}
}
