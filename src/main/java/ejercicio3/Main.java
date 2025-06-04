package ejercicio3;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        var file1 = new File("D:\\Universidad 2025\\Orientación a Objetos II\\export.txt");
        var file2 = new File("D:\\Universidad 2025\\Orientación a Objetos II\\export2.txt");

        var r1 = new SimpleReport("mensaje parueba");
        r1.export(file1);

        var r2 = new SimpleReport("reporte2");
        r2.export(file2);


        var r3 = new SimpleReport("intento sobreescribir r2");
        r3.export(file2);

        var r4 = new VerifyIfExists(new SimpleReport("intento de sobreescribir r1"));
        r4.export(file1);
    }
} 