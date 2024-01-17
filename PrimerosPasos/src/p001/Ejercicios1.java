package p001;

public class Ejercicios1 {

	public static void main(String[] args) {
		
		//Convertir String a Int
		String txt="524";
		int numeroEntero = Integer.parseInt(txt);
		System.out.println(numeroEntero);
		System.out.println(txt);
		
		//Convertir String a Double
		String txt1="532.62";
		double numeroDouble = Double.parseDouble(txt1);
		System.out.println(numeroDouble);
		System.out.println(txt1);
		
		//Convertir Sting a Float
		String txt2="5562.72";
		float numeroFloat = Float.parseFloat(txt2);
		System.out.println(numeroFloat);
		System.out.println(txt2);
		
		//Convertir entero a double //IMPORTANTE
		int numeroDoubleToEntero =(int) numeroDouble;
		System.out.println(numeroDoubleToEntero);
		
		//Convertir numero a texto
		String txtNum=numeroDoubleToEntero+"";
		System.out.println(txtNum);
		
		//Convertir texto a boleano
		String b="TRUe";
		boolean boleano= Boolean.parseBoolean(b);
		System.out.println(boleano);
		
		
		
		// Ver valor maximo y minimo del INT
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		// Ver valor maximo y minimo del Double
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		
		
		//Actividad de dar 2 string y convertirlos en double y sumarlos
		System.out.println(sumaDeTexto("123.45","321"));
		
		//Actividad convertir 2 numeros a texto y sumarlos como tal
		System.out.println(concatenarNum(52,25));
		

	}
	
	public static double sumaDeTexto (String txt1, String txt2) {
		double sumaDouble = Double.parseDouble(txt2) + Double.parseDouble(txt1); 
		
		int totalEntero = (int) sumaDouble;
		
		System.out.println(sumaDouble);
		
		return totalEntero;
	}
	
	public static String concatenarNum(int n1,int n2) {
		
		String concatenadoNum1 = n1+"";
		String concatenadoNum2 = n2+"";
		
		String concatenadoTotal = "Resultado: "+concatenadoNum1+concatenadoNum2;
		return concatenadoTotal;
		
	}
	
	public static void tipoDeDouble(String n3) {
		double n3ToDouble = Double.parseDouble(n3); 
		if(n3ToDouble>Double.MAX_VALUE && n3ToDouble<Long.MAX_VALUE) {
			System.out.println("Se aconseja del tipo LONG");
		} else if (n3ToDouble<Short.MAX_VALUE && n3ToDouble>Short.MIN_VALUE) {
			System.out.println("Se aconseja del tipo SHORT");	
		} else {
			System.out.println("Se aconseja del tipo DOUBLE");
		}
	}

}
