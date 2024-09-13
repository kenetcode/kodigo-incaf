package kodigo.modulo1.semana4.algoritmosordenamiento;

public class Ejercicio4 {
    public static void main(String[] args) {
        //Crear un array de objetos de tipo ObjetoPersona y ordenarlos por edad utilizando el método Buuble Sort.
        //que ordena los objetos de tipo ObjetoPersona por edad.
        ObjetoPersona[] array = {
            new ObjetoPersona("Ana", 30),
            new ObjetoPersona("Luis", 25),
            new ObjetoPersona("Carlos", 35),
        };
        BuubleSort buubleSortObjet = new BuubleSort();
        buubleSortObjet.buubleSortObject(array);
        System.out.println("El array ordenado por edad es: ");
        for(ObjetoPersona persona : array){
            System.out.println(persona);
        }
    }
}
