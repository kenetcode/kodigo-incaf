package kodigo.modulo2.semana2.liskovprinciple.sistemanotificaciones.malapractica;

public class NotificacionEmail extends Notificacion{
    @Override
    public void enviar(String mensaje){
        System.out.println("Enviando Email " + mensaje);
    }

    //Expextativa del padre es que siempre se ejecute una notificacion!!!
}
