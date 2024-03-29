package clases;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculadoralista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaramos la lista de numeros, el scanner y un booleano para salir del programa
		ArrayList<Integer> listaNum = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		boolean salir = true;
				
		//Creamos un bucle que muestre el menu siempre que el usuario todavia no seleccione para salir
		while (salir) {
			//mostramos las 4 opciones posibles y que el usuario eliga poniendo un numero
			System.out.println("Elige una de estas 4 opciones:");
			System.out.println("1)Añadir número a la lista  \n2)Mostrar lista de números \n3)Calcular operacion con la lista\n4)Salir");
			//recogemos la opcion del usuario
			String usuario = sc.nextLine();
			//utilizamos un switch para el menu para cada uno de los 4 casos, en caso que el usuario coloque otra cosa notificar y empezaria el bucle
			switch (usuario) {
			//en caso 1 llamar la funcion a;adir numero
			case "1": 
				añadirnumero(sc,listaNum);
				break;
			//en caso 2 llamar la funcion para mostrar la lista
			case "2":
				mostrarLista(listaNum);
				break;
			//en caso 3 llamar la funcion para hacer una operacion con la lista
			case "3":
				operacionLista(sc,listaNum);
				break;
			//en caso 4 cambiar el boolean salir a false y despedirse del usuario
			case "4":
				salir = false;
				System.out.println("ADIOS");
				break;
			default:
				System.err.println("TE HAS EQUIVOCADO VUELVE A INTRODUCIR");
			}
		}
		sc.close();
	}
	
	//En esta funcion a;adiremos un numero a la lista
	public static void añadirnumero (Scanner sc,ArrayList<Integer> listaNum) {
		System.out.println("ESCRIBE QUE NÚMERO DESEAS AÑADIR");
		int usuario = 0;
		
		//le pedimos al usuario que nos de un numero por lo que colocamos un try para que en caso de que se equivoque y salte una
		//excepcion volver a pedir un numero
		try {
			usuario = sc.nextInt();
			sc.nextLine();
		} catch (Exception e) {
			// TODO: handle exception
			//en caso de que el usuario sea tonto y no nos de un numero entonces volver a llamar la funcion y lanzar un return
			//para que no utilize el valor iniciado
			
			System.err.println("ERROR, TIENE QUE INTRODUCIR UN NUMERO ENTERO");
			añadirnumero(sc,listaNum);
			return;
		}
		
		//a;adimos el numero a la lista
		listaNum.add(usuario);
		System.out.println("AÑADIDO "+usuario);
	}
	
	//en esta funcion mostramos la lista de numeros
	public static void mostrarLista (ArrayList<Integer> listaNum) {
		//con esta condicional miramos si no esta vacia en caso contrario indicar que esta vacia y volver al menu inicial
		if (!listaNum.isEmpty()) {
			System.out.println("///////////////////////");
			System.out.println("LISTA:");
			for(int i=0;i<listaNum.size();i++) {
				System.out.print(listaNum.get(i)+" ");
			}
		}else {
			System.err.println("LISTA VACIA");
			return;
			}
		System.out.println("");
		System.out.println("///////////////////////");
	}
	
	//en esta funcion le preguntaremos al usuario que operacion quiere hacer: sumar, restar,multiplicar y dividir
	public static void operacionLista (Scanner sc,ArrayList<Integer> listaNum) {
		//igual que antes verificamos que la lista este vacia si es el caso notificar y volver a mandar al meni inicial.
		if (listaNum.isEmpty()) {
			 System.out.println("LISTA DE NUMEROS VACIA, AGREGA NUMEROS PRIMERO");
	         return;
		}
		//mostramos la lista y pedimos que operacion quiere hacer el usuario
		mostrarLista(listaNum);
		System.out.println("Juguemos con la lista: que quieres hacer?");
		System.out.println("1)SUMAR  \n2)RESTAR \n3)MULTIPLICAR \n4)DIVIDIR");
		String usuario = sc.nextLine();

		//con otro switch a modo de menu ejecutamos segun lo pedido el usuario en caso que haya colocado otra cosa notificar y volver a pedir
		switch (usuario) {
		//en caso 1 sumaremos todos los numeros y guardaremos en un long (para asegurarnos lo mas posible del tama;o del resultado)
		case "1": 
			long numSuma = sumarLista(listaNum);
			System.out.println("El resultado de la suma es: "+numSuma);
			break;
		//en caso 2 restaremos todos los numeros y guardaremos en un long (para asegurarnos lo mas posible del tama;o del resultado)
		case "2":
			long numResta = restarLista(listaNum);
			System.out.println("El resultado de la resta es: "+numResta);
			break;
		//en caso 3 multiplicaremos todos los numeros y guardaremos en un long (para asegurarnos lo mas posible del tama;o del resultado)
		case "3":
			long numMultiplica = multiplicarLista(listaNum);
			System.out.println("El resultado de la multiplicacion es: "+numMultiplica);
			break;
		//en caso 4 primero verificamos si la lista tiene un 0, como no es posible una division entre 0 notificamos al usuario
		//y regresaremos al menu inicial, en caso contrario dividiremos todos los numeros y guardamos el resultado en un float
		case "4":
			if (listaNum.contains(0)){
				System.out.println("No se puede realizar la division ya que tiene la lista tiene al menos un 0");
				break;
			}
			double numDividir = dividirLista(listaNum);
			System.out.println("El resultado de la division es: "+numDividir);
			break;
		default:
			System.err.println("TE HAS EQUIVOCADO VUELVE A INTRODUCIR");
			operacionLista(sc, listaNum);
		}
	}
	
	//funcion para sumar todos los numeros de una lista
	public static long sumarLista (ArrayList<Integer> listaNum) {
		long numSuma = listaNum.get(0);
		for (int i=1;i<listaNum.size();i++) {
			numSuma+=listaNum.get(i);
		}
		return numSuma;
	}
	
	//funcion para restar todos los numeros de una lista
	public static long restarLista (ArrayList<Integer> listaNum) {
		long numResta = listaNum.get(0);
		for (int i=1;i<listaNum.size();i++) {
			numResta-=listaNum.get(i);
		}
		return numResta;
	}

	//funcion para multiplicar todos los numeros de una lista
	public static long multiplicarLista (ArrayList<Integer> listaNum) {
		long numMultiplicar = listaNum.get(0);
		for (int i=1;i<listaNum.size();i++) {
			numMultiplicar=numMultiplicar*listaNum.get(i);
		}
		return numMultiplicar;
	}
	
	//funcion para dividir todos los numeros de una lista
	public static double dividirLista (ArrayList<Integer> listaNum) {
		double numDividir = listaNum.get(0);
		for (int i=1;i<listaNum.size();i++) {
			numDividir=numDividir/listaNum.get(i);
		}
		return numDividir;
	}
}
