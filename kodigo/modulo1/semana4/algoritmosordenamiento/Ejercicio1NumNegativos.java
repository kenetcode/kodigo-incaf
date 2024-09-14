package kodigo.modulo1.semana4.algoritmosordenamiento;

public class Ejercicio1NumNegativos {
    public static void main(String[] args) {
        BuubleSort buubleSort = new BuubleSort();
        double[] array = {-19,-56,-3,-1,-5,-7,-9,-2,-4,-6,-8,-10};
        buubleSort.buubleSortNegativos(array);
        System.out.println("El array ordenado por números negativos en orden ascendente es: ");
        for (double numNegativo : array){
            System.out.println(numNegativo);
        }
    }
}
