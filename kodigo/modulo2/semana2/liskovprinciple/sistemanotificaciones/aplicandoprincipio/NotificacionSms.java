package kodigo.modulo2.semana2.liskovprinciple.sistemanotificaciones.aplicandoprincipio;

public class NotificacionSms extends Notificacion{

    @Override
    public void enviar(String mensaje) {
        if(mensaje.length() > 160){
            System.out.println("El mensaje es demasiado largo");
        }
        System.out.println("Enviando SMS: " + mensaje);
    }
}
