package kodigo.modulo2.semana2.liskovprinciple.sistemanotificaciones.aplicandoprincipio;

public class Main2{
    public static void main(String[] args) {
        Notificacion email = new NotificacionEmail();
        email.enviar("Hola, este es un correo");

        Notificacion sms = new NotificacionSms();
        sms.enviar("Este es un mensaje SMS corto");
        sms.enviar("Este es un mensaje SMS cortoEste es un mensaje SMS cortoEste es un mensaje SMS cortoEste es un mensaje SMS cortoEste es un mensaje SMS cortoEste es un mensaje SMS cortoEste es un mensaje SMS cortoEste es un mensaje SMS cortoEste es un mensaje SMS cortoEste es un mensaje SMS cortoEste es un mensaje SMS corto");
    }
}
