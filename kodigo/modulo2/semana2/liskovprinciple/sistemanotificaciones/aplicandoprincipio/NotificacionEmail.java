package kodigo.modulo2.semana2.liskovprinciple.sistemanotificaciones.aplicandoprincipio;

public class NotificacionEmail extends Notificacion{

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando un Email: " + mensaje);
    }
}
