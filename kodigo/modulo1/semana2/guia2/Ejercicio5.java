package kodigo.modulo1.semana2.guia2;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        //Viaje de estudios
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de alumnos:");
        int cantidadAlumnos = scanner.nextInt();
        if(cantidadAlumnos > 100){
            System.out.println("El costo por alumno es de $20");
            System.out.println("El costo total del viaje es de $" + (cantidadAlumnos * 20));
        } else if (cantidadAlumnos >= 50 && cantidadAlumnos <= 100) {
            System.out.println("El costo por alumno es de $35");
            System.out.println("El costo total del viaje es de $" + (cantidadAlumnos * 35));
        } else if (cantidadAlumnos >= 20 && cantidadAlumnos <= 49) {
            System.out.println("El costo por alumno es de $40");
            System.out.println("El costo total del viaje es de $" + (cantidadAlumnos * 40));
        } else if (cantidadAlumnos < 20) {
            System.out.println("El costo por alumno es de $70");
            System.out.println("El costo total del viaje es de $" + (cantidadAlumnos * 70));
        }
    }
}
