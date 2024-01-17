package empleado_empresa;

public class Empleado {

	private String nombre;
	private String apellido;
	private int edad;
	private double salario;
	private String email;
	private String telefono;
	private String direccion;
	
	public Empleado(String nombre,String apellido,int edad,double salario,String email,String telefono,String direccion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad= edad;
		this.salario = salario;
		this.email = email;
		this.telefono = telefono;
		this.direccion = direccion;
	}
	
	public void enviarCorreo(String mensaje) {
		System.out.println("Enviando correo a "+email);
		System.out.println(mensaje);
	}
	
	public void realizarLlamada(String numeroDestino) {
		System.out.println("LLamando a "+numeroDestino+" desde "+this.telefono);
	}
	
	public void mostrarInformacion() {
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Apellido: "+this.apellido);
		System.out.println("Edad: "+this.edad);
		System.out.println("Salario: "+this.salario);
		System.out.println("Email: "+this.email);
		System.out.println("Telefono: "+this.telefono);
		System.out.println("Direccion: "+this.nombre);
	}
	
	public void aumentarSalario(double porcentaje) {
		if(porcentaje > 0) {
			this.salario+= salario*(porcentaje/100);
		}else {
			System.out.println("No se puede mi rey");
		}
		
	}
	
	
	//getters and setters
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getEdad() {
		return edad;
	}

	public double getSalario() {
		return salario;
	}

	public String getEmail() {
		return email;
	}

	public String getTelefono() {
		return telefono;
	}
	public String getDireccion() {
		return direccion;
	}
}
