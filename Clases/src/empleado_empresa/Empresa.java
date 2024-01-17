package empleado_empresa;

import java.util.List;

public class Empresa {

	/*

	Crear una clase llamada "Empresa"
		Funciones (métodos):
			Constructor: Un constructor que acepte 1 parámetro, el nombre de la empresa (cadena de caracteres),
				y lo utilice para inicializar el atributo de la clase.
			contratarEmpleado(Empleado): añado un empleado a la empresa
			despedirEmpleado(Empleado): en caso de que el empleado exista en la empresa llo despido,
			 	sino digo que no trabaja en esta empresa
			 mostrarListaEmpleados(): muestro todos los empleados de la lista
		Atributos:
			nombre: Almacena el nombre del producto como una cadena de caracteres.
			precio: Almacena el precio del producto como un número decimal (double).
			cantidadEnStock: Almacena la cantidad en stock del producto como un número entero (int).	  
	*/
	
	//atributos:
	private String nombre;
	private List<Empleado> empleados;
	
	//constructor:
	public Empresa(String nombre,List<Empleado> empleados) {
		this.nombre = nombre;
		this.empleados = empleados;
	}
	
	//metodos:
	public void contratarEmpleado(Empleado empleado) {
		empleados.add(empleado);
	}
	
	public void despedirEmpleado(Empleado empleado) {
		if(empleados.contains(empleado)) {
			empleados.remove(empleado);
		}else {
			System.out.println("No esta este empleado!");
		}
	}
	
	public void listarEmpleado() {
		for(Empleado a: empleados) {
			System.out.println(a.getNombre()+a.getApellido());
		}
	}
	
	//getters and setters
	public String getNombre() {
		return nombre;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}
}
