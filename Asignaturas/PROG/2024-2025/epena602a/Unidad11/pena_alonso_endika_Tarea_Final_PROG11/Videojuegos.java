import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Videojuegos {

    public void insertarJuego(String titulo, String plataforma, int anioLanzamiento, String compania, int horasJugadas) {
        String sql = "INSERT INTO juegos (Titulo, Plataforma, anio_lanzamiento, Compañía, horas_jugadas) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = ConnectionDB.openConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, titulo);
            pstmt.setString(2, plataforma);
            pstmt.setInt(3, anioLanzamiento);
            pstmt.setString(4, compania);
            pstmt.setInt(5, horasJugadas);
            pstmt.executeUpdate();
            System.out.println("Juego insertado correctamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void actualizarHorasJugadas(String titulo, int horas) {
        String sql = "UPDATE juegos SET horas_jugadas = ? WHERE Titulo = ?";
        try (Connection conn = ConnectionDB.openConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, horas);
            pstmt.setString(2, titulo);
            int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Horas jugadas actualizadas correctamente.");
            } else {
                System.out.println("No se encontró el juego con el título proporcionado.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminarJuego(String titulo) {
        String sql = "DELETE FROM juegos WHERE Titulo = ?";
        try (Connection conn = ConnectionDB.openConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, titulo);
            int rowsDeleted = pstmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Juego eliminado correctamente.");
            } else {
                System.out.println("No se encontró el juego con el título proporcionado.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void listarTodosLosJuegos() {
        String sql = "SELECT * FROM juegos";
        try (Connection conn = ConnectionDB.openConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("juego_id") +
                                   ", Título: " + rs.getString("Titulo") +
                                   ", Plataforma: " + rs.getString("Plataforma") +
                                   ", Año de Lanzamiento: " + rs.getInt("anio_lanzamiento") +
                                   ", Compañía: " + rs.getString("Compañía") +
                                   ", Horas Jugadas: " + rs.getInt("horas_jugadas"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void listarPorPlataforma(String plataforma) {
        String sql = "SELECT * FROM juegos WHERE Plataforma = ?";
        try (Connection conn = ConnectionDB.openConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, plataforma);
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    System.out.println("ID: " + rs.getInt("juego_id") +
                                       ", Título: " + rs.getString("Titulo") +
                                       ", Plataforma: " + rs.getString("Plataforma") +
                                       ", Año de Lanzamiento: " + rs.getInt("anio_lanzamiento") +
                                       ", Compañía: " + rs.getString("Compañía") +
                                       ", Horas Jugadas: " + rs.getInt("horas_jugadas"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
