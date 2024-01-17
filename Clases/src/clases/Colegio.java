package clases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Colegio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> cursos = new ArrayList<String>();
		
		List<Double> notas = new ArrayList<Double>();
		
		HashMap<String, List<Double>> mapa = new HashMap<String, List<Double>>();
		
		

		Estudiante deyby = new Estudiante("Deyby", 19,  cursos, mapa);
		deyby.agregarCurso("LM");
		deyby.agregarCalificacion("LM", 5);
		
		deyby.agregarCurso("BDD");
		deyby.agregarCalificacion("BDD", 6);
		
		System.out.println(deyby.promedioCalificaciones());
		
	}

}
