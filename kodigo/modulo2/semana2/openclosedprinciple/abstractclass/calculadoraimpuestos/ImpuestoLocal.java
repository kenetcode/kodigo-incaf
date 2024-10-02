package kodigo.modulo2.semana2.openclosedprinciple.abstractclass.calculadoraimpuestos;

public class ImpuestoLocal extends Impuesto{

    @Override
    public void calcularImpuesto(double precio){
        double impuesto = precio * 0.15;
        System.out.println("Impuesto local");
        System.out.println("El impuesto del producto con precio de $" + precio + " es de $" + impuesto + " y un total con impuesto incluido de $" + (precio+impuesto));
    }
}
