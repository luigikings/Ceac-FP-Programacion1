package p001;

public class Programacion3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//nos imprime en pantalla la posicion del caracter que este dentro del string empezando por 0
		//nombrestring.charAt(posicion del caracter);
		int nume1=0;
		 String txt= "HOLA BUENOS DIAS";
		 System.out.println(txt.charAt(3));

		//podemos crear un tipo char a partir del string anterior
		 char caracter= txt.charAt(1);
		 System.out.println(caracter);

		 //.length para contar el numero de caracteres
		 String txt1= "aaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbb";
		 System.out.println("El numero de caracteres del sring es:"+ txt.length());
		 System.out.println(txt.substring(5,11));

		//cambias a minisculas o mayusculas
		 String minusculas= txt.toLowerCase();		
		 System.out.println(txt.toLowerCase());

		 String txtMatusculas= txt.toUpperCase();
		 System.out.println(txt.toUpperCase());
		 
		 //Podemos remplazar caracteres de un string con esta funcion ademas podemos ponerr varias funciones en la misma linea
		 //como por ejemplo cambiar a minisculas
		 
		 String txtReemplazado= txt1.replace('a','z');
		 System.out.println(txtReemplazado);
		 System.out.println(txt.replace(' ', ' ').toUpperCase());
		 System.out.println(txt.replace("HOLA", "Adios").toUpperCase());
		 
		 //trim para quitar espacios al inicio y al final
		 String txt2="    Ho  la   ";
		 System.out.println("'"+txt2.trim()+"'");
		 
		 
		 //Comparar 2 strings!
		 String txt3="Hola";
		 String txt4="Hola";
		 
		 if (txt3.equals(txt4)) {
			 System.out.println("Los string son iguales");
		 } else {
			 System.out.println("Los string NO son iguales");
		 }
		 //para mostrar caracter por caracter de un string en un bucle
		 System.out.println("\nCARACTER POR CARACTER");
		 for (int i1=0;i1<txt.length();i1++) {
			 System.out.println(txt.charAt(i1));
		 }
		 
		 System.out.println("\nCARACTER POR CARACTER AL REVES");
		 for (int i2=txt.length()-1;i2>=0;i2--) {
			 System.out.println(txt.charAt(i2));
		 }
		 
		 
		 String txt7= "hola buenos dias";
		 System.out.println("\nSOLO LAS POSCIONES PARES");
		 for (int i3=0;i3<txt7.length();i3++) {
			 
			 if (i3%2==0) {
				 System.out.println("LETRA PAR:"+txt7.charAt(i3));
			 }else {
				 
			 }
		 }

		
			 
		 
		 
		 
	}

}
