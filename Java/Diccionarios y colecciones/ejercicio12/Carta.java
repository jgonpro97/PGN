package ejercicio12;

/**
 * @author Juan Manuel Gonzalez Profumo
 * @version 1.0
 */
public class Carta implements Comparable<Carta>{
	String [] f = {"AS", "DOS", "TRES", "CUATRO", "CINCO", "SEIS", "SIETE", "SOTA", "CABALLO", "REY"};
	String [] p = {"OROS", "COPAS", "ESPADAS", "BASTOS"};
	
	String figura;
	String palo;
	
	public Carta() {
		this.figura = f[(int)(Math.random() * 10)];
		this.palo = p[(int)(Math.random() * 4)];
	}

	public String getFigura() {
		return figura;
	}

	public void setFigura(String figura) {
		this.figura = figura;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carta other = (Carta) obj;
		if (figura == null) {
			if (other.figura != null)
				return false;
		} else if (!figura.equals(other.figura))
			return false;
		if (palo == null) {
			if (other.palo != null)
				return false;
		} else if (!palo.equals(other.palo))
			return false;
		return true;
	}
	
	@Override
	public int compareTo(Carta carta) {
	   if (palo.equals(carta.getPalo())) {
	      return figura.compareTo(carta.getFigura());
	    } else {
	      return palo.compareTo(carta.getPalo());
	    }
	}

	@Override
	public String toString() {
		return figura + " de " + palo;
	}
	
}
