package tiempo;

/**
 * Crea la clase Tiempo con los métodos suma y resta. Los objetos de la clase
 * Tiempo son intervalos de tiempo y se crean de la forma Tiempo t = new
 * Tiempo(1, 20, 30) donde los parámetros que se le pasan al constructor son las
 * horas, los minutos y los segundos respectivamente. Crea el método toString
 * para ver los intervalos de tiempo de la forma 10h 35m 5s. Si se suman por
 * ejemplo 30m 40s y 35m 20s el resultado debería ser 1h 6m 0s. Realiza un
 * programa de prueba para comprobar que la clase funciona bien.
 * 
 * @author Juan Manuel Gonzalez Profumo
 * @version 1.0
 */
public class Tiempo {
	private int horas;
	private int minutos;
	private int segundos;

	public Tiempo(int horas, int minutos, int segundos) {
		setHoras(horas);
		setMinutos(minutos);
		setSegundos(segundos);
	}

	public int getHoras() {
		return horas;
	}

	private void setHoras(int horas) {			
		this.horas = horas;
	}

	public int getMinutos() {
		return minutos;
	}

	private void setMinutos(int minutos) {	
		this.minutos = minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	private void setSegundos(int segundos) {
		this.segundos = segundos;
	}

	Tiempo sumar(Tiempo t2) {
		Tiempo suma = new Tiempo(this.getHoras() + t2.getHoras(), this.getMinutos() + t2.getMinutos(), this.getSegundos() + t2.getSegundos());

		suma.pasarASegundos();
		suma.pasarTiempo();

		return suma;
	}

	Tiempo restar(Tiempo t2) {
		Tiempo resta = new Tiempo(this.getHoras() - t2.getHoras(), (this.getMinutos() - t2.getMinutos()), (this.getSegundos() - t2.getSegundos()));
		
		resta.pasarASegundos();
		resta.pasarTiempo();
		
		return resta;
	}

	int pasarASegundos() {
		this.horas *= 3600;
		this.minutos *= 60;
		this.segundos = this.horas + this.minutos + this.segundos;

		return this.segundos;
	}

	Tiempo pasarTiempo() {
		this.horas = this.segundos / 3600;
		this.minutos = (this.segundos - (this.horas * 3600)) / 60;
		this.segundos = this.segundos - ((this.horas * 3600) + (this.minutos * 60));

		return new Tiempo(this.horas, this.minutos, this.segundos);
	}

	@Override
	public String toString() {
		return this.horas + "h " + this.minutos + "m " + this.segundos + "s";
	}

}
