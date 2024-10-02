package kodigo.modulo2.semana2.openclosedprinciple.abstractclass.calculadorasalarios;

public class SistemaSalarios {
    public static void main(String[] args) {
        ServicioSalarios servicio = new ServicioSalarios();
        Empleado empleadoTiempoCompleto = new EmpleadoTiempoCompleto();
        Empleado empleadoPorHoras = new EmpleadoPorHoras();
        servicio.calcularSalario(empleadoTiempoCompleto,20,8);
        servicio.calcularSalario(empleadoPorHoras, 20, 4);
    }
}
