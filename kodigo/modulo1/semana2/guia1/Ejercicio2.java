package kodigo.modulo1.semana2.guia1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        //usando casting para convertir un double a int
        int aleatorio = (int)(Math.random() * 100);
        //Ver la mejora del aleatorio en el ejercicio 2 de la semana 1 de sumarle el 1 al * 100
        //por lo que dijo el compañero de que el 0 no se toma en cuenta ni el 100
        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        int intentos = 0;
        while (numero != aleatorio){
            if(intentos == 16){
                System.out.println("Has excedido el número de intentos permitidos");
                break;
            }
            intentos++;
            System.out.print("Ingrese un número: ");
            numero = entrada.nextInt();

            if(numero > aleatorio) {
                System.out.println("Muy alto");
            } else if(numero < aleatorio) {
                System.out.println("Muy bajo");
            }
        }
        System.out.println("¡Felicidades! Adivinaste el número en " + intentos + " intentos \ntu premio es detonas a kike");
    }
}