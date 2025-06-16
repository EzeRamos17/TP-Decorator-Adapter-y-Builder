package ejercicio5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Participante {
    private final List<Concurso> concursos;
    private final RegistroInscripciones registro;
    private final ServicioEmail servicioEmail;
    private String nombre;
    private Integer puntos;

    public Participante(String nombre, RegistroInscripciones registro, ServicioEmail servicioEmail) {
        this.nombre = nombre;
        this.puntos = 0;
        this.concursos = new ArrayList<>();
        this.registro = registro;
        this.servicioEmail = servicioEmail;
    }

    public void inscribirseEn(Concurso concurso, LocalDate fechaInscripcion) {
        if (concurso.puedeInscribirse(fechaInscripcion)) {
            this.concursos.add(concurso);
            if (concurso.esPrimerDia(fechaInscripcion)) {
                this.puntos += concurso.obtenerPuntosPrimerDia();
            }
            registro.registrarInscripcion(LocalDateTime.now(), this.nombre, concurso.nombre());
            servicioEmail.enviar(nombre + "@email.com",
                    "Inscripción confirmada",
                    "Te has inscrito en el concurso: " + concurso.nombre());
            System.out.println(nombre + " se ha inscrito en el concurso " + concurso.nombre());
        } else {
            throw new RuntimeException("No puedes inscribirte fuera del rango de inscripción.");
        }
    }

    public boolean tienePuntos(int cantidad) {
        return this.puntos == cantidad;
    }

    public boolean estaInscriptoEn(Concurso concurso) {
        return concursos.contains(concurso);
    }
}
