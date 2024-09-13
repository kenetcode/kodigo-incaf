package kodigo.modulo1.semana3.guia1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        double sueldoFinal = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese las horas trabajadas: ");
        int horas = scanner.nextInt();
        System.out.println("Ingrese el sueldo por hora: ");
        double sueldo = scanner.nextDouble();

        sueldoFinal = horas * sueldo;
        if(sueldoFinal <= 150){
            sueldoFinal = sueldoFinal - (sueldoFinal * 0.05);
        } else if (sueldoFinal < 300) {
            sueldoFinal = sueldoFinal - (sueldoFinal * 0.07);
        } else if (sueldoFinal < 450) {
            sueldoFinal = sueldoFinal - (sueldoFinal * 0.09);
        }
        System.out.println("El sueldo final de " + nombre + " es: " + sueldoFinal);
    }
}
