package kodigo.modulo2.semana1.singleresponsibilityprinciple.gestiondetareas;

import java.util.ArrayList;
import java.util.List;

public class GestionTareas {
    List<Tarea> tareas = new ArrayList<>();

    public List<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(List<Tarea> tareas) {
        this.tareas = tareas;
    }

    public void agregarTarea(Tarea tarea){
        tareas.add(tarea);
    }
    public void eliminarTarea(Tarea tarea){
        tareas.remove(tarea);
    }
    //Metodo que marca una tarea como completada
    public void tareaCompleta(Tarea tarea){
        tarea.setCompletada(true);
    }
}
