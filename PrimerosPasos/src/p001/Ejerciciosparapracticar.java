package p001;

public class Ejerciciosparapracticar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Sacar palabras de una frase
		String txt="Hola como estas";
		char espacio=' ';
		int numPalabras = 1;
		
		for(int i=0;i<txt.length();i++) {
			if(txt.charAt(i)==espacio) {
				numPalabras=numPalabras+1;
			}
		}
		
		System.out.println("El numero de palabras es: "+numPalabras);
	}

}
