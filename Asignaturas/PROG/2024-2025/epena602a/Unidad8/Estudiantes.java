import java.util.ArrayList;
import java.util.Collections;

class Estudiante {
    private String dni;
    private String nombre;
    private ArrayList<Double> notasExamen;
    private ArrayList<Double> notasTarea;
    
    public Estudiante(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.notasExamen = new ArrayList<>();
        this.notasTarea = new ArrayList<>();
    }
    
    public void añadirNotaExamen(double nota) {
        notasExamen.add(nota);
    }
    
    public void añadirNotaTarea(double nota) {
        notasTarea.add(nota);
    }
    
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
    
    public double calcularMediaTareas() {
        if (notasTarea.isEmpty()) {
            return 0;
        }
        double suma = 0;
        for (double nota : notasTarea) {
            suma += nota;
        }
        return suma / notasTarea.size();
    }
    
    // Calcula la nota final ponderada: 75% exámenes, 25% tareas
    public double calcularNotaMedia() {
        double mediaExamenes = calcularMediaExamenes();
        double mediaTareas = calcularMediaTareas();
        return mediaExamenes * 0.75 + mediaTareas * 0.25;
    }
    
    public void ordenarNotasExamen(boolean ascendente) {
        if (ascendente) {
            Collections.sort(notasExamen);
        } else {
            Collections.sort(notasExamen, Collections.reverseOrder());
        }
    }
    
    public void ordenarNotasTarea(boolean ascendente) {
        if (ascendente) {
            Collections.sort(notasTarea);
        } else {
            Collections.sort(notasTarea, Collections.reverseOrder());
        }
    }
    
    public void mostrarNotas() {
        System.out.println("Notas de Examen: " + notasExamen);
        System.out.println("Notas de Tarea: " + notasTarea);
    }
    
    @Override
    public String toString() {
        return "DNI: " + dni + ", Nombre: " + nombre + 
               ", Media Exámenes: " + String.format("%.2f", calcularMediaExamenes()) +
               ", Media Tareas: " + String.format("%.2f", calcularMediaTareas()) +
               ", Nota Final: " + String.format("%.2f", calcularNotaMedia());
    }
}