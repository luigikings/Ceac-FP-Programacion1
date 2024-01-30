package CineApp;

public class Butaca {

	//atributos:
	private int numero;
	private boolean disponible;
	private double precio;
	
	//Constructor:
	public Butaca(int numero, double precio) {
		super();
		this.numero = numero;
		this.disponible = true;
		this.precio = precio;
	
	}
	//Metodos:
	
	
	//getters and setters:
	public int getPosx() {
		return numero;
	}
	
	public void setPosx(int numero) {
		this.numero = numero;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
}
