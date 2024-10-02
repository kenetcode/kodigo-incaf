package kodigo.modulo2.semana2.openclosedprinciple.ocp2;

public class PagoPaypal extends MetodoPago{

    @Override
    public void procesarPagos(double monto) {
        System.out.println("Procesando pagos $" + monto + " por Paypal");
    }
}
