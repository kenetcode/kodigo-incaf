package kodigo.modulo2.semana2.openclosedprinciple.notificacionesdiferentescanales.malapractica;

public class SistemaNotificaciones {
    public static void main(String[] args) {

        ServicioNotificacion servicio = new ServicioNotificacion();
        servicio.notificarUsuario("email", "Hola usuario. Este es un correo electronico");
        servicio.notificarUsuario("sms", "Hola usuario. Este es un sms");

    }
}
