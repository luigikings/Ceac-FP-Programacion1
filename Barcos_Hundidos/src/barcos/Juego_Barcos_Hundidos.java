package barcos;

public class Juego_Barcos_Hundidos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Jugador jugador1 = new Jugador("Luis");
		Jugador jugador2 = new Jugador("Andrea");
		
		Tablero tablero1 = new Tablero(5,jugador1);
		Tablero tablero2 = new Tablero(5,jugador2);
		
		tablero1.generarBarcos(3);
		tablero2.generarBarcos(3);
		
		tablero1.generarTablero();
		tablero2.generarTablero();
		
		while(true) {
			tablero1.mostrarTablero();
			tablero2.mostrarTablero();
			
			tablero1.jugarJugador(jugador2);
			tablero1.comprobarTablero();
			if(tablero1.todoHundido) {
				System.out.println("El ganador/a es: "+tablero1.getJugador().getNombre());
				break;
			}
			
			tablero2.jugarJugador(jugador1);
			tablero2.comprobarTablero();
			if(tablero2.todoHundido){
				System.out.println("El ganador/a es: "+tablero2.getJugador().getNombre());
				break;
			}
		}
	}
}
