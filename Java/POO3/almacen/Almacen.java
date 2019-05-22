package almacen;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Crea el programa GESTISIMAL (GESTIón SIMplificada de Almacén) para llevar
 * el control de los artículos de un almacén. De cada artículo se debe saber
 * el código, la descripción, el precio de compra, el precio de venta y el stock
 * (número de unidades). El menú del programa debe tener, al menos, las
 * siguientes opciones:
 * 1. Listado
 * 2. Alta
 * 3. Baja
 * 4. Modificación
 * 5. Entrada de mercancía
 * 6. Salida de mercancía
 * 7. Salir
 * La entrada y salida de mercancía supone respectivamente el incremento y
 * decremento de stock de un determinado artículo. Hay que controlar que no se
 * pueda sacar más mercancía de la que hay en el almacén.
 * @author Juan Manuel Gonzalez Profumo
 * @version 1.0
 */
public class Almacen {
	
	private static ArrayList<Articulo> almacen = new ArrayList<Articulo>();
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int opcion;
		
		//Recogida de la opcion del menu
		do {
			mostrarMenu();
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 1:
				mostrarAlmacen();
				break;
			case 2:
				try {
					annadirArticulo();
				} catch (ValorNoValidoException | CodigoNoValidoException e) {
					System.err.println(e.getMessage());
				}
				break;
			case 3:
				try {
					borrarArticulo();
				} catch (CodigoNoValidoException | BorrarArticuloException e) {
					System.err.println(e.getMessage());
				}
				break;
			case 4:
				try {
					modificarArticulo();
				} catch (ValorNoValidoException | CodigoNoValidoException e) {
					System.err.println(e.getMessage());
				}
				break;
			case 5:
				try {
					aumentarStock();
				} catch (ValorNoValidoException | CodigoNoValidoException e) {
					System.err.println(e.getMessage());
				}
				break;
			case 6:
				try {
					decrementarStock();
				} catch (ValorNoValidoException | CodigoNoValidoException e) {
					System.err.println(e.getMessage());
				}
				break;
			case 7:
				System.out.println("\nSaliendo....");
				break;
			default:
				break;
			}
		} while (opcion != 7);

	}
	
	//Metodo para mostrar el menu
	static void mostrarMenu() {
		System.out.println("MENU ALMACEN: ");
		System.out.println("****************************");
		System.out.println("1. Listado");
		System.out.println("2. Alta");
		System.out.println("3. Baja");
		System.out.println("4. Modificacion");
		System.out.println("5. Entrada de mercancia");
		System.out.println("6. Salida de mercancia");
		System.out.println("7. Salir");
		System.out.println("****************************");
		System.out.println("Elige una opcion del 1 al 7: ");
		System.out.println("****************************");
	}
	
	//Metodo para crear un articulo sin que se repita el codigo
	static Articulo crearArticulo() throws ValorNoValidoException, CodigoNoValidoException {
		System.out.println("\nCodigo: ");
		int codigo = sc.nextInt();

		System.out.println("Descripcion: ");
		String descripcion = sc.next();

		System.out.println("Precio de comprar: ");
		double precioCompra = sc.nextDouble();

		System.out.println("Precio de venta: ");
		double precioVenta = sc.nextDouble();

		System.out.println("Stock: ");
		int stock = sc.nextInt();
		
		for (Articulo articulo : almacen) {
			if (articulo.getCodigo() == codigo) {
				throw new CodigoNoValidoException("\nEl codigo introducido ya esta en uso\n");
			}
		}
		
		return new Articulo(codigo, descripcion, precioCompra, precioVenta, stock);
	}
	
	//Metodo para mostrar el almacen
	static void mostrarAlmacen(){
		if (almacen.size() == 0) {
			System.out.println("\nNo hay articulos en el almacen\n");
		}
		
		else {
			System.out.println("\nALMACEN: ");
			for (Articulo a : almacen) {
				System.out.println(a);
			}
			System.out.println();
		}
	}
	
	//Metodo para añadir un articulo correctamente
	static void annadirArticulo() throws ValorNoValidoException, CodigoNoValidoException {
		almacen.add(crearArticulo());
		System.out.println("\nArticulo añadido correctamente\n");
	}
	
	//Metodo para controlar que se borre un articulo correctamente
	static void borrarArticulo() throws CodigoNoValidoException, BorrarArticuloException {
		System.out.println("\nIntroduce el codigo del articulo que desea borrar: ");
		int cod = sc.nextInt();
		
		if (almacen.size() < 2) {
			throw new BorrarArticuloException("\nPara poder borrar un articulo debe haber minimo 2 articulos\n");
		}
		
		else {
			for (Articulo articulo : almacen) {
				if (articulo.getCodigo() == cod) {
					almacen.remove(articulo);
					System.out.println("\nArticulo borrado correctamente\n");
					
				}
				
				else {
					throw new CodigoNoValidoException("\nEl codigo del articulo no esta en el almacen\n");
				}
			}
		}
			
	}
	
	//Metodo para controlar que al modificar un articulo del almacen sea correcto
	static void modificarArticulo() throws ValorNoValidoException, CodigoNoValidoException {
		System.out.println("\nIntroduce el codigo del articulo que quiera modificar: ");
		int cod = sc.nextInt();
		int indice = 0;
		
		for (Articulo articulo : almacen) {
			if (articulo.getCodigo() == cod) {
				indice = almacen.indexOf(articulo);
			}
		}
		
		for (Articulo articulo : almacen) {
			if (articulo.getCodigo() == cod) {
				almacen.set(indice, crearArticulo());
				System.out.println("\nArticulo modificado\n");
			}
			
			else {
				throw new CodigoNoValidoException("\nEl codigo del articulo no esta en el almacen\n");
			}
		}

	}
	
	//Metodo para controlar que el aumento del stock sea correcto
	static void aumentarStock() throws ValorNoValidoException, CodigoNoValidoException {
		System.out.println("\nIntroduce el codigo del articulo al que quiera aumentar el stock: ");
		int cod = sc.nextInt();
		
		for (Articulo articulo : almacen) {
			if (articulo.getCodigo() == cod) {
				System.out.println("\nEn cuanto quieres aumentar el stock: ");
				int num = sc.nextInt();
				
				articulo.entradaDeMercancia(num);
				System.out.println("\nTamaño del stock modificado\n");
			}
			
			else {
				throw new CodigoNoValidoException("\nEl codigo del articulo no esta en el almacen\n");
			}
		}
	}
	
	//Metodo para controlar que el decremento del stock sea correcto
	static void decrementarStock() throws ValorNoValidoException, CodigoNoValidoException {
		System.out.println("\nIntroduce el codigo del articuloal que quiera decrementar el stock: ");
		int cod = sc.nextInt();
		
		for (Articulo articulo : almacen) {
			if (articulo.getCodigo() == cod) {
				System.out.println("\nEn cuanto quieres decrementar el stock: ");
				int num = sc.nextInt();
				
				if (articulo.getStock() < num) {
					throw new ValorNoValidoException("\nEl stock no puede ser menor de 0\n");
				}
				
				else {
					articulo.salidaDeMercancia(num);
					System.out.println("\nTamaño del stock modificado\n");
				}
			}
			
			else {
				throw new CodigoNoValidoException("\nEl codigo del articulo no esta en el almacen\n");
			}
		}
	}
	
}
