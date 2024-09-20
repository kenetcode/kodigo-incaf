package kodigo.modulo2.semana1.guiasrpprincipioresponsabilidadunica.gestiondefacturas;

import java.util.ArrayList;
import java.util.List;

public class GestionFacturas {
    List<Factura> facturas = new ArrayList<>();
    CalculoImpuestos calculoImpuestos = new CalculoImpuestos();
    CalculoDescuentos calculoDescuentos = new CalculoDescuentos();
    public void agregarFactura(Factura factura){
        facturas.add(factura);
    }
    public void listarFacturas(){
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Listado de facturas");
        System.out.println("--------------------------------------------------------------------------");
        for(Factura factura : facturas){
            System.out.println(factura);
            calculoImpuestos.calcularImpuestos(factura);
            calculoDescuentos.calcularDescuentos(factura);
            System.out.println("--------------------------------------------------------------------------");
        }
    }
}
