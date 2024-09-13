package kodigo.modulo1.semana4.algoritmosordenamiento;

public class Ejemplo3 {
    public static void main(String[] args) {
        //Ordenar un array de cadenas alfabéticamente utilizando el método Buuble Sort.
        String[] array = {"banana", "uva", "manzana", "papaya", "limon"};
        BuubleSort burbuja = new BuubleSort();
        burbuja.buubleSortString(array);
        System.out.println("Array ordenado alfabéticamente: ");
        for(String str : array){
            System.out.println(str + " ");
        }
    }
}
