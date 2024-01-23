package House;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Atico atico = new Atico("CALLE ME VALE VERGA 33", 5, 33, 3);
		
		Cabaña cabaña = new Cabaña("SIN MIEDO AL EXITO", 6, 1500, true);
		
		Chalet chalet = new Chalet("Calle Plaza de Madrid 6", 77,110000, 20);
		
		atico.mostrarInformacion();
		System.out.println();
		
		cabaña.mostrarInformacion();
		System.out.println();
		
		chalet.mostrarInformacion();
		System.out.println();
	}

}
