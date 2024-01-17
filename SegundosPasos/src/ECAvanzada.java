
public class ECAvanzada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Si realizamos un if sin corchetes recorrera solo 1 linea
		if (5==5)
			System.out.println("a");
		else
			System.out.println("b");
		
		
		System.out.println("---------");
		
		int [] array = new int[5];
		array[0]=1;
		array[1]=2;
		array[2]=3;
		array[3]=4;
		array[4]=5;
				
		
		for (int i=0; i<array.length;i++) {
			System.out.print(array[i]);
		}
		System.out.println("\n---------");
		//recorrer array de forma completa solo de forma ascendente
		for(int aux: array) {
			System.out.print(aux+" ");
		}
		System.out.println();
		String txt="hola buenas dias";
		for (char t:txt.toCharArray()) {
			System.out.print(t);
		}
		
		System.out.println("\n---------");
		//Condicional rapidas
		int x=3;
		String resultado = (x%2==0)? (x>5)? "ES PAR Y MAYOR QUE 5": "ES PAR Y MENOR QUE 5" :(x>5)?  "ES IMPAR y mayor que 5" : "ES IMPAR y menor que 5";
		System.out.println(resultado);

	}

}
