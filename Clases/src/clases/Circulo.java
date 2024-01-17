package clases;

public class Circulo {

	private double radio;
	
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	//metodos:
	public double CalcularArea() {
		return Math.PI*radio*radio;
	}
	
	public double CalcularPerimetro() {
		return Math.PI*2*radio;
	}
	
	//getters and setters

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
}
