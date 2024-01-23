package animales;

public class Elefante extends Animales{
	
	private String raza;

	public Elefante(String raza, int edad) {
		super("Elefante", edad);
		this.raza=raza;
		// TODO Auto-generated constructor stub
	}
	
	public void emitirSonido() {
		super.emitirSonido();
		System.out.println("PUUUUUUUUUUUUUUU!");
	}
	
	public void perseguirCola() {
		System.out.println("El elefante se persigue la cola");
	}

}
