package ejercicio3;

import java.io.File;

public class Report {
    private String reporte;


    public Report(String reporte) {
        this.reporte = reporte;
    }

    public void export(File file) {
        if (file == null) {
            throw new IllegalArgumentException("File es NULL; no puedo exportar");
        }
        if (file.exists()) {
            throw new IllegalArgumentException("El archivo ya existe...");
        }
    }

    // Exportar el reporte a un archivo.
}
