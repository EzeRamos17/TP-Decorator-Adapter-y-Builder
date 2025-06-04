package ejercicio3;

import java.io.File;

public abstract class ReportDecorator implements Report {
    protected Report report;

    public ReportDecorator(Report report) {
        this.report = report;
    }

    @Override
    public void export(File file) {
        report.export(file);
    }
} 