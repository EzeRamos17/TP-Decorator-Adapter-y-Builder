package ejercicio1;

public class MotorAdapter implements Motor {
    private final MotorElectrico motorElectrico;

    public MotorAdapter(MotorElectrico motorElectrico) {
        this.motorElectrico = motorElectrico;
    }


    @Override
    public void arrancar() {
        this.motorElectrico.conectar();
        this.motorElectrico.activar();
    }

    @Override
    public void acelerar() {
        this.motorElectrico.moverMasRapido();
    }

    @Override
    public void apagar() {
        this.motorElectrico.detener();
        this.motorElectrico.desconectar();
    }
}
