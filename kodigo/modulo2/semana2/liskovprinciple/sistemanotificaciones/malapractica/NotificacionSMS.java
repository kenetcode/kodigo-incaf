package kodigo.modulo2.semana2.liskovprinciple.sistemanotificaciones.malapractica;

public class NotificacionSMS extends Notificacion{
    @Override
    public void enviar(String mensaje){
        if(mensaje.length() > 20){
            System.out.println("El mensaje es demasiado largo para el SMS");
        }
        System.out.println("Enviando el SMS " + mensaje);
    }
}
