package kodigo.modulo2.semana2.openclosedprinciple.ocp2;
//Aplicando SOLID con OCP
public class ServicioPago {
    public void procesarPago(MetodoPago metodoPago, double monto){
        metodoPago.procesarPagos(monto);
    }
}
