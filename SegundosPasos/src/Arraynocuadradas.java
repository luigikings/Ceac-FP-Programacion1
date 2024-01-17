
public class Arraynocuadradas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * Declaramos una variable con numeros fijos
		 * y vemos que se puede declarar de distintos tamaños
		 * (mostramos por pantalla)
		 */
		int[][] multi = new int[][]{
			  { 1, 2 },
			  { 1, 2, 3 },
			  { 1 },
			  { 1, 2, 3 },
			  { 1 }
			};
			
			System.out.println("/////////////////////////////////////////////////////////////");
			for (int i=0;i<multi.length;i++) {
				for (int j=0;j<multi[i].length;j++) {
					System.out.print(multi[i][j]+" ");
				}
				System.out.println();
			}
		System.out.println();
		System.out.println("-------------------------");
		System.out.println();
		
		/*
		 * Ahora declaramos una matriz de 5 array de enteros
		 * pero cada array no declaramos su tamaño
		 * dentro de un bucle generamos un numero del 1 - 10 para colocar la capacidad de cada array
		 * de manera que sean de distinto tamaño
		 */
			
		int[][] bidimensional=new int[5][];
		int[] array1= new int [0];
		
		for(int i=0;i<bidimensional.length;i++) {
			//Aqui para declarar la capacidad de cada array
			array1=new int [(int)(Math.random() * 10+1)];
			bidimensional[i]= array1;
		}
		
		for (int i=0;i<bidimensional.length;i++) {
			for (int j=0;j<bidimensional[i].length;j++) {
				//Aqui llenamos la array de numeros del 1 - 10 y mostramos por pantalla cada array
				bidimensional[i][j]=(int)(Math.random() * 10+1);
				System.out.print(bidimensional[i][j]+" ");
			}
			System.out.println();
		}
	}

}
