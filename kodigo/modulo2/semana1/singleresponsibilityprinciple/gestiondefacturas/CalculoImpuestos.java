package kodigo.modulo2.semana1.singleresponsibilityprinciple.gestiondefacturas;

public class CalculoImpuestos {
    public void calcularImpuestos(Factura factura){
        double montoFinal = (factura.getMontoTotal() * 0.20) + factura.getMontoTotal();
        factura.setMontoFinal(montoFinal);
        System.out.println("El monto total con impuestos es: $" + montoFinal);
    }
}
