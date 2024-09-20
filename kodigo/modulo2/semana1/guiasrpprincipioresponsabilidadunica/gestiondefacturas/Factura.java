package kodigo.modulo2.semana1.guiasrpprincipioresponsabilidadunica.gestiondefacturas;

public class Factura {
    private String numeroFactura;
    private  double montoTotal;
    private double montoFinal;
    private String cliente ;
    private String clienteFrecuente;
    private String promocion;

    public Factura(String numeroFactura, double montoTotal, String cliente, String clienteFrecuente, String promocion){
        this.numeroFactura = numeroFactura;
        this.montoTotal = montoTotal;
        this.cliente = cliente;
        this.clienteFrecuente = clienteFrecuente;
        this.promocion = promocion;
    }
    public Factura(){
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public String getClienteFrecuente() {
        return clienteFrecuente;
    }
    public void setClienteFrecuente(String clienteFrecuente) {
        this.clienteFrecuente = clienteFrecuente;
    }
    public String getPromocion() {
        return promocion;
    }
    public void setPromocion(String promocion) {
        this.promocion = promocion;
    }
    public double getMontoFinal() {
        return montoFinal;
    }
    public void setMontoFinal(double montoFinal) {
        this.montoFinal = montoFinal;
    }
    @Override
    public String toString(){
        return "Cliente: " + cliente + " | Numero de factura: " + numeroFactura + " | Monto Sin impuestos: $" + montoTotal;
    }
}
