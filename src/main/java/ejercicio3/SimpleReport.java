package ejercicio3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class SimpleReport implements Report {
    private String reporte;

    public SimpleReport(String reporte) {
        this.reporte = reporte;
    }

    @Override
    public void export(File file) {
        if (file == null) {
            throw new IllegalArgumentException("File es NULL; no puedo exportar");
        }
        try {
            Files.write(
                    file.toPath(),
                    reporte.getBytes(),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING
            );
        } catch (IOException e) {
            throw new RuntimeException("Error al exportar mensaje al disco", e);
        }
    }
} 