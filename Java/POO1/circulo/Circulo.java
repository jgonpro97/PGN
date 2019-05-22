package circulo;

import javax.swing.JOptionPane;

/**
 * 2. Crea la clase “Circulo” en Java que responda al siguiente comportamiento:
 * 
 * Un círculo puede crecer. Aumenta su radio.
 * Un círculo puede menguar.Decrementa su radio.
 * Un círculo me devuelve su área si se la pido. 
 * Un círculo  me dice su estado, por ejemplo “Soy un círculo de radio 0.5 metros. Ocupo un
 * área de 0.7853981633974483 metros cuadrados” (método toString())
 * 
 * @author Juan Manuel Gonzalez Profumo
 * @version 1.0
 *
 */
public class Circulo {
		private double radio;

		public Circulo(double radio) {
			if (radio < 0) {
				this.radio = 1;
			}
			
			else {
				this.radio = radio;
			}
		}

		public double getRadio() {
			return radio;
		}

		public void setRadio(double radio) {
			this.radio = radio;
		}
		
		double crecer() {
			return radio += 1;
		}
		
		double menguar() {	
			if (radio == 0) {
				JOptionPane.showMessageDialog(null, "Soy un mísero punto sin área");
			}
			
			else {
				radio -= 1;
			}
			
			return radio;
		}
		
		double calcularArea() {
			return (Math.PI * Math.pow(radio, 2));
		}

		@Override
		public String toString() {
			return "Soy un círculo de radio " + getRadio() + " metros. Ocupo un área de " + calcularArea() + " metros cuadrados";
		}
		
}
