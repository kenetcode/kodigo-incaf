package kodigo.modulo1.semana4.guiapoo.ejercicio1;

public class Vehiculo {
    private String marca;
    private String modelo;
    private double velocidad;

    public Vehiculo(String marca, String modelo, double velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public double getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    public void acelerar(){
    }
}
