package p001;

public class Ejercicios4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Con el break; salimos del codigo
		
		int i=0;
		while (i< 10) {
			if (i==5) {
				break;
			}
			System.out.println(i);
			i++;
			
		}
		
		i= 0;
		do {
			if (i==5) {
				break;
			}
			System.out.println(i);
			i++;
		} while(i<10);
		
		for (i = 0; i < 10; i++) {
			if (i==5) {
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("----------------------");
		//continue----- vuelve a repetir el bucle
		i=0;
		while (i< 10) {
			if (i==5) {
				i++;
				continue;
			}
			System.out.println(i+"WHILE");
			i++;
			
		}
		
		i= 0;
		do {
			if (i==5) {
				i++;
				continue;
			}
			System.out.println(i+"DO");
			i++;
		} while(i<10);
		
		for (i = 0; i < 10; i++) {
			if (i==5) {
				continue;
			}
			System.out.println(i+"FOR");
		}
		
		
		
	}

}
