package ejercicio5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class RegistroInscripcionesDB implements RegistroInscripciones {
    private final ConnectionManager connectionManager;

    public RegistroInscripcionesDB() {
        this.connectionManager = new ConnectionManager();
    }

    // Constructor for testing
    public RegistroInscripcionesDB(ConnectionManager connectionManager) {
        this.connectionManager = connectionManager;
    }

    @Override
    public void registrarInscripcion(LocalDateTime fechaHora, String idParticipante, String idConcurso) {
        // Asumimos que idParticipante es el nombre completo y lo separamos en nombre y apellido
        String[] nombreCompleto = idParticipante.split(" ", 2);
        String apellido = nombreCompleto[0];
        String nombre = nombreCompleto.length > 1 ? nombreCompleto[1] : "";

        String sql = "INSERT INTO inscripto (apellido, nombre, telefono, email, id_concurso) VALUES (?, ?, ?, ?, ?)";
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = connectionManager.getConnection();
            stmt = conn.prepareStatement(sql);

            stmt.setString(1, apellido);
            stmt.setString(2, nombre);
            stmt.setString(3, "123456789");
            stmt.setString(4, "usuario@ejemplo.com");
            stmt.setString(5, idConcurso);
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error al registrar la inscripción en la base de datos", e);
        } finally {
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
