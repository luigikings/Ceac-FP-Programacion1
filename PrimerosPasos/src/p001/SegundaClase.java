package p001;

public class SegundaClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * 
		 * 
		 * BUCLES
		 * 
		 * WHILE (condicion) {
		 * 
		 * }
		 * 
		 * DO{
		 * 
		 * } WHILE (condicion);
		 * 
		 * for (int i;condicion de i;i++) {
		 * 
		 * }
		 * 
		 */
		System.out.println("\nwhile:");
		int n1 = 0;
		while(n1 != 10) {
			System.out.println("La variable vale: "+n1);
			//n1=n1+1;
			//n1+=1;
			n1++;
		}
		
		System.out.println("\ndo while:");
		int n2 = 0;
		do {
			System.out.println("La variable vale: "+n2);
			n2++;
		} while(n2 != 10);
		
		System.out.println("\nfor:");
		for (int i = 0; i <= 5;i++) {
			System.out.println("La variable vale: "+i);
		}
		
		
		/*
		 * 
		 * ACTIVIDAD EN CLASE
		 * SUMAR 1+2+3+4+5+6+7+8+9=45
		 * 
		 * EN LOS 3 TIPOS DE BUCLE
		 * 
		 */
		System.out.println("\n----------------------------------------");
		
		//BUCLE FOR ACTIVIDAD
		System.out.println("\nfor ACTIVIDAD:");
		//variables
		int r1 = 0;
		//for
		for (int i = 0; i <= 10;i++) {
			r1 = r1 + i;
			System.out.print(i+"+");
		}
		//resultado
		System.out.println("  Resultado total= "+r1);
		
		
		
		//BUCLE WHILE ACTIVIDAD:
		System.out.println("\nwhile ACTIVIDAD:");
		//variables
		int suma =0;
		int i = 0;
		
		//while
		while (i <= 10) {
			suma = suma+i;
			System.out.print(i+"+");
			i++;
		}
		//resultado
		System.out.println("  Resultado total= "+suma);
		
		
		//BUCLE DO ACTIVIDAD:
		System.out.println("\ndo ACTIVIDAD");
		//variables
		int suma1=0;
		int i1 =0;
		
		//bucle do
		do {
			
			suma1= suma1+i1;
			System.out.print(i1+"+");
			i1++;
		}while (i1 <= 10);
		
		//resultado
		System.out.println("  Resultado total= "+suma1);
		
		
		/*
		 * 
		 * 
		 * BUCLES CON IF
		 * SUMATORIA DEL 1-10 SOLO NUMEROS PARES	
		 * 
		 * 
		 */
		
		
		//while
		//variables
				int suma2 =0;
				int i2 = 0;
				
				//while
				while (i2 <= 10) {
					if (i2 % 2 ==0) {
						suma2 = suma2+i;
						System.out.print(i2+"+");
						i2++;
					} else {
						i2++;
					}
				}
				//resultado
				System.out.println("  Resultado total= "+suma2);
		
	}

}
