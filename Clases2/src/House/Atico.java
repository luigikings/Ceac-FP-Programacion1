package House;

public class Atico extends Casa{

	private int numeroPisos;
	
	public Atico(String direccion, int numHabitaciones, double precio, int numeroPisos) {
		super(direccion, numHabitaciones, precio);
		this.numeroPisos = numeroPisos;
		// TODO Auto-generated constructor stub
	}
	
	public void mostrarInformacion() {
		super.mostrarInformacion();
		System.out.println("El atico tiene "+numeroPisos+" Pisos\n");
	}


}
