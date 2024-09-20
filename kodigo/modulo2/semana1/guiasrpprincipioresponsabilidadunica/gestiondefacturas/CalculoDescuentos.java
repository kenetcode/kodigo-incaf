package kodigo.modulo2.semana1.guiasrpprincipioresponsabilidadunica.gestiondefacturas;

public class CalculoDescuentos {
    public void calcularDescuentos(Factura factura){
        int temp = 0;
        // Si el cliente es frecuente o si hay promoción se le hace un descuento del 10%
        if(factura.getClienteFrecuente().equals("Si") || factura.getPromocion().equals("Si")){
            // Se le descuenta el 10% al monto final
            double montoFinal = factura.getMontoFinal() - (factura.getMontoFinal() * 0.10);
            if(factura.getClienteFrecuente().equals("Si") && factura.getPromocion().equals("Si")) {
                System.out.println("Felicitaciones, querido cliente frecuente a obtenido una promocion de descuento del 10%");
                temp = 1;
            }
            if(factura.getClienteFrecuente().equals("Si") && temp == 0) {
                System.out.println("Felicitaciones, usted es un cliente frecuente y tiene un descuento del 10%");
            }
            if(factura.getPromocion().equals("Si") && temp == 0) {
                System.out.println("Felicitaciones, usted tiene un descuento del 10% por la promoción");
            }
            temp = 0;
            System.out.println("El monto total con descuentos es: $" + montoFinal);
        }
    }
}