package kodigo.modulo2.semana2.openclosedprinciple.notificacionesdiferentescanales.malapractica;

public class ServicioNotificacion {
    public void notificarUsuario(String canal, String mensaje){
        if(canal.equals("email")){
            enviarEmail(mensaje);

        }else if(canal.equals("sms")){
            enviarSms(mensaje);
        }
    }

    //Se añaden nuevos canales de notificacion!!!
    //no deberia modificarse este codigo

    //Metodo para enviar email
    private void enviarEmail(String mensaje){
        System.out.println("Enviando email: " + mensaje);
    }

    //Metodo para enviar sms
    private void enviarSms(String mensaje){
        System.out.println("Enviando un SMS:" + mensaje);
    }
}
