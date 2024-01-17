
public class ejerciciosarrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arrayentero = {8,5,9,1,1,3};
		
		int[] arrayordenada = ordenararray(arrayentero);
		for (int i=0;i<arrayordenada.length;i++) {
			System.out.println(arrayordenada[i]);
		}
		
		

	}
	
	public static int[] ordenararray(int [] array) {
		//vamos ordenar una array de numeros
		int contador=0;
		for (int j=0;j<array.length-1;j++) {
			for (int i = 0;i<array.length-1;i++) {
				contador++;
				if (array[i]>array[i+1]) {
					int comparador = array[i];
					array[i]=array[i+1];
					array[i+1]=comparador;
				}
			}
			//funcion de comprobación
			if (comprobarordenacion(array)) {
				break;
			}
		}
		System.out.println("Ha dado "+contador+" vueltas");
		return array;
	}
		
		
	public static boolean comprobarordenacion (int[] arrayNums) {
		for (int i=0;i<arrayNums.length-1;i++) {
			if (arrayNums[i]>arrayNums[i+1]) {
				return false;
			}
		}
		return true;
	}

}
