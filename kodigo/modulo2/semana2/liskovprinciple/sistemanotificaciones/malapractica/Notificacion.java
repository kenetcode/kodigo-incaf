package kodigo.modulo2.semana2.liskovprinciple.sistemanotificaciones.malapractica;
//Esta es la clase padre
public class Notificacion {
    public void enviar(String mensaje){
        System.out.println("Enviando notificacion " + mensaje);
    }
}
