
public class Crearmatriz12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matriz1 = new int [5][5];
		mostrarmatriz(matriz1);
		

	}
	
	public static void mostrarmatriz (int [][] matriz) {
		
		for (int[] aux:matriz) {
			for (int aux1:aux) {
				System.out.print(aux1+" ");
			}
			System.out.println();
		}
	}
}
