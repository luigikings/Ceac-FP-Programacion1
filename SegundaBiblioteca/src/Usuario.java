import java.util.List;

public class Usuario {

	private String idUsuario;
	private String nombre;
	private List<Prestamo> prestamosActuales;
	
	//constructor
	public Usuario(String idUsuario,String nombre,List<Prestamo> prestamosActuales){
		this.setIdUsuario(idUsuario);
		this.setNombre(nombre);
		this.setPrestamosActuales(prestamosActuales);
	}
	
	//metodos
	public void tomarPrestado(Prestamo prestamo) {
		prestamosActuales.add(prestamo);
	}
	
	public void devolver(Prestamo prestamo) {
		if(prestamosActuales.contains(prestamo)) {
			prestamosActuales.remove(prestamo);
		}
		
	}
	
	public void listarPrestamos() {
		for(Prestamo pres: prestamosActuales) {
			System.out.println(pres);
		}
	}

	//getters and setters
	public String getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Prestamo> getPrestamosActuales() {
		return prestamosActuales;
	}

	public void setPrestamosActuales(List<Prestamo> prestamosActuales) {
		this.prestamosActuales = prestamosActuales;
	}

}
