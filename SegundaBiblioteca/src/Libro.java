
public class Libro {

		// TODO Auto-generated constructor stub
		private String isbn;
		private String titulo;
		private String autor;
		private int publicacion;
		private int cantidad;
		
		//Contructor
		public Libro(String isbn,String titulo,String autor,int publicacion,int cantidad) {
			this.isbn = isbn;
			this.titulo = titulo;
			this.autor = autor;
			this.publicacion = publicacion;
			this.cantidad = cantidad;
		}
		
		//metodos
		public void agregarCopias(int stoc) {
			this.cantidad += stoc;
		}
		
		public void mostrarInfo(Libro libro) {
			System.out.println("INFORMACIÓN DEL LIBRO:"
					+"\nTitulo: "+this.titulo
					+"\nISBN: "+this.isbn
					+"\nAutor: "+this.autor
					+"\nPublicación: "+this.publicacion
					+"\nCantidad: "+this.cantidad
					);
		}
		
		//getters and setter
		
		public String getIsbn() {
			return isbn;
		}
		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public String getAutor() {
			return autor;
		}
		public void setAutor(String autor) {
			this.autor = autor;
		}
		public int getPublicacion() {
			return publicacion;
		}
		public void setPublicacion(int publicacion) {
			this.publicacion = publicacion;
		}
		public int getCantidad() {
			return cantidad;
		}
		public void setCantidad(int cantidad) {
			this.cantidad = cantidad;
		}

}
