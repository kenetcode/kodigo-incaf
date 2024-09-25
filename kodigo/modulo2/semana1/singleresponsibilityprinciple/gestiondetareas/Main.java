package kodigo.modulo2.semana1.singleresponsibilityprinciple.gestiondetareas;

public class Main {
    public static void main(String[] args) {
        GestionTareas gestionTareas = new GestionTareas();
        GeneracionReportes generacionReportes = new GeneracionReportes();
        Tarea tarea1 = new Tarea("Hacer las compras");
        Tarea tarea2 = new Tarea("Estudiar Java");
        Tarea tarea3 = new Tarea("Hacer ejercicio");
        Tarea tarea4 = new Tarea("Preparar la cena");
        Tarea tarea5 = new Tarea("Llamar a mi amigo");

        gestionTareas.agregarTarea(tarea1);
        gestionTareas.agregarTarea(tarea2);
        gestionTareas.agregarTarea(tarea3);
        gestionTareas.agregarTarea(tarea4);
        gestionTareas.agregarTarea(tarea5);

        gestionTareas.tareaCompleta(tarea1);
        gestionTareas.tareaCompleta(tarea3);
        gestionTareas.tareaCompleta(tarea5);

        generacionReportes.generarReporteTareas(gestionTareas.getTareas());
    }
}
