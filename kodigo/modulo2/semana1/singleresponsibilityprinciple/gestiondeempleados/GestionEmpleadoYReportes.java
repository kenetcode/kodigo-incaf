package kodigo.modulo2.semana1.singleresponsibilityprinciple.gestiondeempleados;

import java.util.ArrayList;
import java.util.List;

public class GestionEmpleadoYReportes {
    private List<Empleado> empleados;
    //Inicializar la lista de empleados
    public GestionEmpleadoYReportes() {
        empleados = new ArrayList<>();
    }
    public void agregarEmpleados(Empleado empleado){
        empleados.add(empleado);
    }
    public void generarReportes(){
        System.out.println("Informe de empleados");
        for(Empleado em : empleados){
            System.out.println("Nombre: " + em.getNombre() + " Salario: " + em.getSalario());
        }
    }
}
