package House;

public class Chalet extends Casa{
	
	private int tamanioJardin;

	public Chalet(String direccion, int numHabitaciones, double precio,int tamanioJardin) {
		super(direccion, numHabitaciones, precio);
		this.tamanioJardin = tamanioJardin;
		// TODO Auto-generated constructor stub
	}
	
	public void mostrarInformacion() {
		super.mostrarInformacion();
		System.out.println("El tamaño del Jardin es "+tamanioJardin+" metros cuadrados"+"\n");
	}
	
	public void mostrarPiscina() {
		System.out.println("HAY PSICINA!");
	}

}
