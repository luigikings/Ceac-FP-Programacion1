package House;

public class Cabaña extends Casa{

	private boolean tieneChimenea;
	public Cabaña(String direccion, int numHabitaciones, double precio, boolean tieneChimenea) {
		super(direccion, numHabitaciones, precio);
		this.tieneChimenea = tieneChimenea;
		// TODO Auto-generated constructor stub
	}
	
	public void mostrarInformacion() {
		super.mostrarInformacion();
		System.out.println("La cabaña tiene chimenea: "+tieneChimenea+"\n");
	}
	
	
	

}
