import java.util.Scanner;

public class Ejercicios7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanners
		
		//Creo el scanner sc
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número decimal");
		//pedimos al usuario un numero y lo guardamos
		float txt1 = sc.nextFloat();
		System.out.println("El número introducido es: "+txt1);
		sc.nextLine();
		System.out.println("Introduce un texto");
		String txt2 = sc.nextLine();
		System.out.println("El texto introducido es: "+txt2);

	}

}
