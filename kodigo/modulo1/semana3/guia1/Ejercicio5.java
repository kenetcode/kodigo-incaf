package kodigo.modulo1.semana3.guia1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su calificación: ");
        int calificacion = scanner.nextInt();
        if(calificacion == 10){
            System.out.println("Su calificación es A");
        } else if (calificacion == 9){
            System.out.println("Su calificación es B");
        } else if (calificacion == 8) {
            System.out.println("Su calificación es C");
        } else if (calificacion == 7 || calificacion == 6) {
            System.out.println("Su calificación es D");
        } else if (calificacion >= 0 && calificacion <= 5) {
            System.out.println("Su calificación es F");
        } else {
            System.out.println("Calificación inválida");
        }
    }
}
