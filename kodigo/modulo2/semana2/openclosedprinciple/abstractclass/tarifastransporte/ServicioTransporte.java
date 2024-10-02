package kodigo.modulo2.semana2.openclosedprinciple.abstractclass.tarifastransporte;
//Aplicando principio SOLID OCP
public class ServicioTransporte {
    public void calcularTarifa(Transporte transporte, double distancia){
        transporte.calcularTarifa(distancia);
    }
}
