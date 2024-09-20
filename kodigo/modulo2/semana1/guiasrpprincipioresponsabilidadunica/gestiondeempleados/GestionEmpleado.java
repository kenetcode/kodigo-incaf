package kodigo.modulo2.semana1.guiasrpprincipioresponsabilidadunica.gestiondeempleados;

import java.util.ArrayList;
import java.util.List;

public class GestionEmpleado {
    private List<Empleado> empleados;
    //Inicializar la lista de empleados
    public GestionEmpleado() {
        empleados = new ArrayList<>();
    }
    public void agregarEmpleados(Empleado empleado){
        empleados.add(empleado);
    }
    //Se agrego un metodo para mostrar los empleados
    public List<Empleado> obtenerEmpleados(){
        return empleados;
    }
}
