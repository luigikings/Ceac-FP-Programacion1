package barcos;

import java.util.ArrayList;
import java.util.List;

public class Tablero {

	//atributos:
	public List<List<Integer>> tabla;
	public int tamanio;
	public boolean todoHundido;
	public Jugador jugador;
	public List<Barco> barcos;
	
	
	public Tablero(int tamanio,Jugador jugador) {
		this.tabla = new ArrayList<List<Integer>>();
		this.tamanio = tamanio;
		this.todoHundido = false;
		this.jugador = jugador;
		this.barcos = new ArrayList<Barco>();
	}
	
	//metodos:
	
	public void generarTablero() {
		System.out.println("Generamos tablero");
		
		for(int i=1;i<=this.tamanio;i++) {
			List<Integer> fila = new ArrayList<Integer>();
			for(int j=1; j<=this.tamanio;j++) {
				fila.add(0);
			}
			this.tabla.add(fila);
		}
		
		for(Barco barco: this.barcos) {
			System.out.println(barco.getPosX());
			int posX = barco.getPosX();
			int posY = barco.getPosY();
			
			List<Integer> fila = this.tabla.get(posX);
			if(fila.get(posY)==4) {
				barco.generarPos(tamanio);
				continue;
			}
			fila.set(posY, 4);
		}
		
	}
	
	public void generarBarcos(int cantBarcos) {
		if((this.tamanio*this.tamanio)<cantBarcos) {
			
		}else {
			for(int i=0;i<cantBarcos;i++) {
				Barco barco = new Barco();
				barco.generarPos(this.tamanio);
				this.barcos.add(barco);
			}
		}
		
		
	}
	
	public void mostrarTablero() {
		System.out.println("Mostramos tablero");
		for(int i=0;i<this.tabla.size();i++) {
			List<Integer> fila = this.tabla.get(i);
			for(int j=0; j<fila.size();j++) {
				if(fila.get(j)==0) {
					System.out.print("~ ");
				} else if(fila.get(j)==4) {
					System.out.print("O ");
				} else {
					System.out.print("X ");
				}
			}
			System.out.println();
		}
	}
	
	public void jugarJugador(Jugador jugador) {
		jugador.elegirJugada();
		int x = jugador.getEleccionX()-1;
		int y = jugador.getEleccionY()-1;
		
		List<Integer> fila = this.tabla.get(y);
		if(fila.get(x)==4) {
			fila.set(x, 7);
			System.out.println("Acerto!");
		}else {
			System.out.println("Fallo!");
		}
		
	}
	
	public void comprobarTablero() {
		for(int i=0;i<this.tabla.size();i++) {
			List<Integer> fila = this.tabla.get(i);
			for(int j=0; j<fila.size();j++) {
				if(fila.get(j)==4) {
					return;
				}
			}
		}
		this.todoHundido=true;
	}

	public List<List<Integer>> getTabla() {
		return tabla;
	}

	public void setTabla(List<List<Integer>> tabla) {
		this.tabla = tabla;
	}

	public int getTamanio() {
		return tamanio;
	}

	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}

	public boolean isTodoHundido() {
		return todoHundido;
	}

	public void setTodoHundido(boolean todoHundido) {
		this.todoHundido = todoHundido;
	}

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public List<Barco> getBarcos() {
		return barcos;
	}

	public void setBarcos(List<Barco> barcos) {
		this.barcos = barcos;
	}

}