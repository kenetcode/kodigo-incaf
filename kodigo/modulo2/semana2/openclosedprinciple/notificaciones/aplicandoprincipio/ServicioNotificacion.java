package kodigo.modulo2.semana2.openclosedprinciple.notificaciones.aplicandoprincipio;

//Clase ServicioNotificacion (Aplicando OCP)
public class ServicioNotificacion {
    public void notificarUsuario(Notificacion notificacion, String mensaje){
        notificacion.enviar(mensaje);
    }
}
