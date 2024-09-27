package kodigo.modulo2.semana2.openclosedprinciple.notificaciones.aplicandoprincipio;

public class NotificacionEmail implements Notificacion{

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando Email: " + mensaje);
    }
}
