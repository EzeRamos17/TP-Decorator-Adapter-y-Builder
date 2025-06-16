package ejercicio5;

import java.time.LocalDateTime;

public class RegistroInscripcionesEmailDecorator implements RegistroInscripciones {
    private final RegistroInscripciones registro;
    private final EmailService emailService;

    public RegistroInscripcionesEmailDecorator(RegistroInscripciones registro) {
        this(registro, new EmailService());
    }

    // Constructor para el testing
    public RegistroInscripcionesEmailDecorator(RegistroInscripciones registro, EmailService emailService) {
        this.registro = registro;
        this.emailService = emailService;
    }

    @Override
    public void registrarInscripcion(LocalDateTime fechaHora, String idParticipante, String idConcurso) {
        registro.registrarInscripcion(fechaHora, idParticipante, idConcurso);

        String asunto = "Inscripción confirmada";
        String cuerpo = "Hola " + idParticipante + ", te has inscrito en el concurso: " + idConcurso +
                " el día " + fechaHora.toLocalDate();
        emailService.enviarEmail("usuario@ejemplo.com", asunto, cuerpo);
    }
} 