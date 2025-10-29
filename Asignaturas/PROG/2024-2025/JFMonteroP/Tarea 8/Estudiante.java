package tarea08;

import java.util.*;

public class Estudiante {
	
		/*
		 * Variables de la clase
		 */
	
		private String dni;
		private String nombre;
		private ArrayList<Double> notasExamen;
		private ArrayList<Double> notasTareas;
		
		
		/*
		 * Constructores.
		 */
			public Estudiante(String dni, String nombre) {
			super();
			this.dni = dni;
			this.nombre = nombre;
			this.notasExamen = new ArrayList<>();
			this.notasTareas = new ArrayList<>();
		}
		
		
		
		/*
		 * MÉTODOS
		 */

		// Método añadir nota de examen.
		public void anadirNotaExamen(double nota) {
			notasExamen.add(nota);

		}
		
		//Método añadir nota de la Tarea.
		public void anadirNotaTarea(double nota) {
			notasTareas.add(nota);
		}
		
		
		//Método para calcular la media de los Examenes.
		public double calcularMediaExamenes() {
			if (notasExamen.isEmpty()) {
				return 0;
			}
			
			double suma = 0;
			
			for (double nota : notasExamen) { 
				suma += nota;
			}
			
			return suma / notasExamen.size();
		}
		
		
		//Método para calcular la media de las Tareas.
		public double calcularMediaTareas() {
			
			if (notasTareas.isEmpty()) return 0;
			
			double suma = 0;
			for (double nota : notasTareas) {
				suma += nota;
			}
			
			return suma / notasTareas.size();
			
		}
		
		
		//Método para calcular la nota media Total.
		public double calcularNotaMedia() {
			
			if (notasTareas.isEmpty() && notasExamen.isEmpty()) return 0;
			
			double examenes = calcularMediaExamenes()*0.75;
			double tareas = calcularMediaTareas()*0.25;
			double notaMedia = examenes+tareas;
			
			return notaMedia;

		}
		
		//Método para ordenar las tareas.
		
		public void ordenarNotasTarea(boolean ascendente) {
			
			if (ascendente) {
				Collections.sort(notasTareas);
			}
			else notasTareas.sort(Collections.reverseOrder());
			
		}
		
		//Método para ordenar los exámenes.
		
		public void ordenarNotasExamen(boolean ascendente) {
			
			if (ascendente) {
				Collections.sort(notasExamen);
			}
			else notasExamen.sort(Collections.reverseOrder());
		}
		
		public void mostrarNotas() {
			System.out.println("Notas de las Tareas: " + notasTareas);
			System.out.println("Notas de los Exámenes: " + notasExamen);
			
		}
		

		@Override
		public String toString() {
			return "\n ### Estudiante ### \n dni= " + dni + " nombre= " + nombre + "\n notas Examen= " + notasExamen + 
					", Nota Media Exámenes=" + calcularMediaExamenes()+ "\n notas Tareas= "		
					+ notasTareas  + ", Nota Media Tareas= " + calcularMediaTareas() + 
					"\n Nota Final= " + calcularNotaMedia() + "\n ###          ###";
		}
		
		
		/* 
		 * Getter y Setter.
		 */


		protected String getDni() {
			return dni;
		}


		protected void setDni(String dni) {
			this.dni = dni;
		}



		protected String getNombre() {
			return nombre;
		}



		protected void setNombre(String nombre) {
			this.nombre = nombre;
		}



		protected ArrayList<Double> getNotasExamen() {
			return notasExamen;
		}



		protected void setNotasExamen(ArrayList<Double> notasExamen) {
			this.notasExamen = notasExamen;
		}



		protected ArrayList<Double> getNotasTareas() {
			return notasTareas;
		}



		protected void setNotasTareas(ArrayList<Double> notasTareas) {
			this.notasTareas = notasTareas;
		}
				

}