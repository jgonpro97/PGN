package coleccion;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Modifica el programa “Colección de discos” como se indica a continuación:
 * a) Mejora la opción “Nuevo disco” de tal forma que cuando se llenen todas las
 * posiciones del array, el programa muestre un mensaje de error. No se permitirá
 * introducir los datos de ningún disco hasta que no se borre alguno de la lista.
 *  b) Mejora la opción “Borrar” de tal forma que se verifique que el código
 *  introducido por el usuario existe.
 *  c) Modifica el programa de tal forma que el código del disco sea único, es decir
 *  que no se pueda repetir.
 *  d) Crea un submenú dentro dentro de “Listado” de tal forma que exista un
 *  listado completo, un listado por autor (todos los discos que ha publicado un
 *  determinado autor), un listado por género (todos los discos de un género determinado) y un listado de discos cuya duración esté en un rango determinado
 *  por el usuario.
 * @author Juan Manuel Gonzalez Profumo
 * @version 1.0
 */
public class ColeccionDeDiscosPrincipal {

  // N determina el tamaño del array
  static int N = 100;
  
  public static void main(String[] args) {
  	Scanner sc = new Scanner(System.in);
    //Crea el array de discos
    Disco[] album = new Disco[N];

    // Crea todos los discos que van en cada una de
    // las celdas del array
    for(int i = 0; i < N; i++) {
      album[i] = new Disco();
    }

    int opcion;
    String codigoIntroducido;
    String autorIntroducido;
    String tituloIntroducido;
    String generoIntroducido;
    String duracionIntroducidaString;
    int duracionIntroducida;
    int primeraLibre;
    int i;
    
    do {
      System.out.println("\n\nCOLECCIÓN DE DISCOS");
      System.out.println("===================");
      System.out.println("1. Listado");
      System.out.println("2. Nuevo disco");
      System.out.println("3. Modificar");
      System.out.println("4. Borrar");
      System.out.println("5. Salir");
      System.out.print("Introduzca una opción: ");
      opcion = sc.nextInt();
      
      switch (opcion) {
      case 1:
      	int opcionListado;
      	
        System.out.println("Listado de discos: ");
        System.out.println("1.-Listado Completo");
        System.out.println("2.-Listado por Autor");
        System.out.println("3.-Listado por género");
        System.out.println("4.-Listado según duración");
        System.out.print("Introduzca una opción: ");
        opcionListado = sc.nextInt();

        switch(opcionListado) {
        	case 1:
        		System.out.println("\nLISTADO COMPLETO");
            System.out.println("=======");
            for(i = 0; i < N; i++) {
              if (!album[i].getCodigo().equals("LIBRE")) {
                System.out.println(album[i]);
              }
            }
        		break;
        	case 2:
        		break;
        	case 3:
        		break;
        	case 4:
        		System.out.println("\nLISTADO POR DURACION");
            System.out.println("=======");
            Arrays.sort(album);
            for(i = 0; i < N; i++) {
              if (!album[i].getCodigo().equals("LIBRE")) {
                System.out.println(album[i]);
              }
            }
        		break;
        	default:
        		System.out.println("Opcion introducida no valida");
        		break;
        }
        
        break;
        
      case 2:
     // Busca la primera posición libre del array
      	
      	if (!album[N-1].getCodigo().equals("LIBRE")) {
        	System.out.println("Borrar para introducir un disco");
        }
      	else{
	        System.out.println("\nNUEVO DISCO");
	        System.out.println("==========="); 
	        
	        boolean compruebaCodigo;
	        do {
	        	compruebaCodigo = false;
	        	System.out.print("Código: ");
	        	codigoIntroducido = sc.next();
	        	for(int x = 0;x<album.length;x++) {
	        		if (album[x].getCodigo().equals(codigoIntroducido)) {
	        			System.err.println("El codigo esta en uso introduce otro");
	        			compruebaCodigo = true;
	        		}
	       		}
	        }while(compruebaCodigo);
	        	//Busca la primera posicion que esté libre
	        	primeraLibre = 0;
	        	while (!((album[primeraLibre].getCodigo()).equals("LIBRE"))) {
	        		primeraLibre++; 
	        	}
	        	album[primeraLibre].setCodigo(codigoIntroducido);
	        	System.out.print("Autor: ");
	        	autorIntroducido = sc.next();
	        	album[primeraLibre].setAutor(autorIntroducido);
	        
	        	System.out.print("Título: ");
	        	tituloIntroducido = sc.next();
	        	album[primeraLibre].setTitulo(tituloIntroducido);
	        
	        	System.out.print("Género: ");
	        	generoIntroducido = sc.next();
	        	album[primeraLibre].setGenero(generoIntroducido);
	        
	        	System.out.print("Duración: ");
	        	duracionIntroducida = sc.nextInt();
	        	album[primeraLibre].setDuracion(duracionIntroducida);
        break;      
      	}
      case 3:
        System.out.println("\nMODIFICAR");
        System.out.println("===========");
        
        System.out.print("Por favor, introduzca el código del disco cuyos datos desea cambiar: ");
        codigoIntroducido = sc.next();
  
        i = -1;
        do {
          i++;
        } while (!((album[i].getCodigo()).equals(codigoIntroducido)));
        
        System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");
  
        System.out.println("Código: " + album[i].getCodigo());
        System.out.print("Nuevo código: ");
        codigoIntroducido = sc.next();
        if (!codigoIntroducido.equals("")) {
          album[i].setCodigo(codigoIntroducido);
        }
        
        System.out.println("Autor: " + album[i].getAutor());
        System.out.print("Nuevo autor: ");
        autorIntroducido = sc.next();
        if (!autorIntroducido.equals("")) {
          album[i].setAutor(autorIntroducido);
        }
        
        System.out.println("Título: " + album[i].getTitulo());
        System.out.print("Nuevo título: ");
        tituloIntroducido = sc.next();
        if (!tituloIntroducido.equals("")) {
          album[i].setTitulo(tituloIntroducido);
        }
        
        System.out.println("Género: " + album[i].getGenero());
        System.out.print("Nuevo género: ");
        generoIntroducido = sc.next();
        if (!generoIntroducido.equals("")) {
          album[i].setGenero(generoIntroducido);
        }
        
        System.out.println("Duración: " + album[i].getDuracion());
        System.out.print("Duración: ");
        duracionIntroducidaString = sc.next();
        if (!duracionIntroducidaString.equals("")) {
          album[i].setDuracion(Integer.parseInt(duracionIntroducidaString));
        }
        
        break;
        
      case 4:
        System.out.println("\nBORRAR");
        System.out.println("======");
        
        System.out.print("Introduzca el código del disco que desea borrar: ");
        codigoIntroducido = sc.next();
        i = -1;
        
        do {
          i++;
        } while (!((album[i].getCodigo()).equals(codigoIntroducido)));
        if (album[i].getCodigo().equals(codigoIntroducido)) {
        	album[i].setCodigo("LIBRE");
          System.out.println("Album borrado correctamente.");
        }
        else {
        	System.out.println("El codigo no se encuentra en la coleccion.");
        }
        break;   
      default:
      } // switch
    } while (opcion != 5);
  }
}