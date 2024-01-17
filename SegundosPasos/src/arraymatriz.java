
public class arraymatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matriz = new int[5][5];
		System.out.println("EJERCICIO 1:");
		System.out.println("");
		rellenarmatriz(matriz);
		System.out.println("---------------------------------------");

		int[][] matriz2 = new int[5][5];
		System.out.println("EJERCICIO 2:");
		System.out.println("");
		rellenardiagonal(matriz2);
		System.out.println("---------------------------------------");

		int[][] matriz3 = new int[5][5];
		System.out.println("EJERCICIO 3:");
		System.out.println("");
		sumarfilasycolumnas(matriz3);
	}

	//Funcion para rellenar una matriz del tamaño que sea
	public static void rellenarmatriz(int[][] matriz) {
		//recorremos la matriz
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				//en cada array rellenamos con 1 numero del 0-10 
				matriz[i][j] = (int) (Math.random() * 10);
				System.out.print(matriz[i][j] + " ");
			}
			//hacemos un salto de linea para mostrar el siguiente array
			System.out.println();
		}
	}
	
	//Funcion para rellenar una matriz pero rellenando con numeros desde la siguiente posicion a la diagonal
	public static void rellenardiagonal(int[][] matriz2) {
		//declaramos un entero para guardar la posicion a empezar
		int pos = 0;
		//En un bucle reccoremos la matriz empezando por la posicion 1 y despues de recorrerla sumar +1 a pos para la siguiente vez empieze en 1 posicion siguiente.
		for (int i = 0; i < matriz2.length; i++) {
			for (int j = 1 + pos; j < matriz2[i].length; j++) {
				matriz2[i][j] = (int) (Math.random() * 10);
			}
			pos++;
		}
		//Bucle para mostrar en pantalla la matrix
		for (int i = 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz2[i].length; j++) {
				System.out.print(matriz2[i][j] + " ");
			}
			System.out.println();
		}
	}

	//Hacemos una funcion para en un matriz sumar sus filas y columnas y mostrarlas
	public static void sumarfilasycolumnas(int [][] matriz3) {
		//declaramos variables para guardar la suma total de columna y fila
		int sumacolumna=0;
		int sumafila=0;
		
		//En un bucle recorremos para rellenar y en este mismo sumamos las filas que vamos haciendo
		for (int i=0;i<matriz3.length;i++) {
			sumafila=0;
			for (int j=0;j<matriz3[i].length;j++) {
				matriz3[i][j]=(int)(Math.random()*10);
				System.out.print(matriz3[i][j]+" ");
				int aux=matriz3[i][j];
				sumafila=aux+sumafila;
			}
		System.out.print(" = "+sumafila);
			
		System.out.println();
		
		}
		//Un bucle que coloque "=" por cada columna que haya 
		for(int i = 0;i<matriz3.length;i++){
			System.out.print("= ");
		}
		System.out.println("");

		//en este bucle invertimos las filas y las columnas y hacemos la suma de esa columna y las mostramos en pantalla
		for(int j = 0;j<matriz3.length;j++){
			for (int i = 0; i < matriz3[j].length; i++) {
				int aux = matriz3[i][j];
				sumacolumna = sumacolumna + aux;
			}
			System.out.print(sumacolumna + " ");
		}
}

}
