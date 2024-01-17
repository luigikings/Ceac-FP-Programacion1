package empleado_empresa;

import java.util.ArrayList;

public class Empresas_empleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empresa empresa1 = new Empresa("WC4U", new ArrayList<Empleado>());
		
		Empleado empleado1 = new Empleado("Elver", "guero", 18, 3500, "Maricoelquelolea@gmail.com", "6515674366", "P. Sherman Calle Wallaby 42, Sidney");
		
		empresa1.contratarEmpleado(empleado1);
		
		empresa1.listarEmpleado();
		
		
		System.out.println(empleado1.getSalario());
		
		empleado1.aumentarSalario(100);
		
		System.out.println(empleado1.getSalario());
		
		empleado1.aumentarSalario(-10);
		
		System.out.println(empleado1.getSalario());
		
		empleado1.enviarCorreo("Hola como estas hace tiempo no se de ti...");
		
		empleado1.realizarLlamada("123123123");
		
		
		
	}

}
