package movil;

import java.text.DecimalFormat;

/**
 * Implementa la clase Movil como subclase de Terminal (la clase del ejercicio
 * anterior que ya no hace falta modificar). Cada móvil lleva asociada una
 * tarifa que puede ser “rata”, “mono” o “bisonte”. El coste por minuto es de 6,
 * 12 y 30 céntimos respectivamente. Se tarifican los segundos exactos.
 * Obviamente, cuando un móvil llama a otro, se le cobra al que llama, no al que
 * recibe la llamada. A continuación se proporciona el contenido del main y el
 * resultado que debe aparecer por pantalla. Para que
 * 
 * @author Juan Manuel Gonzalez Profumo
 * @version 1.0
 */
public class Movil extends Terminal {
	private String tarifa;
	private double tarificado;

	public Movil(String telefono, String tarifa) {
		super(telefono);
		this.tarifa = tarifa;
		this.tarificado = 0;
	}

	public String getTarifa() {
		return tarifa;
	}

	public void setTarifa(String tarifa) {
		this.tarifa = tarifa;
	}

	public double getTarificado() {
		return tarificado;
	}

	public void setTarificado(double tarificado) {
		this.tarificado = tarificado;
	}

	@Override
	void llamar(Terminal t, int s) {
		super.llamar(t, s);
		double min = (double) s / 60;

		if (this.tarifa == "rata") {
			this.tarificado += min * 0.06;
		}

		if (this.tarifa == "mono") {
			this.tarificado += min * 0.12;
		}

		if (this.tarifa == "bisonte") {
			this.tarificado += min * 0.30;
		}
	}

	@Override
	public String toString() {
		DecimalFormat formato = new DecimalFormat("0.00");
		return super.toString() + " - tarificados " + formato.format(getTarificado()) + " euros";
	}

}
