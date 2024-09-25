package kodigo.modulo2.semana1.singleresponsibilityprinciple.gestiondeempleados;

import java.util.List;

public class GenerarReportes {

    public void generarReportes(List<Empleado> empleados){
        System.out.println("Informe de empleados");
        for(Empleado em : empleados){
            System.out.println("Nombre: " + em.getNombre() + " Salario: " + em.getSalario());
        }
    }
}
