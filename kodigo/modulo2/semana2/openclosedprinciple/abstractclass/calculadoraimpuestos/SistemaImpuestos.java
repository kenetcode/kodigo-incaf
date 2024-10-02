package kodigo.modulo2.semana2.openclosedprinciple.abstractclass.calculadoraimpuestos;

public class SistemaImpuestos {
    public static void main(String[] args) {
        ServicioImpuestos servicio = new ServicioImpuestos();
        Impuesto impuestoLocal = new ImpuestoLocal();
        Impuesto impuestoImportado = new ImpuestoImportado();
        servicio.calcularImpuesto(impuestoImportado, 1000);
        servicio.calcularImpuesto(impuestoImportado,500);
    }
}
