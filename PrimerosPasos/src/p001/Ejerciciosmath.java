package p001;

public class Ejerciciosmath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ejercicio 1:
		System.out.println("El numero al azar es: "+numeroalazar());
		
		//Ejercicio 2:
		System.out.println("El valor de la hipotenusa es: "+hipotenusa(5,5));
		
		//Ejercicio 3:
		int[] arrayval = {1,24,4,90,66,77};
		valorsupeinf(arrayval);
		
		//Ejercicio 4:
		logartimo(10);
		
		//Ejercicio5:
		int[] vector1= {4,1};
		int[] vector2= {10,5};
		
		System.out.println("El angulo del vector 1 y vector 2 es: "+angulo2vectores(vector1,vector2));
		
		//Ejercicio6:
		System.out.println("El interes compuesto es: "+Interescompuesto(10,0.03,3,2));
	}
	
	public static int numeroalazar() {
		
		return (int)(Math.random()*10+1);
		
	}
	
	public static double hipotenusa(double a, double b) {
		return Math.hypot(a,b);
	}
	
	public static void valorsupeinf (int[] arrayvalores) {
		int valormax =arrayvalores[0];
		int valormin =arrayvalores[0];
		for (int i=0;i<arrayvalores.length;i++){
			valormax= Math.max(arrayvalores[i], valormax); 
			valormin= Math.min(arrayvalores[i], valormin); 

		}
		System.out.println("El valor mas alto de la array es: "+valormax +" y el valor mas bajo es: "+ valormin);
	}
	
	public static void logartimo(double numlog) {
		System.out.println("Logaritmo base E: " +Math.log(numlog));
		System.out.println("Logaritmo base 10: " +Math.log10(numlog));
		
		

	}
	
	public static double angulo2vectores(int[] vector1,int[]vector2) {
		return Math.toDegrees(Math.acos((vector1[0]*vector2[0]+vector1[1]*vector2[1])/((Math.sqrt(Math.pow(vector1[0], 2)+Math.pow(vector1[1], 2)))*(Math.sqrt(Math.pow(vector2[0], 2)+Math.pow(vector2[1], 2))))));
	}
	
	public static double Interescompuesto(double P,double r,int n, int t) {
		return P*Math.pow((1+(r/n)), n*t);
	}
}
