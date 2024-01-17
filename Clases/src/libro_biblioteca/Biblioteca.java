package libro_biblioteca;

import java.util.List;

public class Biblioteca {
	
	/*
	 Crear una clase llamada "Biblioteca"
		Funciones (métodos):
			Constructor: Un constructor que acepte un parámetro, el nombre de la biblioteca (cadena de caracteres), y lo utilice para inicializar el atributo de la clase.
			Método "agregarLibro": Un método llamado "agregarLibro" que acepte un objeto de tipo "Libro" como parámetro y
			 	lo agregue a una lista de libros disponibles en la biblioteca.
			Método "prestarLibro": Un método llamado "prestarLibro" que acepte el título de un libro (cadena de caracteres)
			 	como parámetro y verifique si el libro está en la lista de libros disponibles. 
			 	Si está disponible, se marca como prestado y se elimina de la lista de libros disponibles.
			Método "devolverLibro": Un método llamado "devolverLibro" que acepte el título de un libro (cadena de caracteres) 
				como parámetro y verifique si el libro está marcado como prestado. Si es así, se marca como disponible y
				se agrega a la lista de libros disponibles.
			Método "listarLibrosDisponibles": Un método llamado "listarLibrosDisponibles" que no tome ningún parámetro y
				muestre en la consola la lista de libros disponibles en la biblioteca.
			Método "listarLibrosPrestados": Un método llamado "listarLibrosPrestados" que no tome ningún parámetro y 
				 muestre en la consola la lista de libros prestados en la biblioteca.
			Métodos getters y setters de todos los atributos que lo necesiten
		Atributos:
			Un atributo llamado "nombreBiblioteca" de tipo String para almacenar el nombre de la biblioteca.
			Una lista de libros disponibles.
			Una lista de libros prestados.
			
	*/
	
	//atributos:
	private String nombre;
	private List<Libro> libros;
	private List<Libro> librosPrestados;
	
	//constructor
	public Biblioteca(String nombre,List<Libro> libros,List<Libro> librosPrestados) {
		this.nombre = nombre;
		this.libros = libros;
		this.librosPrestados = librosPrestados;
	}
	
	//metodos
	public void agregarLibro(Libro libro) {
		this.libros.add(libro);
	}
	
	public void prestarLibro(String titulo) {
		for(Libro libro: this.libros) {
			if(libro.getTitulo().equals(titulo)) {
				this.librosPrestados.add(libro);
				System.out.println("Libro Prestado!");
			}
		}
	}	
	
	public void devolverLibro(String titulo) {
		for(Libro libro: this.librosPrestados) {
			if(libro.getTitulo().equals(titulo)) {
				this.librosPrestados.remove(libro);
				System.out.println("Libro Devuelto!");
			}
		}
	}	
	
	public void listarLibrosDisponibles() {
		for(Libro libro: this.libros) {
			System.out.println("---------------------"
					+ "\n Libro:"
					+ "\n Titulo: "+libro.getTitulo());
		}
	}	
	
	public void listarLibrosPrestados() {
		for(Libro libro: this.librosPrestados) {
			System.out.println("---------------------"
					+ "\n Libro Prestado:"
					+ "\n Titulo: "+libro.getTitulo());
		}
		
	}	
	
	//getters and setters:
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Libro> getLibros() {
		return libros;
	}
	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}
	public List<Libro> getLibrosPrestados() {
		return librosPrestados;
	}
	public void setLibrosPrestados(List<Libro> librosPrestados) {
		this.librosPrestados = librosPrestados;
	}
}
