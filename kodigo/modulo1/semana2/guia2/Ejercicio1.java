package kodigo.modulo1.semana2.guia2;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Cobro de un estacionamiento
        Scanner scanner = new Scanner(System.in);
        int horas = 0, total = 0;
        System.out.println("Por favor ingrese el tiempo de estacionamiento en horas: ");
        horas = scanner.nextInt();
        if(horas <= 0){
            while (horas <= 0) {
                if(horas < 0){
                    System.out.println("Por favor ingrese un valor positivo: ");
                }else if (horas == 0){
                    System.out.println("Por favor ingrese un valor mayor a 0: ");
                }
                horas = scanner.nextInt();
            }
        }
        if(horas <= 2) {
            total = horas * 5;
        } else if(horas <= 5) {
            total = 2 * 5 + (horas - 2) * 4;
        } else if(horas <= 10) {
            total = 2 * 5 + 3 * 4 + (horas - 5) * 3;
        } else{
            //cuando horas > 10
            total = 2 * 5 + 3 * 4 + 5 * 3 + (horas - 10) * 2;
        }
        System.out.println("El total a pagar es: " + total);
    }
}
