package animales;

public class Cocodrilo extends Animales {
	
	public Cocodrilo(int edad) {
		super("Cocodrilo", edad);
		// TODO Auto-generated constructor stub
	}

	public void araniar() {
		System.out.println("El cocodrilo te muerde!");
	}
	
	public void emitirSonido() {
		super.emitirSonido();
		System.out.println("ÑAAAAAAM!");
	}
	
}
