package Tarea_10;

import java.io.Serializable;

public class Libro implements Serializable {
    private String isbn;
    private String titulo;
    private String autor;
    private String genero;
    private int vecesLeido;
    private int numPaginas;

    public Libro(String isbn, String titulo, String autor, String genero, int numPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.numPaginas = numPaginas;
        this.vecesLeido = 0;
    }

    // Getters
    public String getIsbn() { return isbn; }
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public String getGenero() { return genero; }
    public int getVecesLeido() { return vecesLeido; }
    public int getNumPaginas() { return numPaginas; }
    
    public void incrementarVecesLeido() { vecesLeido++; }
    
    @Override
    public String toString() {
        return String.format("%s (%s) - Género: %s, Páginas: %d, Leído: %d veces", 
            titulo, autor, genero, numPaginas, vecesLeido);
    }
    
    // Formato para guardar en fichero
    public String toFileString() {
        return isbn + "," + titulo + "," + autor + "," + genero + "," + numPaginas + "," + vecesLeido;
    }
    
    // Método para crear Libro desde línea de fichero
    public static Libro fromFileString(String fileString) {
        String[] partes = fileString.split(",");
        Libro libro = new Libro(
            partes[0], 
            partes[1], 
            partes[2], 
            partes[3], 
            Integer.parseInt(partes[4])
        );
        libro.vecesLeido = Integer.parseInt(partes[5]);
        return libro;
    }
}