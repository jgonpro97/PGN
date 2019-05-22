package fraccion;

import javax.swing.JOptionPane;

/**
 * 5. Crea una clase Fraccion (en Java yPython) de forma que podamos hacer las
 * siguientes operaciones:
 * 
 * Contruir un objeto Fraccion pasándole al constructor el numerador y el
 * denominador. Obtener la fracción. Obtener y modificar numerador y
 * denominador. No se puede dividir por cero. Obtener resultado de la fracción
 * (número real). Multiplicar la fracción por un número. Multiplicar, sumar y
 * restar fracciones. Simplificar la fracción.
 * 
 * @author Juan Manuel Gonzalez Profumo
 * @version 1.0
 */
public class Fraccion {
	private int numerador;
	private int denominador;

	public Fraccion(int numerador, int denominador) {
		this.numerador = numerador;

		if (denominador == 0) {
			System.out.println("El denominador no puede ser 0");
		}

		else {
			this.denominador = denominador;
		}
	}

	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}

	Fraccion modificar(int n, int d) {
		return new Fraccion(n, d);
	}

	double calcularResultado() {
		return (double) numerador / denominador;
	}

	Fraccion multiplicarPorNumero(int num) {
		return new Fraccion(this.numerador * num, this.denominador);
	}

	Fraccion multiplicarFracciones(Fraccion fraccion2) {
		return new Fraccion(this.numerador * fraccion2.getNumerador(), this.denominador * fraccion2.getDenominador());
	}

	Fraccion sumarFracciones(Fraccion fraccion2) {
		return new Fraccion((this.numerador * fraccion2.getDenominador() + this.denominador * fraccion2.getNumerador()),
		    this.denominador * fraccion2.getDenominador());
	}

	Fraccion restarFracciones(Fraccion fraccion2) {
		return new Fraccion((this.numerador * fraccion2.getDenominador() - this.denominador * fraccion2.getNumerador()),
		    this.denominador * fraccion2.getDenominador());
	}

	public int hallarMcd() {
		int dividendo = this.numerador;
		int divisor = this.denominador;
		while (dividendo % divisor != 0) {
			int resto = dividendo % divisor;
			dividendo = divisor;
			divisor = resto;
		}

		return divisor;
	}

	public Fraccion simplificarFraccion() {
		int mcd = hallarMcd();
		this.numerador /= mcd;
		this.denominador /= mcd;
		return new Fraccion(numerador, denominador);
	}

	@Override
	public String toString() {
		return getNumerador() + "/" + getDenominador();
	}

}
