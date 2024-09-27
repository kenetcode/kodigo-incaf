package kodigo.modulo2.semana2.openclosedprinciple.notificacionesdiferentescanales.aplicandoprincipio;

public class SistemaNotificaciones {
    public static void main(String[] args) {

        ServicioNotificacion servicio = new ServicioNotificacion();

        //La interfaz notificacion, no puede ser instanciada, debe implementarla una clase que implemente
        //de interfaz, y debe hacerse como esta abajo.
        Notificacion email = new NotificacionEmail();
        Notificacion sms = new NotificacionSms();

        servicio.notificarUsuario(email,"Hola usuario. Este es un correo");
        servicio.notificarUsuario(sms,"Hola usuario. Este es un sms");

    }
}
