package kodigo.modulo2.semana2.liskovprinciple.sistemanotificaciones.malapractica;

public class Main {
    public static void main(String[] args) {
        Notificacion email = new NotificacionEmail();
        email.enviar("Hola, este es un correo");

        Notificacion sms = new NotificacionSMS();
        sms.enviar("Mensaje corto");
        sms.enviar("Este es un mensaje largo para las notificaciones sms y no cumple con el principio LSP");
    }
}
