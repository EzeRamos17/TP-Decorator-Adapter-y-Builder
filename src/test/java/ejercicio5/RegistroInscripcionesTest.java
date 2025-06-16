package ejercicio5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RegistroInscripcionesTest {

    private RegistroInscripcionesFake registroFake;
    private RegistroInscripcionesEmailDecorator registroConEmail;

    @BeforeEach
    void setUp() {
        registroFake = new RegistroInscripcionesFake();
        registroConEmail = new RegistroInscripcionesEmailDecorator(registroFake);
    }

    @Test
    void testRegistroBase() {
        LocalDateTime fechaHora = LocalDateTime.now();
        String idParticipante = "Pérez Juan";
        String idConcurso = "1";

        registroFake.registrarInscripcion(fechaHora, idParticipante, idConcurso);

        assertTrue(registroFake.contieneInscripcion(idParticipante, idConcurso),
                "La inscripción debería estar registrada en el fake");
    }

    @Test
    void testRegistroConEmail() {
        LocalDateTime fechaHora = LocalDateTime.now();
        String idParticipante = "García María";
        String idConcurso = "1";

        registroConEmail.registrarInscripcion(fechaHora, idParticipante, idConcurso);

        assertTrue(registroFake.contieneInscripcion(idParticipante, idConcurso),
                "La inscripción debería estar registrada en el fake");
    }

    @Test
    void testRegistroEnPrimerDia() {
        LocalDateTime primerDia = LocalDateTime.of(2025, 4, 20, 10, 0);
        String idParticipante = "López Carlos";
        String idConcurso = "1";

        registroConEmail.registrarInscripcion(primerDia, idParticipante, idConcurso);

        assertTrue(registroFake.contieneInscripcion(idParticipante, idConcurso),
                "La inscripción del primer día debería estar registrada en el fake");
    }

    @Test
    void testDecoratorNoModificaRegistroBase() {
        LocalDateTime fechaHora = LocalDateTime.now();
        String idParticipante = "Pérez Juan";
        String idConcurso = "1";

        registroConEmail.registrarInscripcion(fechaHora, idParticipante, idConcurso);

        assertEquals(1, registroFake.getInscripciones().size(),
                "El decorator no debería modificar el comportamiento base del registro");
    }
} 