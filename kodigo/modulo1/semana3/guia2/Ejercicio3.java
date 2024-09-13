package kodigo.modulo1.semana3.guia2;

public class Ejercicio3 {
    private static int[] array;

    public static void main(String[] args) {
        int[] array = {100, 200, 300, 400, 500};
        try {
            int elemento = array[4];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: índice fuera de rango");
        }
    }
}