import java.sql.Date;

public class Prestamo {

	//atributos:
	private String idPrestamo;
	private Date fechaPrestamo;
	private Date fechaDevolucion;
	private Libro libroPrestado;
	private Usuario usuario;
	
	//constructor:
	public Prestamo(String idPrestamo,Date fechaPrestamo,Date fechaDevolucion,Libro libroPrestado,Usuario usuario) {
		this.setIdPrestamo(idPrestamo);
		this.setFechaPrestamo(fechaPrestamo);
		this.setFechaDevolucion(fechaDevolucion);
		this.setLibroPrestado(libroPrestado);
		this.setUsuario(usuario);
	}
	
	//metodos:
	public boolean esVencido() {
		return new Date(0).after(fechaDevolucion);
	}
	
	public String generarRecibo() {
		return ("Recibo:"
				+ "Id:"+idPrestamo
				+ "Fecha Prestamo:"+fechaPrestamo
				+ "Fecha Devolucion");
	}

	//getters and setters:
	public String getIdPrestamo() {
		return idPrestamo;
	}

	public void setIdPrestamo(String idPrestamo) {
		this.idPrestamo = idPrestamo;
	}

	public Date getFechaPrestamo() {
		return fechaPrestamo;
	}

	public void setFechaPrestamo(Date fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	public Date getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(Date fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

	public Libro getLibroPrestado() {
		return libroPrestado;
	}

	public void setLibroPrestado(Libro libroPrestado) {
		this.libroPrestado = libroPrestado;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
