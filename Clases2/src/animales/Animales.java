package animales;

public class Animales {

	//atributos:
	private String nombre;
	private int edad;

	//constrcutor
	public Animales(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	//funciones:
	public void comer() {
		System.out.println(nombre+" se pone a comer");
	}
	
	public void emitirSonido() {
		System.out.print("el "+nombre+" ");
	}

	//getters and setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
}
