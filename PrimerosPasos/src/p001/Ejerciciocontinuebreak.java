package p001;

public class Ejerciciocontinuebreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Hay que hacer una funcion que saque valores enteros aleatorios y me diga
		//que en cuantos intentos ha nesecito para encontrar el 53
		
		int cont =1;
		
		while (numeroalazar()>-1) {
			cont++;
			if(numeroalazar()==53) {
				break;
			}
		}
		System.out.println("En "+cont+" intentos he encontrado el numero 53");
		
		
		valoressin4(1);

	}
	
	//Hacer una funcion que pida un valor
	//vamos a recorrer todos los valores desde el 1 hasta ese valor e imprimirlos por pantalla, ignorar aquellos valores que terminen en 4.
	
	
public static int numeroalazar() {
		
		return (int)(Math.random()*100+1);
		
	}

public static void valoressin4(int num1) {
	while (num1>0) {
		if (num1==4) {
			num1++;
			continue;
			
		}
		System.out.println(num1);
		num1++;
	}
}

}
