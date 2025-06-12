package videojuegos;

import java.sql.*;
import java.util.*;

public class VideojuegosDAO {
	
	public static void InsertarVideojuego(Videojuegos videojuegos) {
		
		String sql = "INSERT INTO juegos (Titulo, Plataforma, anio_lanzamiento, Compania, horas_jugadas) VALUES (?, ?, ?, ?, ?)";
		
		try (Connection conn = ConnectionDB.openConnection();
				PreparedStatement stmt = conn.prepareStatement(sql)) {
			
			stmt.setString(1, videojuegos.getTitulo());
			stmt.setString(2, videojuegos.getPlataforma());
			stmt.setInt(3, videojuegos.getanio_lanzamiento());
			stmt.setString(4, videojuegos.getCompania());
			stmt.setInt(5, videojuegos.gethoras_jugadas());
			stmt.executeUpdate();
			System.out.println("Videojuego insertado correctamente");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
	
	public static void actualizarHorasJugadas(String titulo, int horas_jugadas) {
		String sql = "UPDATE juegos SET horas_jugadas = ? WHERE titulo = ?";
		
		try (Connection conn = ConnectionDB.openConnection();
	             PreparedStatement stmt = conn.prepareStatement(sql)) {

				stmt.setInt(1, horas_jugadas);
				stmt.setString(2, titulo);
	            stmt.executeUpdate();

	                       
	            System.out.println("Horas actualizadas correctamente.");

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	}
	
	public static void eliminarJuego(String titulo) {
		
		String sql = "DELETE FROM juegos WHERE titulo = ?";
        try (Connection conn = ConnectionDB.openConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, titulo);
            stmt.executeUpdate();
            System.out.println("Videojuego eliminado correctamente.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
	
	public List<Videojuegos> listarTodosLosJuegos() {
		List<Videojuegos> videojuegos = new ArrayList<>();
		String sql = "SELECT * FROM juegos";
		
		try (Connection conn = ConnectionDB.openConnection();
	             Statement stmt = conn.createStatement();
	             ResultSet rs = stmt.executeQuery(sql)) {
			
			while (rs.next()) {
                String Titulo = rs.getString("Titulo");
                String Plataforma = rs.getString("Plataforma");
                int anio_lanzamiento = rs.getInt("anio_lanzamiento");
                String Compania = rs.getString("Compania");
                int horas_jugadas = rs.getInt("horas_jugadas");
                videojuegos.add(new Videojuegos(Titulo, Plataforma, anio_lanzamiento, Compania, horas_jugadas));
            }
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return videojuegos;
	}
	
	public List<Videojuegos> listarPorPlataforma(String plataforma){
		List<Videojuegos> videojuegos = new ArrayList<>();
		String sql = "SELECT * FROM juegos WHERE Plataforma = ?";
		
		try (Connection conn = ConnectionDB.openConnection();			
			PreparedStatement stmt = conn.prepareStatement(sql)){
			
			stmt.setString(1, plataforma);
				
			ResultSet rs = stmt.executeQuery();{
			while (rs.next()) {
				String Titulo = rs.getString("Titulo");
				int horas_jugadas = rs.getInt("horas_jugadas");
				String Plataforma = rs.getString("Plataforma");
				String Compania = rs.getString("Compania");
				int anio_lanzamiento = rs.getInt("anio_lanzamiento");
				videojuegos.add(new Videojuegos(Titulo, Plataforma, anio_lanzamiento, Compania, horas_jugadas));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return videojuegos;
	}

}
