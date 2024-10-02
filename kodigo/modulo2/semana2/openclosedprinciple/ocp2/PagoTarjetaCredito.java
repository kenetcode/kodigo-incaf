package kodigo.modulo2.semana2.openclosedprinciple.ocp2;

public class PagoTarjetaCredito extends MetodoPago{

    @Override
    public void procesarPagos(double monto) {
        System.out.println("Procesando pagos $" + monto + " por Tarjeta de Credito");
    }
}
