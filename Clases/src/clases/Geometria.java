package clases;

import java.util.Scanner;

public class Geometria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		Circulo circulo1 = new Circulo(sc.nextDouble());
		Rectangulo rectangulo1 = new Rectangulo(2, 6);
		
		
		System.out.println(String.format("%.2f",(circulo1.CalcularArea())));
		
		System.out.println(String.format("%.2f", rectangulo1.calcularArea()));
		System.out.println(String.format("%.2f", rectangulo1.calcularPerimetro()));
		
	}

}
