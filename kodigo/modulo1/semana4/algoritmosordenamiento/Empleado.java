package kodigo.modulo1.semana4.algoritmosordenamiento;

public class Empleado {
    private double salario;
    public void setSalario(double salario){
        this.salario = salario;
    }
    public double getSalario(){
        return salario;
    }
    public Empleado(double salario){
        this.salario = salario;
    }
    @Override
    public String toString(){
        return "Salario: " + salario;
    }
}
