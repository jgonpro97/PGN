package circulo;
/**
 * 3. Crea una clase TestCirculo que cree una instancia de “Circulo”, muestre su
 * estado, lo haga crecer 27 veces, averigüe su área, lo haga decrecer 10 veces
 * y muestre su estado final.
 * 
 * @author Juan Manuel Gonzalez Profumo
 * @version 1.0
 */
public class TestCirculo {
	public static void main(String[] args) {
		Circulo circulo = new Circulo(0);
		
		circulo.menguar();
		
		System.out.println(circulo.toString());
		
		for (int i = 0; i < 27; i++) {
			circulo.crecer();
		}
		
		System.out.println("El area del circulo es: " + circulo.calcularArea());
		
		for (int i = 0; i < 10; i++) {
			circulo.menguar();
		}
		
		System.out.println(circulo.toString());
		
	}
}
