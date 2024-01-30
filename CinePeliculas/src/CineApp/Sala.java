package CineApp;

import java.util.ArrayList;
import java.util.List;

public class Sala {

	//Atributos:
	private List<Butaca> butacas;
	private int numero;
	private Pelicula pelicula;
	private int capacidad;
	
	//Constructor:
	public Sala (int numero, Pelicula pelicula, int capacidad) {
		this.butacas = generarButacas();
		this.numero = numero;
		this.pelicula = pelicula;
		this.capacidad = capacidad;
	}
	//Metodos:
	
	//Una funcion para que a la hora de generar la sala se creen las butacas de dicha sala y se les asigne a la lista de butacas
	public List<Butaca> generarButacas(){
		List<Butaca> butacas = new ArrayList<Butaca>();
		for(int i=0; i<capacidad;i++) {
			Butaca butaca = new Butaca(i,4.99);
			butacas.add(butaca);
		}
		return butacas;
	}
	

	//getters and setters
	public List<Butaca> getButacas() {
		return butacas;
	}

	public void setButacas(List<Butaca> butacas) {
		this.butacas = butacas;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

}
