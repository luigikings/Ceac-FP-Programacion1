package CineApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {

	//Atributos:
	private String correo;
	private String nombre;
	private String Apellido;
	private List<Butaca> butacasCompradas;
	
	
	//Constructor:
	public Cliente(String correo, String nombre, String apellido) {
		super();
		this.correo = correo;
		this.nombre = nombre;
		Apellido = apellido;
		this.butacasCompradas = new ArrayList<Butaca>();
	}
	//metodos:
	public void comprarEntradas(Cine cine) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenido a Cinex! \n Elige que Pelicula quieres ver:");
		while(true) {
			cine.mostrarCartelera();
			System.out.println("Selecciona el numero de la sala!");
			String usuario1 = sc.nextLine();
			//if(usuario1.equals())
			break;
		}
		
	}
	
	//Getters and Setters:
	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return Apellido;
	}


	public void setApellido(String apellido) {
		Apellido = apellido;
	}


	public List<Butaca> getButacasCompradas() {
		return butacasCompradas;
	}


	public void setButacasCompradas(List<Butaca> butacasCompradas) {
		this.butacasCompradas = butacasCompradas;
	}
	
}
