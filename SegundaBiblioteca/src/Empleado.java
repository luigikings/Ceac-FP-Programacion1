
public class Empleado {

	//atributos
	private String idEmpleado;
	private String nombre;
	private String cargo;
	
	//constructor
	public Empleado(String idEmpleado,String nombre,String cargo) {
		this.setIdEmpleado(idEmpleado);
		this.setNombre(nombre);
		this.setCargo(cargo);
	}
	
	//metodos
	public void registrarusuario() {
	}
	
	//getters and setters

	public String getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(String idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

}
