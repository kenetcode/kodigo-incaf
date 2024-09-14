package kodigo.modulo1.semana4.algoritmosordenamiento;

public class Ejercicio3Estudiante {
    public static void main(String[] args) {
        BuubleSort buubleSort = new BuubleSort();
        Estudiante[] array = {
                new Estudiante("Pedro", 5),
                new Estudiante("Juan", 4.5),
                new Estudiante("Maria", 10),
                new Estudiante("Beto", 6),
        };
        buubleSort.buubleSortObject(array);
        System.out.println("El array ordenado por calificación es: ");
        for(Estudiante estudiante : array){
            System.out.println(estudiante);
        }
    }
}
