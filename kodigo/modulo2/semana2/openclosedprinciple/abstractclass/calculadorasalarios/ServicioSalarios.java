package kodigo.modulo2.semana2.openclosedprinciple.abstractclass.calculadorasalarios;

public class ServicioSalarios {
    public void calcularSalario(Empleado empleado, double salarioDia, int horas){
        empleado.calcularSalario(salarioDia,horas);
    }
}
