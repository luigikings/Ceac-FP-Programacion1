package House;

public class Casa {

	private String direccion;
	private int numHabitaciones;
	private double precio;
	
	public Casa(String direccion, int numHabitaciones, double precio) {
		super();
		this.direccion = direccion;
		this.numHabitaciones = numHabitaciones;
		this.precio = precio;
	}

	public void mostrarInformacion() {
		System.out.print("Direccion: "+direccion
				+"\nNumero de Habitaciones: "+numHabitaciones
				+"\nPrecio: "+precio+"\n");
	}
	
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getNumHabitaciones() {
		return numHabitaciones;
	}

	public void setNumHabitaciones(int numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
