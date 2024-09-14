package kodigo.modulo1.semana4.algoritmosordenamiento;

public class Ejercicio2Empleado {
    public static void main(String[] args) {
        BuubleSort buubleSort = new BuubleSort();
        Empleado[] array = {
                new Empleado(1000),
                new Empleado(500),
                new Empleado(300),
                new Empleado(200),
                new Empleado(125.7)
        };
        buubleSort.buubleSortObject(array);
        System.out.println("El array ordenado por salario es: ");
        for(Empleado empleado : array){
            System.out.println(empleado);
        }
    }
}
