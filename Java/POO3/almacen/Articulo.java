package almacen;

/**
 * Clase Articulo De cada artículo se debe saber el código, la descripción,
 * el precio de compra, el precio de venta y el stock (número de unidades).
 * 
 * @author Juan Manuel Gonzalez Profumo
 * @version 1.0
 */
public class Articulo {
	private int codigo;
	private String descripcion;
	private double precioCompra;
	private double precioVenta;
	private int stock;
	
	//Constructor de Articulo
	public Articulo(int codigo, String descripcion, double precioCompra, double precioVenta, int stock) throws ValorNoValidoException {
		this.codigo = codigo;
		this.descripcion = descripcion;
		setPrecioCompra(precioCompra);
		setPrecioVenta(precioVenta);
		setStock(stock);
	}
	
	//Getter y setter de cada uno de los atributos
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(double precioCompra) throws ValorNoValidoException {
		if (precioCompra < 0) {
			throw new ValorNoValidoException("\nEl precio de compra no puede ser menor de 0\n");
		}
		
		else {
			this.precioCompra = precioCompra;
		}
		
	}

	public double getPrecioVenta() {
		return precioVenta;
	}
	
	
	public void setPrecioVenta(double precioVenta) throws ValorNoValidoException {
		if (precioVenta < 0) {
			throw new ValorNoValidoException("\nEl precio de venta no puede ser menor de 0\n");
		}
		
		else {
			this.precioVenta = precioVenta;
		}
		
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) throws ValorNoValidoException {
		if (stock < 0) {
			throw new ValorNoValidoException("\nEl stock no puede ser menor de 0\n");
		}
		
		else {
			this.stock = stock;
		}	
		
	}
	
	//Metodo para aumentar el stock
	public void entradaDeMercancia(int num) throws ValorNoValidoException {
		setStock(stock + num); 
	}
	
	//Metodo para decrementar el stock
	public void salidaDeMercancia(int num) throws ValorNoValidoException {
		setStock(stock - num); 
	}
	
	//Metodo para mostrar el articulo
	@Override
	public String toString() {
	    String cadena = "****************************";
	        cadena += "\nCódigo: " + this.codigo;  
	        cadena += "\nDescripcion: " + this.descripcion;    
	        cadena += "\nPrecio de compra: " + this.precioCompra;
	        cadena += "\nPrecio de venta: " + this.precioVenta;
	        cadena += "\nStock: " + this.stock;
	        cadena += "\n****************************";
	    return cadena;
	}
	
}