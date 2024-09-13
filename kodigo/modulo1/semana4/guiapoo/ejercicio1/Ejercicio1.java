package kodigo.modulo1.semana4.guiapoo.ejercicio1;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Sistema de Vehiculos
        Auto auto = new Auto("Toyota", "Corolla", 20);
        Moto moto = new Moto("Yamaha", "R15", 45);
        moto.acelerar();
        auto.acelerar();
        System.out.println("Velocidad de la moto: " + moto.getVelocidad());
        System.out.println("La Velocidad del auto es: " + auto.getVelocidad());

    }
}
