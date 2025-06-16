package ejercicio5;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class RegistroInscripcionesFake implements RegistroInscripciones {
    private final List<String> inscripciones = new ArrayList<>();

    @Override
    public void registrarInscripcion(LocalDateTime fechaHora, String idParticipante, String idConcurso) {
        // Simulamos el registro guardando la información en una lista
        String inscripcion = String.format("%s - %s - %s", fechaHora, idParticipante, idConcurso);
        inscripciones.add(inscripcion);
    }

    public List<String> getInscripciones() {
        return inscripciones;
    }

    public boolean contieneInscripcion(String idParticipante, String idConcurso) {
        return inscripciones.stream()
                .anyMatch(inscripcion -> inscripcion.contains(idParticipante) && inscripcion.contains(idConcurso));
    }
}
