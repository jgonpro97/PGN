package ejercicio2;

/**
 * Clase Gato con sus atributos
 * @author Juan Manuel Gonzalez Profumo
 * @version 1.0
 */
public class Gato {
  private String color;
  private String raza;
  private String sexo;

  public Gato(String s) {
    this.sexo = s;
  }
 
  Gato apareaCon(Gato gato) throws ExcepcionApareamientoImposible {
  	if (this.sexo.equals(gato.sexo)) {
			throw new ExcepcionApareamientoImposible("No se pueden aparear son del mismo sexo");
		}
  	
  	String[] sexo = {"macho", "hembra"};
  	String s = sexo[(int)(Math.random() * 2)];
  	
		return new Gato(s);
  }
}