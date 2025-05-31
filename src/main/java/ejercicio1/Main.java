package ejercicio1;

public class Main {
    public static void main(String[] args) {
        var mc = new Comun();
        mc.arrancar();

        var me = new Economico();
        me.arrancar();

        var mel = new MotorElectrico();
        var ma = new MotorAdapter(mel);
        ma.acelerar();
    }
}
