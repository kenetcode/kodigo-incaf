package kodigo.modulo2.semana1.singleresponsibilityprinciple.gestiondeproductos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Se crea una lista de productos
        List<Producto> productos = new ArrayList<>();
        //Se crea una instancia de la clase CalculoImpuestos
        CalculoImpuestos calculoImpuestos = new CalculoImpuestos();
        //Se crea una instancia de la clase EnvioNotificaciones
        EnvioNotificaciones envioNotificaciones = new EnvioNotificaciones();
        //Se agregan productos a la lista
        productos.add(new Producto("Laptop", 1000));
        productos.add(new Producto("Mouse", 20));
        productos.add(new Producto("Teclado", 50));
        productos.add(new Producto("Monitor", 200));
        //Se recorre la lista de productos
        for (Producto producto : productos) {
            System.out.println("Nombre del producto: " + producto.getNombre() + " | Precio sin impuestos: " + producto.getPrecio());
            calculoImpuestos.calcularImpuestos(producto);
            envioNotificaciones.enviarNotificacion(producto);
            System.out.println("-------------------------------------------------");
        }
    }
}
