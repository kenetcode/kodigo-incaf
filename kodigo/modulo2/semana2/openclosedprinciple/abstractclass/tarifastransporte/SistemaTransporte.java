package kodigo.modulo2.semana2.openclosedprinciple.abstractclass.tarifastransporte;

public class SistemaTransporte {
    public static void main(String[] args) {
        ServicioTransporte servicio = new ServicioTransporte();
        Transporte transporteAutoBus = new TransporteAutobus();
        Transporte transporteTren = new TransporteTren();
        servicio.calcularTarifa(transporteAutoBus,10);
        servicio.calcularTarifa(transporteTren,100);
    }
}
