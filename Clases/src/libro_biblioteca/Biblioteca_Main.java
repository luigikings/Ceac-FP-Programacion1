package libro_biblioteca;

import java.util.ArrayList;

public class Biblioteca_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Libro libro1 = new Libro("Rompecolchon", "Elver Galarga", 2024);
		Libro libro2 = new Libro("Tengo hambre", "Elgue Vito", 1994);
		Libro libro3 = new Libro("El Hacha", "El Deyson", 3033);
		Libro libro4 = new Libro("Salte", "Wisin y Yandel", 1769);
		
		
		
		Biblioteca biblioteca1 = new Biblioteca("Real Biblioteca Estatal de US", new ArrayList<Libro>(), new ArrayList<Libro>());
		
		biblioteca1.agregarLibro(libro1);
		biblioteca1.agregarLibro(libro2);
		biblioteca1.agregarLibro(libro3);
		biblioteca1.agregarLibro(libro4);
		
		biblioteca1.listarLibrosDisponibles();
		
		biblioteca1.prestarLibro("el guebo");
		
		biblioteca1.listarLibrosDisponibles();
		biblioteca1.listarLibrosPrestados();
		
		biblioteca1.prestarLibro("El Hacha");
		
		biblioteca1.listarLibrosPrestados();
		
		biblioteca1.prestarLibro("El Hacha");
		
		biblioteca1.listarLibrosPrestados();
		
	}

}
