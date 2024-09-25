package kodigo.modulo2.semana1.singleresponsibilityprinciple.gestiondeempleados;

public class Prueba {
    public static void main(String[] args) {
        System.out.println("Aplicando malas practicas");
        GestionEmpleadoYReportes reportes = new GestionEmpleadoYReportes();
        reportes.agregarEmpleados(new Empleado("Juan", 1000));
        reportes.agregarEmpleados(new Empleado("Pedro", 2000));
        reportes.agregarEmpleados(new Empleado("Maria", 3000));
        reportes.generarReportes();

        //Aplicando principios SOLID
        System.out.println("Aplicando principios SOLID");
        GestionEmpleado gestion = new GestionEmpleado();
        gestion.agregarEmpleados(new Empleado("Lucia", 4000));
        gestion.agregarEmpleados(new Empleado("Mario", 4300));

        GenerarReportes reporte = new GenerarReportes();
        reporte.generarReportes(gestion.obtenerEmpleados());
    }
}
