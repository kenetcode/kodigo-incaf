package kodigo.modulo2.semana2.openclosedprinciple.abstractclass.calculadoraimpuestos;
//Aplicando Principio SOLID
public class ServicioImpuestos {
    public void calcularImpuesto(Impuesto impuesto, double precio){
        impuesto.calcularImpuesto(precio);
    }
}
