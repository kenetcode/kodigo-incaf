package kodigo.modulo2.semana2.openclosedprinciple.notificaciones.aplicandoprincipio;

public class NotificacionSms implements Notificacion{

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviar SMS: " + mensaje);
    }
}
