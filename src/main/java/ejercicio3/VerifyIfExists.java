package ejercicio3;

import java.io.File;

public class VerifyIfExists extends ReportDecorator {

    public VerifyIfExists(Report report) {
        super(report);
    }

    @Override
    public void export(File file) {
        if (file.exists()) {
            throw new IllegalArgumentException("El archivo ya existe...");
        }
        super.export(file);
    }
} 