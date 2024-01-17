package p001;

public class Programacion6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//valor de PI
		System.out.println(Math.PI);
		
		//valor de E
		System.out.println(Math.E);
		
		//Valor absoluto 
		int n1 = -15;
		System.out.println(Math.abs(n1));
		
		//Raiz cuadrada
		int n2=25;
		System.out.println(Math.sqrt(n2));
		
		//Potencia
		int n3=10;
		System.out.println(Math.pow(n3, 3));
		
		//Seno, Coseno, Tangente ---- Pide radianes
		System.out.println(Math.sin(45));
		System.out.println(Math.cos(45));
		System.out.println(Math.tan(45));
		
		//Numero al azar ---- lo hace del 0 al 1 --- multiplicar para aumentar el rango
		System.out.println(Math.random()*10);
	}

}
