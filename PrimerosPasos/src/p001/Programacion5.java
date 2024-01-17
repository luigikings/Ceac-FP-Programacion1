package p001;

public class Programacion5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		decirNombre("Andres",18);
		decirNombre("Luis",31);
		decirNombre("Maria",77);
		
		System.out.println("\n-------------------------------");
		System.out.print(areaRectangulo(5, 15));
		int rectanguloarea = areaRectangulo(5, 15);
		rectanguloarea++;
		System.out.print(rectanguloarea);
		System.out.print(numero());
		char asd = 'a';
		

	}
	
	public static void decirNombre(String nombre, int edad) {
		System.out.println("Hola buenos días: "+nombre+" y tengo: "+edad+" años");
		areaCuadrado(2);
	}
	
	public static void areaCuadrado(int lado) {
		System.out.println("El área del cuadrado es: "+lado*lado);
	}
	
	public static int areaRectangulo(int lado, int altura) {
		System.out.println();
		
		return lado*altura;
	}
	public static int numero() {
		return areaRectangulo(5, 15);
	}

}
