package kodigo.modulo2.semana1.guiasrpprincipioresponsabilidadunica.gestiondeproductos;

public class EnvioNotificaciones {
    public void enviarNotificacion(Producto producto){
        System.out.println("Notificacion: Se calculo el precio final del producto " + producto.getNombre());
    }
}
