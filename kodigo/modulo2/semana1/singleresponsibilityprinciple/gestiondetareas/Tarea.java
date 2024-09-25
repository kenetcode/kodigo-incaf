package kodigo.modulo2.semana1.singleresponsibilityprinciple.gestiondetareas;

public class Tarea {
    private String descripcion;
    private boolean completada;

    public Tarea(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean getCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }
}
