package animales;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cocodrilo c = new Cocodrilo(20);
		
		//ÑAAAAAM!
		c.emitirSonido();
		
		Elefante e =  new Elefante("Africano", 17);
		
		//PUUUUUU!
		e.emitirSonido();
		
		
		c.comer();
		c.araniar();
		
		e.comer();
		e.perseguirCola();
	}

}
