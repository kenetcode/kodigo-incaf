package kodigo.modulo1.semana3.guia2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        String entrada = scanner.nextLine();
        try{
            int numero = Integer.parseInt(entrada);
            System.out.println("El número es: " + numero);
        } catch (NumberFormatException e){
            System.out.println("Error: la entrada no es un valor valido");
        }
    }
}
