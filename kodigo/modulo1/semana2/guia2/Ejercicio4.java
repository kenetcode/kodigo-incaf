package kodigo.modulo1.semana2.guia2;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int antiguedad = 0;
        double sueldo = 0, bonoAntiguedad = 0, bonoSueldo = 0, bonoMayor = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la antiguedad del empleado en años:");
        antiguedad = scanner.nextInt();
        System.out.println("Ingrese el sueldo del empleado:");
        sueldo = scanner.nextInt();

        //Por antiguedad
        if (antiguedad > 2 && antiguedad < 5) {
            bonoAntiguedad = sueldo * 0.20;
        } else if (antiguedad >= 5) {
            bonoAntiguedad = sueldo * 0.30;
        }

        //Por sueldo
        if(sueldo < 1000){
            bonoSueldo = sueldo * 0.25;
        } else if (sueldo > 1000 && sueldo <= 3500) {
            bonoSueldo = sueldo * 0.15;
        } else if (sueldo > 3500) {
            bonoSueldo = sueldo * 0.10;
        }
        //asignando el bono mayor
        if(bonoAntiguedad > bonoSueldo){
            bonoMayor = bonoAntiguedad;
        }else{
            bonoMayor = bonoSueldo;
        }
        System.out.println("El bono del empleado es: $" + bonoMayor + " dolares");
    }
}
