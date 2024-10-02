package kodigo.modulo2.semana2.openclosedprinciple.abstractclass.calculadoraimpuestos;

public class ImpuestoImportado extends Impuesto{

    @Override
    public void calcularImpuesto(double precio) {
        double impuesto = precio * 0.25;
        System.out.println("Impuesto importado");
        System.out.println("El impuesto del producto con precio de $" + precio + " es de $" + impuesto + " y un total con impuesto incluido de $" + (precio+impuesto));

    }
}
