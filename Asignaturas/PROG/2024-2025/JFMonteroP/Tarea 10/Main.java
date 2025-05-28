package Tarea_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<Libro> libros = new ArrayList<>();
    private static final String ARCHIVO = "src/libros.txt";
    
    public static void main(String[] args) {
        // Cargar libros al iniciar
        cargarLibros();
        
        // Crear ventana principal
        JFrame frame = new JFrame("Gestor de Libros");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500); // Aumenté el tamaño para mejor visualización
        
        // Panel principal
        JPanel panel = new JPanel(new BorderLayout());
        
        // Área de texto para mostrar libros
        JTextArea areaTexto = new JTextArea();
        areaTexto.setEditable(false);
        JScrollPane scroll = new JScrollPane(areaTexto);
        
        // Panel de botones
        JPanel panelBotones = new JPanel(new GridLayout(1, 3));
        
        // Botón para agregar libro
        JButton btnAgregar = new JButton("Agregar Libro");
        btnAgregar.addActionListener((ActionEvent e) -> {
            String isbn = JOptionPane.showInputDialog("ISBN del libro:");
            String titulo = JOptionPane.showInputDialog("Título del libro:");
            String autor = JOptionPane.showInputDialog("Autor del libro:");
            String genero = JOptionPane.showInputDialog("Género del libro:");
            String numPaginasStr = JOptionPane.showInputDialog("Número de páginas:");
            
            // Validar que todos los campos estén completos
            if (isbn != null && !isbn.isEmpty() && 
                titulo != null && !titulo.isEmpty() && 
                autor != null && !autor.isEmpty() &&
                genero != null && !genero.isEmpty() &&
                numPaginasStr != null && !numPaginasStr.isEmpty()) {
                
                try {
                    int numPaginas = Integer.parseInt(numPaginasStr);
                    
                    // Verificar si el ISBN ya existe
                    boolean existe = false;
                    for (Libro l : libros) {
                        if (l.getIsbn().equals(isbn)) {
                            existe = true;
                            break;
                        }
                    }
                    
                    if (!existe) {
                        libros.add(new Libro(isbn, titulo, autor, genero, numPaginas));
                        guardarLibros();
                        actualizarAreaTexto(areaTexto);
                    } else {
                        JOptionPane.showMessageDialog(frame, 
                            "El ISBN ya existe", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, 
                        "El número de páginas debe ser un valor numérico", 
                        "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(frame, 
                    "Todos los campos son obligatorios", "Error", JOptionPane.WARNING_MESSAGE);
            }
        });
        
        // Botón para leer libro
        JButton btnLeer = new JButton("Leer Libro");
        btnLeer.addActionListener((ActionEvent e) -> {
            if (libros.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "No hay libros disponibles");
                return;
            }
            
            String[] opciones = new String[libros.size()];
            for (int i = 0; i < libros.size(); i++) {
                opciones[i] = libros.get(i).toString();
            }
            
            String seleccion = (String) JOptionPane.showInputDialog(
                frame, 
                "Seleccione un libro para leer:", 
                "Leer Libro", 
                JOptionPane.PLAIN_MESSAGE, 
                null, 
                opciones, 
                opciones[0]);
            
            if (seleccion != null) {
                for (Libro libro : libros) {
                    if (seleccion.contains(libro.getTitulo())) {
                        libro.incrementarVecesLeido();
                        guardarLibros(); // Guardar después de modificar
                        JOptionPane.showMessageDialog(frame, 
                            "Has leído: " + libro.getTitulo() + 
                            "\nAutor: " + libro.getAutor() +
                            "\nGénero: " + libro.getGenero() +
                            "\nPáginas: " + libro.getNumPaginas() +
                            "\nTotal de lecturas: " + libro.getVecesLeido());
                        break;
                    }
                }
                actualizarAreaTexto(areaTexto);
            }
        });
        
        // Botón para mostrar libros
        JButton btnMostrar = new JButton("Mostrar Libros");
        btnMostrar.addActionListener((ActionEvent e) -> {
            actualizarAreaTexto(areaTexto);
        });
        
        // Añadir componentes
        panelBotones.add(btnAgregar);
        panelBotones.add(btnLeer);
        panelBotones.add(btnMostrar);
        
        panel.add(scroll, BorderLayout.CENTER);
        panel.add(panelBotones, BorderLayout.SOUTH);
        
        frame.add(panel);
        
        // Guardar al cerrar la ventana
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                guardarLibros();
            }
        });
        
        frame.setVisible(true);
        actualizarAreaTexto(areaTexto); // Mostrar libros al iniciar
    }
    
    private static void actualizarAreaTexto(JTextArea areaTexto) {
        StringBuilder sb = new StringBuilder();
        sb.append("=== LISTA DE LIBROS ===\n\n");
        
        if (libros.isEmpty()) {
            sb.append("No hay libros registrados");
        } else {
            for (Libro libro : libros) {
                sb.append(libro.toString()).append("\n\n");
            }
        }
        
        areaTexto.setText(sb.toString());
    }
    
    private static void cargarLibros() {
        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                libros.add(Libro.fromFileString(linea));
            }
        } catch (FileNotFoundException e) {
            // El archivo no existe aún, se creará al guardar
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, 
                "Error al leer el archivo: " + e.getMessage(), 
                "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, 
                "Error en el formato del archivo: " + e.getMessage(), 
                "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private static void guardarLibros() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO))) {
            for (Libro libro : libros) {
                writer.write(libro.toFileString());
                writer.newLine();
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, 
                "Error al guardar el archivo: " + e.getMessage(), 
                "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}