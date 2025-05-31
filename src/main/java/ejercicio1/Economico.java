package ejercicio1;

public class Economico implements Motor {
    @Override
    public void arrancar() {
        System.out.println("Motor arrancando");
    }

    @Override
    public void acelerar() {
        System.out.println("Motor acelerando");
    }

    @Override
    public void apagar() {
        System.out.println("Motor apagado");
    }
}
