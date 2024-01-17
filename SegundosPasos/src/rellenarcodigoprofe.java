
public class rellenarcodigoprofe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Serie fibonacci
		posFibonacci(20);
		
		System.out.println();
		System.out.println("-----------------------------");
		
		//Sumar Digitos de un numero
		sumaDigitos(123);
		
		System.out.println();
		System.out.println("-----------------------------");
		
		//Verificar que un numero sea palinmodro
		palinmodro(12121);
		
		
	}

	
	//Hacemos una funcion para ir mostrando la sucesion de Fibonacci hasta la posicion dada:
	public static void posFibonacci(int pos) {
		//declaramos variables 0 y 1 que son las 2 primeras posiciones de la sucesion
		int a = 0;
		int b = 1;
		System.out.println("La serie de fibonacci hasta la posicion " + pos + " es:");
		//En un bucle vamos mostrando la susecion hasta la posicion dada
		for (int i = 0; i < pos; i++) {
			System.out.print(a + " ");
			//Aqui hacemos la operacion de sumar el anterior numero (Susecion de Fibonacci)
			int aux = a;
			a = b;
			b = aux + b;

		}
	}
	
	//Hacemos una funcion para ir sumando cada digito del numero dado
	public static void sumaDigitos(int num1) {
		String txtnum = Integer.toString(num1);
		//declaramos un INT para guardar el num que vayamos a sumar 
		int num=0;
		//declaramos un Int para ir sumando cada digito y tenerlo guardado
		int suma=0;
		//declaramos un String vacio para ir metiendo los digitos del numero
		String digito=null;
		//En un bucle recorremos los numeros y en cada digito guardamos el charAt como String y eso lo convertimos a numero y lo pasamos a numero
		for (int i=0;i<txtnum.length();i++) {
			digito= txtnum.charAt(i)+"";
			num= Integer.parseInt(digito);
			suma=suma+num;
		}
		System.out.println("La suma de sus digitos son: "+suma);
	}
	
	//Hacemos una funciona para verificar si un numero en palindromo (que se lee igual de izquerda a derecha que de derecha a izquierda)
	public static void palinmodro(int num1) {
		String txtnum = num1+"";
		//declaramos un boolean = true para verificar si es o no es palinmodro
		boolean esPalinmodro=true;
		//En un bucle recorremos el numero y dentro recorremos el numero pero al lado contrario de manera que vamos viendo que los numeros del inicio y el final son iguales
		for(int i =0;i<txtnum.length();i++) {
			for (int j=txtnum.length()-1;j>=0;j--) {
				//En esta condicional miramos si hay algun es diferente si es el caso el boolean lo convertimos a false
				if (txtnum.charAt(i)!=txtnum.charAt(j)) {
					esPalinmodro=false;
				}
				i++;
			}
		}
		//Creamos una condicional en la que si el boolean es true entonces si es palinmodro, en caso contrario (false) mostrar que no es palinmodro
		if (esPalinmodro == true) {
			System.out.println("SI, "+num1+" ES PALINMODRO");
		} else {
			System.out.println("NO, "+num1+" ES PALINMODRO");
		}
	}

}
