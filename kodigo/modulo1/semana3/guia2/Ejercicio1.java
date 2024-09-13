package kodigo.modulo1.semana3.guia2;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int resultado = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numerador: ");
        int numerador = scanner.nextInt();
        System.out.println("Ingrese el denominador: ");
        int denominador = scanner.nextInt();
        try {
            resultado = numerador / denominador;
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir entre 0");
        }
        System.out.println("El resultado de la división es: " + resultado);
    }
}
