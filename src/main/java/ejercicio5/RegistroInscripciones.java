package ejercicio5;

import java.time.LocalDateTime;

public interface RegistroInscripciones {
    void registrarInscripcion(LocalDateTime fechaHora, String idParticipante, String idConcurso);
}
