package kodigo.modulo2.semana2.openclosedprinciple.abstractclass.tarifastransporte;

public class TransporteTren extends Transporte{

    @Override
    public void calcularTarifa(double distancia) {
        //$5 por kilometro recorrido
        double tarifa = distancia * 5;
        System.out.println("Transporte Tren-----------------------");
        System.out.println("La tarifa tiene un costo de $" + tarifa);
    }
}
