package kodigo.modulo2.semana2.openclosedprinciple.ocp2;

public class SistemaPago {
    public static void main(String[] args) {
        ServicioPago servicio = new ServicioPago();
        MetodoPago tarjeta = new PagoTarjetaCredito();
        MetodoPago paypal = new PagoPaypal();
        servicio.procesarPago(tarjeta,500);
        servicio.procesarPago(paypal,700);
    }
}
