package clases;

public class Carretera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coche cocheNuevo1 = new Coche("Toyota", "Aurus", 2001, "Blanco", 10);
		
		System.out.println(cocheNuevo1.calcularConsumo(10));
		
		cocheNuevo1.encenderMotor();
		
		cocheNuevo1.acelerar(10);
		cocheNuevo1.acelerar(20);
		
		cocheNuevo1.frenar(10);
		cocheNuevo1.frenar(20);
		
		Persona andrea = new Persona("Andrea", 24, true);
		
		
		System.out.println(andrea.cumplirAnios());
		
		andrea.cumplirAnios();
		andrea.cumplirAnios();
		andrea.cumplirAnios();
		andrea.cumplirAnios();
		andrea.cumplirAnios();
		andrea.cumplirAnios();
		andrea.cumplirAnios();
		
		
		System.out.println(andrea.getEdad());
		
		
		andrea.saludar();
		
	}

}
