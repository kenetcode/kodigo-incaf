package kodigo.modulo2.semana2.openclosedprinciple.abstractclass.tarifastransporte;

public class TransporteAutobus extends Transporte{

    @Override
    public void calcularTarifa(double distancia) {
        //$1.50 por kilometro recorrido
        double tarifa = distancia * 1.50;
        System.out.println("Transporte Autobus--------------------");
        System.out.println("La tarifa tiene un costo de $" + tarifa);
    }
}
