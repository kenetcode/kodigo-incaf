package kodigo.modulo2.semana1.singleresponsibilityprinciple.gestiondetareas;

import java.util.List;

public class GeneracionReportes {
    GestionTareas gestionTareas = new GestionTareas();
    public void generarReporteTareas(List<Tarea> tareas){
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Listado de tareas");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Tareas Completadas");
        System.out.println("----------------------");
        for(Tarea tarea: tareas){
            if(tarea.getCompletada()){
                System.out.println(tarea.getDescripcion());
            }
        }
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Tareas Pendientes");
        System.out.println("----------------------");
        for(Tarea tarea: tareas){
            if(!tarea.getCompletada()){
                System.out.println(tarea.getDescripcion());
            }
        }
    }
}
