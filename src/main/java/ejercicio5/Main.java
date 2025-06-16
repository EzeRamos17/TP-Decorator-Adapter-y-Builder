package ejercicio5;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Concurso concurso = new Concurso(
                "Concurso Rock Nacional",
                LocalDate.of(2025, 4, 20),
                LocalDate.of(2025, 5, 20),
                10
        );

        // Crear el registro base (solo base de datos)
        RegistroInscripciones registroBase = new RegistroInscripcionesDB();

        // Crear el registro decorado con email
        RegistroInscripciones registroConEmail = new RegistroInscripcionesEmailDecorator(registroBase);

        try {
            System.out.println("Registrando participante sin email...");
            registroBase.registrarInscripcion(
                    LocalDateTime.now(),
                    "Pérez Juan",
                    "1"
            );

            System.out.println("\nRegistrando participante con email...");
            registroConEmail.registrarInscripcion(
                    LocalDateTime.now(),
                    "García María",
                    "1"
            );

            System.out.println("\nRegistrando participante en primer día...");
            LocalDateTime primerDia = LocalDateTime.of(2025, 4, 20, 10, 0);
            registroConEmail.registrarInscripcion(
                    primerDia,
                    "López Carlos",
                    "1"
            );

            System.out.println("\nTodas las inscripciones se realizaron correctamente.");
        } catch (Exception e) {
            System.out.println("Error durante las inscripciones: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
