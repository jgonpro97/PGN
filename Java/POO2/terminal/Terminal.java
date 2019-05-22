package terminal;

/**
 * Implementa la clase Terminal. Un terminal tiene asociado un número. Los
 * terminales se pueden llamar unos a otros y el tiempo de conversación corre
 * para ambos. A continuación se proporciona el contenido del main y el
 * resultado que debe aparecer por pantalla.
 * 
 * @author Juan Manuel Gonzalez Profumo
 * @version 1.0
 */
public class Terminal {
	private String telefono;
	private int duracion;

	public Terminal(String telefono) {
		this.telefono = telefono;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	void llamar(Terminal t, int s) {
		this.duracion += s;
		t.duracion += s;
	}

	@Override
	public String toString() {
		return "Nº " + getTelefono() + " - " + getDuracion() + "s de conversación";
	}
	
}
