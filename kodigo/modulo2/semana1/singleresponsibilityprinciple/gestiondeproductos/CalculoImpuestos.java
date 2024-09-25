package kodigo.modulo2.semana1.singleresponsibilityprinciple.gestiondeproductos;

public class CalculoImpuestos {
    double impuesto = 0.20;
    public void calcularImpuestos(Producto producto){
        //Calculo del impuesto
        double precioFinal = (producto.getPrecio() * impuesto) + producto.getPrecio();
        //Se imprime el precio final
        System.out.println("El precio final del producto " + producto.getNombre() + " es: " + precioFinal);
    }
}
