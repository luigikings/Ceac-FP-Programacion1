package clases;

public class Fruta {
	//Atributos Fruta:
	private boolean semilla;
	private double peso;
	private String color;
	private String nombre;

	//Constructor:
	public Fruta(boolean semilla, double peso, String color, String nombre) {
		super();
		this.semilla = semilla;
		this.peso = peso;
		this.color = color;
		this.nombre = nombre;
	}


	//Mostrar Info:
	public void info() {
		System.out.println("La fruta se llama "+nombre);
		System.out.println("La fruta es de color "+color);
		System.out.println("La fruta pesa "+peso);
		System.out.println("La fruta tiene semilla "+semilla);
	}
	
	//getters and setters
	public boolean isSemilla() {
		return semilla;
	}



	public void setSemilla(boolean semilla) {
		this.semilla = semilla;
	}



	public double getPeso() {
		return peso;
	}



	public void setPeso(double peso) {
		this.peso = peso;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


}
