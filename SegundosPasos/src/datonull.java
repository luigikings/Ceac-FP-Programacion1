
public class datonull {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Inicializar variables a nada
		int n1;
		
		
		//Poner "null" o nada es lo mismo
		String txt=null;
		String txt1;
		
		
		//Funciones
		String txt2="hola buenos días";
		//Decir posicion del parametro dado
		System.out.println(txt2.indexOf("buenos"));
		
		//el contains te dice si tiene o no el parametro dado (true/false)
		System.out.println(txt2.contains(" "));
		
		//compara dandole igual si es mayuscula o minuscula
		System.out.println(txt2.equalsIgnoreCase("HOLa BuENoS DÍas"));
		
		//Separa en un array segun el parametro le demos
		txt2.split(" ");
		
		//Si usamos "" sin espacios separara carecter x caracter.
		String[] arraysplit =txt2.split(" ");
		for (int i = 0; i<arraysplit.length;i++) {
			System.out.println(arraysplit[i]);		
		}
		
		//funcion para ver si empieza con el parametro dado
		System.out.println(txt2.startsWith("hola"));
		
		//funcion para ver si termina con el parametro dado
		System.out.println(txt2.endsWith("días"));
		
		
	
		

	}

}
