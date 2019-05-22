package vehiculo;

import java.util.Scanner;

/**
 * Clase TestVehiculo para realizar las pruebas de funcionamiento
 * 
 * VEHÍCULOS
 *=========
 * 1. Anda con la bicicleta
 * 2. Haz el caballito con la bicicleta
 * 3. Anda con el coche
 * 4. Quema rueda con el coche
 * 5. Ver kilometraje de la bicicleta
 * 6. Ver kilometraje del coche
 * 7. Ver kilometraje total
 * 8. Salir
 * Elige una opción (1-8):
 * @author Juan Manuel Gonzalez Profumo
 * @version 1.0
 */
public class TestVehiculo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		int km;

		Coche coche = new Coche(1900);
		Bicicleta bicicleta = new Bicicleta(6);

		do {
			mostrarMenu();
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("\nCuanta distancia (en km) quieres andar: ");
				km = sc.nextInt();
				System.out.println();
				bicicleta.andar(km);
				break;
			case 2:
				bicicleta.hacerCaballido();
				break;
			case 3:
				System.out.println("\nCuanta distancia (en km) quieres andar: ");
				km = sc.nextInt();
				System.out.println();
				coche.andar(km);
				break;
			case 4:
				coche.quemarRueda();
				break;
			case 5:
				System.out.println("\nEl kilometraje de la bicicleta es: " + bicicleta.getKilometrosRecorridos() + "\n");
				break;
			case 6:
				System.out.println("\nEl kilometraje del coche es: " + coche.getKilometrosRecorridos() + "\n");
				break;
			case 7:
				System.out.println("\nEl kilometraje total de ambos vehiculos es: " + Vehiculo.getKilometrosTotales() + "\n");
				break;
			case 8:
				System.out.println("\nSaliendo....");
				System.exit(0);
				break;
			default:
				System.out.println("\nOpcion introducida no valida\n");
				break;
			}
		} while (opcion != 8);

	}

	static void mostrarMenu() {
		System.out.println("VEHÍCULOS");
		System.out.println("=========");
		System.out.println("1. Anda con la bicicleta");
		System.out.println("2. Haz el caballito con la bicicleta");
		System.out.println("3. Anda con el coche");
		System.out.println("4. Quema rueda con el coche");
		System.out.println("5. Ver kilometraje de la bicicleta");
		System.out.println("6. Ver kilometraje del coche");
		System.out.println("7. Ver kilometraje total");
		System.out.println("8. Salir");
		System.out.println("Elige una opción (1-8):");
	}
}
