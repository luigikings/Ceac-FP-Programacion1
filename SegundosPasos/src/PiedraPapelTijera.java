import java.util.Scanner;

public class PiedraPapelTijera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Vamos a Jugar al piedra, Papel o Tijeras!");
		//Guardamos una variable entero donde eligiremos si jugamos contra el ordenador o contra otro usuario
		int eleccion = elegirContricante() ;
		
		//Creamos 1 variable vacia para ver si guardamos respuesta por parte del ordenador o por otro usuario y la otra variable sera la nuestra
		String Manocontricante="";
		String ManoUsuario= pedirUsuario();
		//En este if verificamos que eleccion hicimos y segun elegido la mano del contricante sera creada por el ordenador o por el otro usuario
		if (eleccion == 1) {
			Manocontricante= generarManoOrdenador();
			System.out.println("El ordenador elige:" +Manocontricante);
		} else {
			System.out.println("Jugador Contricante:");
			Manocontricante = pedirUsuario();
		}
		
		partida(Manocontricante, ManoUsuario);
		
	}
	
	//En esta función pedimos al usuario que nos escriba la palabra "Piedra", "Papel" o "Tijeras"
	public static String pedirUsuario() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce (Piedra), (Papel) o (Tijera):");
		String txt1 = sc.nextLine();
		//Convertimos el texto en minuscula para que nos de igual si el usuario escribio en Mayusculas o minusculas
		txt1=txt1.toLowerCase();
		
		//Aqui devolvemos el texto unicamente si es "piedra","papel"o"tijera"
		if (txt1.equals("piedra") || txt1.equals("papel") || txt1.equals("tijera")) {
			return txt1;
		}else {
			System.err.println("Escribiste mal algunas de las opciones...");
			return pedirUsuario();
		}
		/*
		 * 
		 * 
		 */
		
	}
	//En esta funcón generamos la mano del Ordenador que elige un numero del 1 al 3 y segun el numero sera 1 mano = (1=piedra, 2=papel, 3=tijera)
	public static String generarManoOrdenador() {
		int NumOrdenador = (int)(Math.random()*3+1);
		String ManoOrdenador = "";
		
		if (NumOrdenador == 1) {
			ManoOrdenador = "piedra";
			return ManoOrdenador;
		} else if (NumOrdenador == 2) {
			ManoOrdenador = "papel";
			return ManoOrdenador;
		} else {
			ManoOrdenador = "tijera";
			return ManoOrdenador;
		}
	}
	//En esta función pedimos al usuario que eliga entre jugar contra el ordenador (1) y si es jugar contra un amigo (2)
	public static int elegirContricante() {
		System.out.println("Elige si quieres jugar contra el Ordenador o contra un amigo:");
		System.out.println("Escribe (1) si quieres vs EL ORDENADOR");
		System.out.println("Escribe (2) si quieres vs UN AMIGO");
		Scanner sc = new Scanner(System.in);
		String txt1 = sc.nextLine();
		
		//La condicional para que el usuario haya elegido 1 o 2 lo devuelve en caso contrario volver a llamar la función
		if (txt1.equals("1") || txt1.equals("2")) {
			int eleccion = Integer.parseInt(txt1);
			return eleccion;
		}else {
			System.err.println("Escribe 1 o 2 IDIOTA");
			return elegirContricante();
		}
		
	}
	//En esta función recogemos las 2 manos dadas y mostramos el resultado segun lo dado
	public static void partida(String Manocontricante, String ManoUsuario) {
		if (Manocontricante.equals(ManoUsuario)) {
			System.out.println("Tenemos un Empate!: tu has sacado "+ManoUsuario+" y el contricante saco "+Manocontricante);
		} else if ((Manocontricante.equals("piedra") && ManoUsuario.equals("papel")) || (Manocontricante.equals("papel") && ManoUsuario.equals("tijera")) || (Manocontricante.equals("tijera") && ManoUsuario.equals("piedra"))) {
			System.out.println("Has Ganado!: tu has sacado "+ManoUsuario+" y el contricante saco "+Manocontricante);
		}else {
			System.out.println("Has Perdido!: tu has sacado "+ManoUsuario+" y el contricante saco "+Manocontricante);
		}
	}

}
