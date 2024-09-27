package kodigo.modulo2.semana2.openclosedprinciple.notificacionesdiferentescanales.aplicandoprincipio;

public class NotificacionSms implements Notificacion{

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviar SMS: " + mensaje);
    }
}
