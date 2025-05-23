package tarea_24_25_tiempo;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PrincipalVentana extends JFrame {
	 private ArrayList<Cancion> canciones;
	    private JTextArea textArea;
	    private final String fichero = "src/tarea_24_25:tiempo/canciones.txt";
	
	    private JMenuBar menu;
	    private JMenu opciones;
	    private JMenu salir;
	    private JMenuItem btnanadirCancion;
	    private JMenuItem btnmostrarCanciones;
	    private JMenuItem btnSalir;
	    
	    
	  public PrincipalVentana() {
	        canciones = new ArrayList<>();
	        configurarVentana();
	        configurarMenu();
	      configurarPanel();
	    }
	  private void configurarPanel() {
	        textArea = new JTextArea();
	        textArea.setEditable(false);
	        JScrollPane scrollPane = new JScrollPane(textArea);
	        add(scrollPane, BorderLayout.CENTER);
	    }
	    private void configurarVentana() {
	        setTitle("Gestor de Canciones");
	        setSize(600, 400);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null);
	        setLayout(new BorderLayout());
	    }

	private void configurarMenu() {
		
		menu = new JMenuBar();
		opciones = new JMenu("Opciones");
		salir = new JMenu("Salir");
		menu.add(opciones);
		menu.add(salir);
		 btnanadirCancion = new  JMenuItem("Añadir Canción") ;
		  btnmostrarCanciones = new  JMenuItem("Mostrar Canciones") ;
		   btnSalir = new  JMenuItem("Cerrar");
		   
		
		  btnSalir.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	System.exit(0);
	            }
	        });

		  btnanadirCancion.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	anadirCancion();
	            }
	        });
		  btnmostrarCanciones.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	mostrarCanciones();
	            }
	        });
		
		opciones.add(btnanadirCancion);
		opciones.add( btnmostrarCanciones);
		salir.add(btnSalir);
		
		setJMenuBar(menu);
	}
	
	
	
	 private void mostrarCanciones() {
		 StringBuilder sb = new StringBuilder();
	        if (canciones.isEmpty()) {
	            textArea.setText("No hay frases disponibles.\n");
	        } else {
	            for(Cancion n : canciones) {
	            	sb.append(n.toString());
	            	sb.append("\n");
	            }
	            textArea.setText(sb.toString());
	        }
	        
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrincipalVentana ventana = new PrincipalVentana();
		ventana.setVisible(true);
	}
	
	public void anadirCancion() {
		System.out.println("Dime el título de la canción que quieres añadir:");
		String titulo = JOptionPane.showInputDialog(this,"Título de la canción");
		
		int duracion =Integer.parseInt(JOptionPane.showInputDialog(this,"Dime la duración en segundos de la canción que quieres añadir:"));
		
		canciones.add(new Cancion(titulo, duracion));
		
		
		//c.add(new Cancion(t,d));
		//System.out.println("Canción " + t + " añadida correctamente");
				
	}
	
	

}
