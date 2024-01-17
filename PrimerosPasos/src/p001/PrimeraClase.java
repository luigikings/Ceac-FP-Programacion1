package p001;

public class PrimeraClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Comentario de varias lineas (/*)
		 * 
		 * 
		 * 
		 * 
		 */

		// Comentario de 1 linea

		// Declaramos una variable de tipo numero entero (int) con valor 1
		int VariableTipoEntero = 1;
		// Lo modificamos cambiar su valor a 2
		VariableTipoEntero = 2;

		// La siguiente linea va a dar error por meter un decimal en una variable en
		// tipo entero
		// n1 = 1.5;

		// Declaramos una variable tipo decimal con valor 1.5
		float variableTipoDecimal = 1.5F;

		// Declaramos una variable de tipo booleano con valor verdadero
		boolean variabletipobooleano = true;

		// Declaramos una variable de tipo Caracter con valor 'a' (siempre con comillas
		// ')
		char variableTipoCaracter = 'a';

		// Declaramos una variable de tipo Sting => conjunto de caracteres (comillas
		// dobles)
		String variableTipoString = "a";

		// Declaramos una variable de tipo short => Numero pequeño
		short variableTiposhort = 123;

		// Declaramos una variable de tipo double => Decimal Grande
		double NumeroDecimalGrande = 34234234.436436F;


		// Ejercicio 1 declarar 3 variables de cada tipo con valores diferentes
		// numero maximo de int 2.147.483.647 usar long para numeros mas grandes
		int n1 = 1343553;
		int n2 = 2147483647;
		int n3 = 0;

		float n4 = 1.88F;
		float n5 = 4.666F;
		float n6 = 5.999999999999F;

		boolean bool1 = true;
		boolean bool2 = false;

		char char1 = '?';
		char char2 = 'ñ';
		char char3 = '*';

		String string1 = "13456789";
		String string2 = "13413";
		String string3 = "    3235325";

		int numero1 = 2;
		int numero2 = 15;

		int sumaTotal = 2 + 5;
		int sumaTotal1 = numero1 + numero2;

		System.out.println(sumaTotal1);
		System.out.println("se enseña la suma" + sumaTotal);

		int multiplicacion = 2 * 5;
		System.out.println("Se enseña la multiplicacion " + multiplicacion);

		int division = 2 / 5;
		System.out.println("Se muestra la division " + division);

		System.out.println("buenos días bb");
		System.out.println(true);
		
		// Condicional (if)
		/*
		* 
		* if (Condicion) { 
		* 		Codigo 
		* } else if (otra condicion) { 
		* 		Codigo } else { Codigo }
		*
		*
		* == igual que 
		* > mayor que 
		* < menor que 
		* >= mayor o igual 
		* <= menor o igual
		* 
		* && reprenta el (y) logico 
		* || reprenta el (o) logico 
		* ! represnta el (no) logico 
		* != representa el (distinto) logico
		*/

		// Condiconal si es mayor de 17 años
		int edad = 17;
		if (edad > 17) {
			System.out.println("Es mayor de edad");
		} else {
			System.out.println("No es mayor de edad");
		}

		// Condicional si es mayor y par
		int edad1 = 18;
		if (edad1 > 17 && edad1 % 2 == 0) {
			System.out.println("Es mayor de edad y es par");
		} else {
			System.out.println("No es mayor de edad o no es par");
		}

		// Condicional es distinto a 19
		if (edad != 19) {
			System.out.println("Edad es diferente a 19");
		} else {

		}
		
		//Condicional Switch ()
		/*
		 * Switch (Variable a mirar) {
		 * 		case 1: 
		 * 			Codigo
		 * 			break;
		 * 		case 2:
		 * 			Codigo
		 * 			break;
		 * 		case 3:
		 * 			Codigo
		 * 			break;
		 * 		default:
		 * 			Codigo
		 * }
		 * 
		 */
		
		switch (edad) {
		case 1:
			System.out.println("Tu edad es igual a 1");
			break;
		case 17:
			System.out.println("Tu edad es igual a 17");
			break;
		case 18:
			System.out.println("Tu edad es igual a 18");
			break;
		default:
			System.out.println("no lo se");
		}
		
		int edad3 = 34;
		switch (edad3) {
		case 17:
		case 18:
		case 19:
			System.out.println("apruebas");
			break;
		case 20:
			System.out.println("no apruebas");
			break;
		default:
		}
		
		//Switch con palabras
		String nombreUsuario = "Andres";
		
		switch (nombreUsuario) {
		case "Estuche":
			System.out.println("Se llama Estuche");
			break;
		case "Julio":
			System.out.println("Se llama Julio");
			break;
		case "Andres":
			System.out.println("Se llama Andres");
			break;
		default:
			System.out.println("NO SE BROTHER SE LLAMA: "+nombreUsuario);
		}
		
	}

}
