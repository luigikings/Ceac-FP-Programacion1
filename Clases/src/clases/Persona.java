package clases;

public class Persona {

	private String nombre;
	private int edad;
	private boolean sexo;
	
	public Persona(String nombre,int edad,boolean sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}
	
	//metodos:
	public void saludar() {
		System.out.println("Que lo que eres tu "+this.nombre);
	}
	
	public int cumplirAnios() {
		return this.edad++;
	}

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

	public boolean isSexo() {
		return sexo;
	}

	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}
}
