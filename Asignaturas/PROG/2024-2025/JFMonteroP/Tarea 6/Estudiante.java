import java.util.Arrays;

public class Estudiante {
	
		/*
		 * Variables de la clase
		 */
	
		private String dni;
		private String nombre;
		private double[] notasExamen = new double[10];
		private double[] notasTareas = new double[10];
		private int indiceExamen = 0;
		private int indiceTarea = 0;
		private double mediaTareas;
		private double mediaExamen;
		
		
		/*
		 * Constructores.
		 */
		
		public Estudiante(String dni, String nombre) {
			super();
			this.dni = dni;
			this.nombre = nombre;
			this.notasExamen = notasExamen;
			this.notasTareas = notasTareas;
			this.indiceExamen = indiceExamen;
			this.indiceTarea = indiceTarea;
			this.mediaTareas = mediaTareas;
			this.mediaExamen = mediaExamen;
		}
		
		
		public Estudiante() {
			super();
			this.dni = dni;
			this.nombre = nombre;
		}
		
		
		
		/*
		 * MÉTODOS
		 */
		
		// Método añadir nota de examen.
		public void anadirNotaExamen(double notaExamen) {
			if (indiceExamen < notasExamen.length) {
				notasExamen[indiceExamen] = notaExamen;
				indiceExamen++;
			}
			else System.out.println("Se ha excedido el número máximo de notas.");
		}
		
		//Método añadir nota de la Tarea.
		public void anadirNotaTarea(double notaTarea) {
			if (indiceTarea < notasTareas.length) {
				notasTareas[indiceTarea] = notaTarea;
				indiceTarea++;
			}
			else System.out.println("Se ha excedido el número máximo de notas.");
		}
		
		
		//Método para calcular la media de los Examenes.
		public double calcularMediaExamenes() {
			if (indiceExamen == 0) {
				return 0;
			}
			
			double sumaEx = 0;
				for (int i=0; i<indiceExamen; i++) {
					sumaEx += notasExamen[i];					
			}
			mediaExamen = (sumaEx/indiceExamen);
			return mediaExamen;
		}
		
		
		//Método para calcular la media de las Tareas.
		public double calcularMediaTareas() {
			if (indiceTarea == 0) {
				return 0;
			}
			double sumaTarea = 0;
		
				for (int i = 0; i < indiceTarea; i++) {
					sumaTarea += notasTareas[i];
				}
				mediaTareas = (sumaTarea/indiceTarea);
				return mediaTareas;
		}
		
		
		//Método para calcular la nota media Total.
		public double calcularNotaMedia() {
			if (notasTareas.length != 0 && notasExamen.length != 0) {
				double notaFinal;
				notaFinal = ((mediaTareas * 0.25) + (mediaExamen * 0.75));
				return Math.round(notaFinal);
			}
			return 0;
		}
		
		
		@Override

		public String toString() {
			return "## Estudiante ## \n - dni=" + dni + "\n - nombre=" + nombre + "\n - notasExamen=" + Arrays.toString(notasExamen)
					+ "\n - notasTareas=" + Arrays.toString(notasTareas) + "\n - mediaTareas=" + mediaTareas + "\n - mediaExamen=" + mediaExamen;
		}
		
		
		/* 
		 * Getter y Setter.
		 */
		
		public String getDni() {
			return dni;
		}
		

		public void setDni(String dni) {
			this.dni = dni;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public double[] getNotasExamen() {
			return notasExamen;
		}
		public void setNotasExamen(double[] notasExamen) {
			this.notasExamen = notasExamen;
		}
		public double[] getNotasTareas() {
			return notasTareas;
		}
		public void setNotasTareas(double[] notasTareas) {
			this.notasTareas = notasTareas;
		}
		public int getIndiceExamen() {
			return indiceExamen;
		}
		public void setIndiceExamen(int indiceExamen) {
			this.indiceExamen = indiceExamen;
		}
		public int getIndiceTarea() {
			return indiceTarea;
		}
		public void setIndiceTarea(int indiceTarea) {
			this.indiceTarea = indiceTarea;
		}
		public double getMediaTareas() {
			return mediaTareas;
		}
		public void setMediaTareas(double mediaTareas) {
			this.mediaTareas = mediaTareas;
		}
		public double getMediaExamen() {
			return mediaExamen;
		}
		public void setMediaExamen(double mediaExamen) {
			this.mediaExamen = mediaExamen;
		}
		

}
