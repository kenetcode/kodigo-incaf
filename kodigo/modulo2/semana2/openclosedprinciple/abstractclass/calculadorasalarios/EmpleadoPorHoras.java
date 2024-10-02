package kodigo.modulo2.semana2.openclosedprinciple.abstractclass.calculadorasalarios;

public class EmpleadoPorHoras extends Empleado{

    @Override
    public void calcularSalario(double salarioDia, int horas) {
        int dias = 20; //dias laborales al mes
        double salarioTotal = salarioDia * horas * dias;
        System.out.println("Por Horas-------------------------------------");
        System.out.println("El salario del empleado es de $" + salarioTotal);
    }
}
