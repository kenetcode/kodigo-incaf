package kodigo.modulo1.semana4.guiapoo.ejercicio1;

public class Auto extends Vehiculo {
    public Auto(String marca, String modelo, double velocidad) {
        super(marca, modelo, velocidad);
    }
    @Override
    public void acelerar(){
        setVelocidad(getVelocidad() + 10);
    }
}
