package kodigo.modulo2.semana2.openclosedprinciple.notificacionesdiferentescanales.aplicandoprincipio;

public class NotificacionEmail implements Notificacion{

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando Email: " + mensaje);
    }
}
