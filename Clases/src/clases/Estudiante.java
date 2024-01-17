package clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Estudiante {

	//atributos
	private String nombre;
	private int edad;
	private List<String> cursosinscritos;
	private Map<String, List<Double>> calificaciones;
	
	//constructor
	public Estudiante(String nombre,int edad,List<String> cursosinscritos,Map<String, List<Double>> calificaciones) {
		this.nombre = nombre;
		this.edad = edad;
		this.cursosinscritos = cursosinscritos;
		this.calificaciones = calificaciones;
	}
	
	//metodos:
	public void agregarCurso(String cursoNuevo) {
		this.cursosinscritos.add(cursoNuevo);
		
		calificaciones.put(cursoNuevo, new ArrayList<>());
	}
	//aaaaaaaaaaaaaaaaa
	public void agregarCalificacion(String curso, double calificacion) {
		if(calificaciones.containsKey(curso)) {
			calificaciones.get(curso).add(calificacion);
		}else {
			System.out.println("No existe ese curso");
		}
	}
	
	//asdadasdasasdasd
	
	
	public double promedioCalificaciones() {
		double promedio = 0;
		
		
		for(List<Double> c: calificaciones.values()) {
			double notas = 0;
			for(Double a: c) {
				notas += a;
			}
			double promedioNota = notas/c.size();
			promedio += promedioNota;
		}
		
		promedio = promedio/cursosinscritos.size();;
		return promedio;
	}
	
	
	//getters and setters
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	public List<String> getCursosinscritos() {
		return cursosinscritos;
	}
	public Map<String, List<Double>> getCalificaciones() {
		return calificaciones;
	}

	
}
